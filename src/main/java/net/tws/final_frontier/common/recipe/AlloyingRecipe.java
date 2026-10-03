package net.tws.final_frontier.common.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.tws.final_frontier.common.init.FFRecipes;

public class AlloyingRecipe implements Recipe<AlloyingRecipeInput> {
    private final Ingredient input1;
    private final Ingredient input2;
    private final int cookingTime;
    private final float experience;
    private final ItemStackTemplate result;

    public  AlloyingRecipe(Ingredient input1, Ingredient input2, final int cookingTime, final float experience, ItemStackTemplate result) {
        this.input1 = input1;
        this.input2 = input2;
        this.cookingTime = cookingTime;
        this.experience = experience;
        this.result = result;
    }

    public Ingredient getInput1() {
        return input1;
    }

    public Ingredient getInput2() {
        return input2;
    }

    public int getCookingTime() {return cookingTime;}

    public float getExperience() {return experience;}

    public ItemStackTemplate getResult() {
        return result;
    }

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
        return true;
    }

    @Override
    public String group() {
        return "alloying";
    }

    @Override
    public PlacementInfo placementInfo() {
        return PlacementInfo.NOT_PLACEABLE;
    }

    @Override
    public RecipeBookCategory recipeBookCategory() {
        return null;
    }

    @Override
    public RecipeSerializer<? extends Recipe<AlloyingRecipeInput>> getSerializer() {
        return FFRecipes.ALLOYING_RECIPE_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<AlloyingRecipeInput>> getType() {
        return FFRecipes.ALLOYING_RECIPE_TYPE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    public static final MapCodec<AlloyingRecipe> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    Ingredient.CODEC.fieldOf("input1").forGetter(AlloyingRecipe::getInput1),
                    Ingredient.CODEC.fieldOf("input2").forGetter(AlloyingRecipe::getInput2),
                    Codec.INT.optionalFieldOf("cookingtime", 200).forGetter(AlloyingRecipe::getCookingTime),
                    Codec.FLOAT.optionalFieldOf("experience", 0.0f).forGetter(AlloyingRecipe::getExperience),
                    ItemStackTemplate.CODEC.fieldOf("result").forGetter(AlloyingRecipe::getResult)
            ).apply(instance, AlloyingRecipe::new)
    );

    public static final StreamCodec<RegistryFriendlyByteBuf, AlloyingRecipe> STREAM_CODEC = StreamCodec.composite(
            Ingredient.CONTENTS_STREAM_CODEC,
            AlloyingRecipe::getInput1,
            Ingredient.CONTENTS_STREAM_CODEC,
            AlloyingRecipe::getInput2,
            ByteBufCodecs.INT,
            AlloyingRecipe::getCookingTime,
            ByteBufCodecs.FLOAT,
            AlloyingRecipe::getExperience,
            ItemStackTemplate.STREAM_CODEC,
            AlloyingRecipe::getResult,
            AlloyingRecipe::new
    );

}
