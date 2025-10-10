package net.timeworndevs.final_frontier.common;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.timeworndevs.final_frontier.Main;

public class FFGroups {

    public static final RegistryKey<ItemGroup> FF_BUILDING_BLOCKS_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Main.MOD_ID, "building_blocks"));
    public static final ItemGroup FF_BUILDING_BLOCKS = FabricItemGroup.builder().icon(()-> new ItemStack(FFBlocks.KEVLAR_BLOCK.asItem())).displayName(Text.translatable("itemGroup.final_frontier.ff_building_blocks")).build();
    public static final RegistryKey<ItemGroup> FF_NATURAL_BLOCKS_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Main.MOD_ID, "natural_blocks"));
    public static final ItemGroup FF_NATURAL_BLOCKS = FabricItemGroup.builder().icon(()-> new ItemStack(FFBlocks.HIGHLANDS_REGOLITH.asItem())).displayName(Text.translatable("itemGroup.final_frontier.ff_natural_blocks")).build();
    public static final RegistryKey<ItemGroup> FF_MATERIALS_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Main.MOD_ID, "materials"));
    public static final ItemGroup FF_MATERIALS = FabricItemGroup.builder().icon(()-> new ItemStack(FFItems.KEVLAR_FABRIC)).displayName(Text.translatable("itemGroup.final_frontier.ff_materials")).build();

    public static  void init() {

        Registry.register(Registries.ITEM_GROUP, FF_BUILDING_BLOCKS_KEY, FF_BUILDING_BLOCKS);
        Registry.register(Registries.ITEM_GROUP, FF_NATURAL_BLOCKS_KEY, FF_NATURAL_BLOCKS);
        Registry.register(Registries.ITEM_GROUP, FF_MATERIALS_KEY, FF_MATERIALS);

        ItemGroupEvents.modifyEntriesEvent(FF_BUILDING_BLOCKS_KEY).register((entries) -> {
            entries.add(FFBlocks.KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.WHITE_KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.LIGHT_GRAY_KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.GRAY_KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.BLACK_KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.BROWN_KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.RED_KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.ORANGE_KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.YELLOW_KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.LIME_KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.GREEN_KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.LIGHT_BLUE_KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.CYAN_KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.BLUE_KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.PURPLE_KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.MAGENTA_KEVLAR_BLOCK.asItem());
            entries.add(FFBlocks.PINK_KEVLAR_BLOCK.asItem());
        });

        ItemGroupEvents.modifyEntriesEvent(FF_NATURAL_BLOCKS_KEY).register((entries)-> {
            entries.add(FFBlocks.HIGHLANDS_REGOLITH.asItem());
            entries.add(FFBlocks.MARIA_REGOLITH.asItem());
            entries.add(FFBlocks.MOONSTONE.asItem());
            entries.add(FFBlocks.MOONSTONE_IRON_ORE.asItem());
            entries.add(FFBlocks.MOONSTONE_GOLD_ORE.asItem());
            entries.add(FFBlocks.MOONSTONE_COPPER_ORE.asItem());
            entries.add(FFBlocks.MOONSTONE_DIAMOND_ORE.asItem());
            entries.add(FFBlocks.KOMATIITE.asItem());
            entries.add(FFBlocks.SUBCINDER.asItem());
            entries.add(FFBlocks.SUBCINDER_IRON_ORE.asItem());
            entries.add(FFBlocks.SUBCINDER_GOLD_ORE.asItem());
            entries.add(FFBlocks.SUBCINDER_COPPER_ORE.asItem());
            entries.add(FFBlocks.SUBCINDER_DIAMOND_ORE.asItem());
            entries.add(FFBlocks.PYROXENITE.asItem());
        });

        ItemGroupEvents.modifyEntriesEvent(FF_MATERIALS_KEY).register((entries) -> {
            entries.add(FFItems.KEVLAR_FABRIC);
        });

    }
}
