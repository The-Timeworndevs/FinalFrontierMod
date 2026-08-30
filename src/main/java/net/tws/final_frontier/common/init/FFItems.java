package net.tws.final_frontier.common.init;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tws.final_frontier.FinalFrontier;

public class FFItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FinalFrontier.MODID);

    public static final DeferredItem<Item> DURAFABRIC = ITEMS.registerSimpleItem("durafabric", new Item.Properties());
    public static final DeferredItem<Item> RAW_ALUMINA = ITEMS.registerSimpleItem("raw_alumina", new Item.Properties());
    public static final DeferredItem<Item> ALUMINUM_NUGGET = ITEMS.registerSimpleItem("aluminum_nugget", new Item.Properties());
    public static final DeferredItem<Item> ALUMINUM_INGOT = ITEMS.registerSimpleItem("aluminum_ingot", new Item.Properties());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
