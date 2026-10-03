package net.tws.final_frontier.common.init;

import net.fabricmc.fabric.api.recipe.v1.sync.RecipeSynchronization;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.tws.final_frontier.Main;
import net.tws.final_frontier.common.recipe.AlloyingRecipe;

public class FFRecipes {

    public static final RecipeSerializer<AlloyingRecipe> ALLOYING_RECIPE_SERIALIZER = Registry.register(
            BuiltInRegistries.RECIPE_SERIALIZER,
            Main.id("alloying"),
            new RecipeSerializer<>(AlloyingRecipe.CODEC, AlloyingRecipe.STREAM_CODEC));

    public static final RecipeType<AlloyingRecipe> ALLOYING_RECIPE_TYPE = Registry.register(
            BuiltInRegistries.RECIPE_TYPE,
            Main.id("alloying"),
            new RecipeType<AlloyingRecipe>() { });

    public static void init() {
        RecipeSynchronization.synchronizeRecipeSerializer(ALLOYING_RECIPE_SERIALIZER);
        Main.LOGGER.info("Initialized and Synchronized recipes");
    }
}
