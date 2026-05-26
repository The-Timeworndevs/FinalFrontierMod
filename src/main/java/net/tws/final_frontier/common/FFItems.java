package net.tws.final_frontier.common;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tws.final_frontier.FFMain;

public class FFItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FFMain.MODID);

    public static final DeferredItem<Item> DURAFABRIC = ITEMS.registerSimpleItem("durafabric", new Item.Properties());
    public static final DeferredItem<Item> RAW_BAUXITE = ITEMS.registerSimpleItem("raw_bauxite", new Item.Properties());
    public static final DeferredItem<Item> ALUMINUM_NUGGET = ITEMS.registerSimpleItem("aluminum_nugget", new Item.Properties());
    public static final DeferredItem<Item> ALUMINUM_INGOT = ITEMS.registerSimpleItem("aluminum_ingot", new Item.Properties());

}
