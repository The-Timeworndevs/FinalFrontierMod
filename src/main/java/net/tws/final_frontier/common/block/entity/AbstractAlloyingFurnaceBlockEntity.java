package net.tws.final_frontier.common.block.entity;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeCraftingHolder;
import net.minecraft.world.inventory.StackedContentsCompatible;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.tws.final_frontier.common.recipe.AlloyingRecipe;
import net.tws.final_frontier.common.recipe.AlloyingRecipeInput;

import java.util.Map;
import java.util.Objects;

public abstract class AbstractAlloyingFurnaceBlockEntity extends BaseContainerBlockEntity implements WorldlyContainer, StackedContentsCompatible, RecipeCraftingHolder {
    protected static final int SLOT_INPUT1 = 0;
    protected static final int SLOT_INPUT2 = 1;
    protected static final int SLOT_FUEL = 2;
    protected static final int SLOT_OUTPUT = 3;
    public static final int DATA_LIT_TIME = 0;
    public static final int DATA_LIT_DURATION = 0;
    public static final int DATA_COOKING_PROGRESS = 2;
    public static final int DATA_COOKING_TOTAL_TIME = 3;
    public static final int NUM_DATA_VALUES = 4;
    public static final int BURN_TIME_STANDARD = 200;
    public static final int BURN_COOL_SPEED = 2;
    private static final Codec<Map<ResourceKey<Recipe<?>>, Integer>> RECIPES_USED_CODEC;
    private static final short DEFAULT_COOKING_TIMER = 0;
    private static final short DEFAULT_COOKING_TOTAL_TIME = 0;
    private static final short DEFAULT_LIT_TIME_REMAINING = 0;
    private static final short DEFAULT_LIT_TOTAL_TIME = 0;
    protected NonNullList<ItemStack> items;
    private int litTimeRemaining;
    private int litTotalTime;
    private int cookingTimer;
    private int cookingTotalTime;
    protected final ContainerData dataAccess;
    private final Reference2IntOpenHashMap<ResourceKey<Recipe<?>>> recipesUsed;
    private final RecipeManager.CachedCheck<AlloyingRecipeInput, ? extends AlloyingRecipe> quickCheck;

    protected AbstractAlloyingFurnaceBlockEntity(final BlockEntityType<?> type, final BlockPos worldPosition, final BlockState blockState, final RecipeType<? extends AlloyingRecipe> recipeType) {
        super(type, worldPosition, blockState);
        this.items = NonNullList.withSize(4, ItemStack.EMPTY);
        this.dataAccess = new ContainerData() {
            {
                Objects.requireNonNull(AbstractAlloyingFurnaceBlockEntity.this);
            }

            public int get(final int dataID) {
                switch (dataID) {
                    case 0 -> {
                        return AbstractAlloyingFurnaceBlockEntity.this.litTimeRemaining;
                    }
                    case 1 -> {
                        return AbstractAlloyingFurnaceBlockEntity.this.litTotalTime;
                    }
                    case 2 -> {
                        return AbstractAlloyingFurnaceBlockEntity.this.cookingTimer;
                    }
                    case 3 -> {
                        return AbstractAlloyingFurnaceBlockEntity.this.cookingTotalTime;
                    }
                    default -> {
                        return 0;
                    }
                }
            }

            public void set(final int dataID, final int value) {
                switch (dataID) {
                    case 0 -> AbstractAlloyingFurnaceBlockEntity.this.litTimeRemaining = value;
                    case 1 -> AbstractAlloyingFurnaceBlockEntity.this.litTotalTime = value;
                    case 2 -> AbstractAlloyingFurnaceBlockEntity.this.cookingTimer = value;
                    case 3 -> AbstractAlloyingFurnaceBlockEntity.this.cookingTotalTime = value;
                }
            }

            public int getCount() {
                return 4;
            }
        };
        this.recipesUsed = new Reference2IntOpenHashMap();
        this.quickCheck = RecipeManager.createCheck(recipeType);
    }

    protected void loadAdditional(final ValueInput input) {
        super.loadAdditional(input);
        this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        ContainerHelper.loadAllItems(input, this.items);
        this.cookingTimer = input.getShortOr("cooking_time_spent", (short) 0);
        this.cookingTotalTime = input.getShortOr("cooking_total_time", (short) 0);
        this.litTimeRemaining = input.getShortOr("lit_time_remaining", (short) 0);
        this.litTotalTime = input.getShortOr("lit_total_time", (short) 0);
        this.recipesUsed.clear();
        this.recipesUsed.putAll((Map) input.read("RecipesUsed", RECIPES_USED_CODEC).orElse(Map.of()));
    }

    @Override
    protected void saveAdditional(final ValueOutput output) {
        super.saveAdditional(output);
        output.putShort("cooking_time_spent", (short)this.cookingTimer);
        output.putShort("cooking_total_time", (short)this.cookingTotalTime);
        output.putShort("lit_time_remaining", (short)this.litTimeRemaining);
        output.putShort("lit_total_time", (short)this.litTotalTime);
        ContainerHelper.saveAllItems(output, this.items);
        output.store("RecipesUsed", RECIPES_USED_CODEC, this.recipesUsed);
    }

    public static void serverTick(final ServerLevel level, final BlockPos pos, BlockState state, final AbstractAlloyingFurnaceBlockEntity entity) {
        boolean changed = false;
        boolean isLit;
        boolean wasLit;
        if (entity.litTimeRemaining > 0) {
            wasLit = true;
            --entity.litTimeRemaining;
            isLit = entity.litTimeRemaining > 0;
        } else {
            wasLit = false;
            isLit = false;
        }

        ItemStack fuel = (ItemStack) entity.items.get(2);
        ItemStack ingredient1 = (ItemStack) entity.items.get(1);
        ItemStack ingredient2 = (ItemStack) entity.items.get(3);
        boolean hasIngredient = !ingredient1.isEmpty() && !ingredient2.isEmpty();
        boolean hasFuel = !fuel.isEmpty();
        if (isLit || hasFuel && hasIngredient) {
            if (hasIngredient) {
                AlloyingRecipeInput input = new AlloyingRecipeInput(ingredient1, ingredient2);
                RecipeHolder<? extends AlloyingRecipe> recipe = (RecipeHolder) entity.quickCheck.getRecipeFor(input, level).orElse((Object) null);
            }
        }
    }
}
