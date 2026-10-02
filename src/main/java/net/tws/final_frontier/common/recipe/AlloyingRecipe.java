package net.tws.final_frontier.common.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public class AlloyingRecipe implements Recipe<AlloyingRecipeInput> {
    private final Ingredient input1;
    private final Ingredient input2;
    private final ItemStackTemplate result;

    public  AlloyingRecipe(Ingredient input1, Ingredient input2, ItemStackTemplate result) {
        this.input1 = input1;
        this.input2 = input2;
        this.result = result;
    }

    public ItemStackTemplate getResult() {
        return result;
    }

    public Ingredient getInput1() {
        return input1;
    }

    public Ingredient getInput2() {
        return input2;
    }

    public static final MapCodec<AlloyingRecipe> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    ItemStackTemplate.CODEC.fieldOf("result").forGetter(AlloyingRecipe::getResult),
                    Ingredient.CODEC.fieldOf("input1").forGetter(AlloyingRecipe::getInput1),
                    Ingredient.CODEC.fieldOf("input2").forGetter(AlloyingRecipe::getInput2)
            ).apply(instance, AlloyingRecipe::new)
    );

    @Override
    public boolean matches(AlloyingRecipeInput input, Level level) {
        return this.input1.test(input.ingredient1()) && this.input2.test(input.ingredient2());
    }

    @Override
    public ItemStack assemble(AlloyingRecipeInput input) {
        return this.result.create();
    }

    @Override
    public boolean showNotification() {
        return false;
    }

    @Override
    public String group() {
        return "";
    }

    @Override
    public RecipeSerializer<? extends Recipe<AlloyingRecipeInput>> getSerializer() {
        return null;
    }

    @Override
    public RecipeType<? extends Recipe<AlloyingRecipeInput>> getType() {
        return null;
    }

    @Override
    public PlacementInfo placementInfo() {
        return null;
    }

    @Override
    public RecipeBookCategory recipeBookCategory() {
        return null;
    }


}
