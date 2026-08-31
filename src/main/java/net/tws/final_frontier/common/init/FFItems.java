package net.tws.final_frontier.common.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tws.final_frontier.FinalFrontier;

public class FFItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FinalFrontier.MODID);

    public static final DeferredItem<Item> DURAFABRIC = ITEMS.registerSimpleItem("durafabric");
    public static final DeferredItem<Item> RAW_ALUMINA = ITEMS.registerSimpleItem("raw_alumina");
    public static final DeferredItem<Item> ALUMINUM_NUGGET = ITEMS.registerSimpleItem("aluminum_nugget");
    public static final DeferredItem<Item> ALUMINUM_INGOT = ITEMS.registerSimpleItem("aluminum_ingot");


    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
