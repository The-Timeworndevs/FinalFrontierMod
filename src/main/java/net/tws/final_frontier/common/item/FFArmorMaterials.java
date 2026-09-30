package net.tws.final_frontier.common.item;

import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorMaterials;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.tws.final_frontier.Main;

public class FFArmorMaterials {

    public static final ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> OLIVINE_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(Main.MOD_ID, "olivine"));

    public static final ArmorMaterial OLIVINE = new ArmorMaterial(28, ArmorMaterials.makeDefense(3, 6, 8, 3, 11), 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, FFItemTags.OLIVINE_TOOL_MATERIALS, OLIVINE_KEY);

}
