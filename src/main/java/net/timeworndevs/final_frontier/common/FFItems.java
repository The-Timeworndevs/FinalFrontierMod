package net.timeworndevs.final_frontier.common;


import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.timeworndevs.final_frontier.Main;

import java.util.function.Function;

public class FFItems {



    public static Item register(String name, Function<Item.Properties, Item> factory, Item.Properties settings) {

        ResourceKey<Item> itemkey = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, name));

        Item item = factory.apply(settings);

        Registry.register(BuiltInRegistries.ITEM, itemkey, item);

        return item;
    }

    public static final Item DURAFABRIC = register("durafabric", Item::new, new Item.Properties().fireResistant());

    public static void init(){

    }

}
