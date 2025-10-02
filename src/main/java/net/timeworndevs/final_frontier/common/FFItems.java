package net.timeworndevs.final_frontier.common;


import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.timeworndevs.final_frontier.Main;

import java.util.function.Function;

public class FFItems {

    public static Item register(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {

        RegistryKey<Item> itemkey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Main.MOD_ID, name));

        Item item = factory.apply(settings.registryKey(itemkey));

        Registry.register(Registries.ITEM, itemkey, item);

        return item;
    }

    public static final Item KEVLAR_FABRIC = register("kevlar_fabric", Item::new, new Item.Settings().fireproof());

    public static void init(){

    }

}
