package net.tws.final_frontier.common.recipe;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeInput;

import java.util.List;

public record DoubleRecipeInput(ItemStack item1, ItemStack item2) implements RecipeInput {
    @Override
    public ItemStack getItem(int index) {
        if (index == 0) {
            return item1;
        }
        return item2;
    }

    @Override
    public int size() {
        return 1;
    }
}
