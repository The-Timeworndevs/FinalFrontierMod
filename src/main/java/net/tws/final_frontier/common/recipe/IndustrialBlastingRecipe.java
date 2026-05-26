package net.tws.final_frontier.common.recipe;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;

public class IndustrialBlastingRecipe extends AbstractCookingRecipe {
    public IndustrialBlastingRecipe(RecipeType<?> type, String group, CookingBookCategory category, Ingredient ingredient, ItemStack result, float experience, int cookingTime) {
        super(type, group, category, ingredient, result, experience, cookingTime);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return null;
    }
}
