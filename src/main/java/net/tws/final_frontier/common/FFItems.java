package net.tws.final_frontier.common;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tws.final_frontier.FFMain;

public class FFItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FFMain.MODID);

    public static final DeferredItem<Item> DURAFABRIC = ITEMS.registerSimpleItem("durafabric", new Item.Properties());

}
