package net.tws.final_frontier.common.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.tws.final_frontier.Main;

import java.util.function.Function;

public class FFItems {

    public static final Item DURAFABRIC = registerItem("durafabric", Item::new);
    public static final Item ALUMINUM_INGOT = registerItem("aluminum_ingot", Item::new);
    public static final Item RAW_ALUMINA = registerItem("raw_alumina", Item::new);
    public static final Item ALUMINUM_NUGGET = registerItem("aluminum_nugget", Item::new);

    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }

    public static void init() {
        Main.LOGGER.info("Item Registry Successful");
    }
}
