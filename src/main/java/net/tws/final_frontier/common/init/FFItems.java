package net.tws.final_frontier.common.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.equipment.ArmorType;
import net.tws.final_frontier.Main;
import net.tws.final_frontier.common.item.FFArmorMaterials;
import net.tws.final_frontier.common.item.FFToolMaterials;

import java.util.function.Function;

public class FFItems {

    //materials
    public static final Item DURAFABRIC = registerItem("durafabric", Item::new);
    public static final Item OLIVINE = registerItem("olivine", Item::new);
    public static final Item IRON_ROD = registerItem("iron_rod", Item::new);
    public static final Item ALUMINUM_INGOT = registerItem("aluminum_ingot", Item::new);
    public static final Item RAW_ALUMINA = registerItem("raw_alumina", Item::new);
    public static final Item ALUMINUM_NUGGET = registerItem("aluminum_nugget", Item::new);

    //tools
    public static final Item OLIVINE_SHOVEL = registerItem("olivine_shovel", properties -> new ShovelItem(FFToolMaterials.OLIVINE, 1.5f, -2.0f, properties));
    public static final Item OLIVINE_PICKAXE = registerItem("olivine_pickaxe", properties -> new Item(properties.pickaxe(FFToolMaterials.OLIVINE, 1.0f, -2.8f)));
    public static final Item OLIVINE_AXE = registerItem("olivine_axe", properties -> new AxeItem(FFToolMaterials.OLIVINE, 5.0F, -3.0F, properties));
    public static final Item OLIVINE_HOE = registerItem("olivine_hoe", properties -> new HoeItem(FFToolMaterials.OLIVINE, -3.0f, 0.0f, properties));

    //weapons and armor
    public static final Item OLIVINE_SWORD = registerItem("olivine_sword", properties -> new Item(properties.sword(FFToolMaterials.OLIVINE, 3.0F, -2.4F)));
    public static final Item OLIVINE_SPEAR = registerItem("olivine_spear", properties -> new Item(properties.spear(FFToolMaterials.OLIVINE, 1.05F, 1.075F, 0.5F, 3.0F, 10.0F, 6.5F, 5.1F, 10.0F, 4.6F)));

    public static final Item OLIVINE_HELMET = registerItem("olivine_helmet", properties -> new Item(properties.humanoidArmor(FFArmorMaterials.OLIVINE, ArmorType.HELMET)));
    public static final Item OLIVINE_CHESTPLATE = registerItem("olivine_chestplate", properties -> new Item(properties.humanoidArmor(FFArmorMaterials.OLIVINE, ArmorType.CHESTPLATE)));
    public static final Item OLIVINE_LEGGINGS = registerItem("olivine_leggings", properties -> new Item(properties.humanoidArmor(FFArmorMaterials.OLIVINE, ArmorType.LEGGINGS)));
    public static final Item OLIVINE_BOOTS = registerItem("olivine_boots", properties -> new Item(properties.humanoidArmor(FFArmorMaterials.OLIVINE, ArmorType.BOOTS)));

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
