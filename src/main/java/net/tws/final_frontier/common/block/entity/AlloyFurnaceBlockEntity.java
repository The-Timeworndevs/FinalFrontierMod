package net.tws.final_frontier.common.block.entity;

import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import net.fabricmc.fabric.api.menu.v1.ExtendedMenuProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.tws.final_frontier.common.init.FFBlockEntities;
import net.tws.final_frontier.common.init.FFRecipes;
import net.tws.final_frontier.common.recipe.AlloyingRecipe;
import net.tws.final_frontier.common.recipe.AlloyingRecipeInput;
import org.jspecify.annotations.NonNull;

public class AlloyFurnaceBlockEntity extends BaseContainerBlockEntity implements ExtendedMenuProvider<BlockPos> {
    private static final Component DEFAULT_NAME = Component.translatable("container.final_frontier.alloy_furnace");
    private final short DEFAULT_LIT_TIME_REMAINING = 0;
    private final short DEFAULT_LIT_TOTAL_TIME = 0;
    private NonNullList<ItemStack> items;
    private final ContainerData data;
    private int litTimeRemaining;
    private int litTotalTime;
    private int cookingTimer;
    private int cookingTotalTime;
    private float speedMultiplier;
    private final int INPUT_SLOT_1 = 0;
    private final int INPUT_SLOT_2 = 1;
    private final int FUEL_SLOT = 2;
    private final int OUTPUT_SLOT = 3;
    public final int CONTAINER_SIZE = 4;
    private final RecipeManager.CachedCheck<AlloyingRecipeInput, AlloyingRecipe> quickCheck = RecipeManager.createCheck(FFRecipes.ALLOYING_RECIPE_TYPE);
    private final Reference2IntOpenHashMap<ResourceKey<Recipe<?>>> recipesUsed;

    public AlloyFurnaceBlockEntity(final  BlockPos WorldPosition, final BlockState BlockState) {
        super(FFBlockEntities.ALLOY_FURNACE_BE, WorldPosition, BlockState);
        this.recipesUsed = new  Reference2IntOpenHashMap<>();
        this.data = new ContainerData() {

            public int get(final int dataID) {
                switch (dataID) {
                    case 0-> {
                        return litTimeRemaining;
                    }
                    case 1-> {
                        return litTotalTime;
                    }
                    case 2-> {
                        return cookingTimer;
                    }
                    case 3-> {
                        return cookingTotalTime;
                    }
                    default -> {
                        return 0;
                    }
                }
            }

            public void set(final int dataID, final int value) {
                switch (dataID) {
                    case 0-> litTimeRemaining = value;
                    case 1-> litTotalTime = value;
                    case 2-> cookingTimer = value;
                    case 3-> cookingTotalTime = value;
                }
            }

            public int getCount() {
                return 4;
            }
        };

        items = NonNullList.withSize(CONTAINER_SIZE, ItemStack.EMPTY);
    }

    @Override
    public @NonNull Component getDisplayName() {
        return Component.translatable("container.final_frontier.alloy_furnace");
    }

    @Override
    protected @NonNull Component getDefaultName() {
        return DEFAULT_NAME;
    }

    @Override
    protected @NonNull NonNullList<ItemStack> getItems() {
        return items;
    }

    @Override
    protected void setItems(@NonNull NonNullList<ItemStack> items) {
        this.items = items;
    }

    @Override
    protected AbstractContainerMenu createMenu(int containerId, Inventory inventory) {
        return null;
    }

    @Override
    protected void saveAdditional(ValueOutput output) {
        super.saveAdditional(output);
        output.putInt("alloy_furnace.progress", cookingTimer);
        output.putInt("alloy_furnace.max_progress", cookingTotalTime);

        ContainerHelper.saveAllItems(output, this.items);
    }

    @Override
    protected void loadAdditional(ValueInput input) {
        super.loadAdditional(input);
        cookingTimer = input.getIntOr("alloy_furnace.progress", 0);
        cookingTotalTime = input.getIntOr("alloy_furnace.max_progress", 124);

        ContainerHelper.loadAllItems(input, this.items);
    }


    @Override
    public BlockPos getScreenOpeningData(ServerPlayer player) {
        return null;
    }

    @Override
    public int getContainerSize() {
        return 0;
    }
}
