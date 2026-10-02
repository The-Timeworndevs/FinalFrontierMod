package net.tws.final_frontier.common.recipe;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeInput;

public record AlloyingRecipeInput(ItemStack ingredient1, ItemStack ingredient2) implements RecipeInput {

    @Override
    public ItemStack getItem(int index) {
        return switch (index){
            case  0 -> ingredient1;
            case 1 -> ingredient2;
            default ->  ItemStack.EMPTY;
        };
    }

    @Override
    public int size() {
        return 3;
    }
}
