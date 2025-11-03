package net.timeworndevs.final_frontier.common;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.timeworndevs.final_frontier.Main;

public class FFGroups {

    public static final ResourceKey<CreativeModeTab> FF_BUILDING_BLOCKS_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "building_blocks"));
    public static final CreativeModeTab FF_BUILDING_BLOCKS = FabricItemGroup.builder().icon(()-> new ItemStack(FFBlocks.KEVLAR_BLOCK.asItem())).title(Component.translatable("itemGroup.final_frontier.ff_building_blocks")).build();
    public static final ResourceKey<CreativeModeTab> FF_NATURAL_BLOCKS_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "natural_blocks"));
    public static final CreativeModeTab FF_NATURAL_BLOCKS = FabricItemGroup.builder().icon(()-> new ItemStack(FFBlocks.HIGHLANDS_REGOLITH.asItem())).title(Component.translatable("itemGroup.final_frontier.ff_natural_blocks")).build();
    public static final ResourceKey<CreativeModeTab> FF_MATERIALS_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "materials"));
    public static final CreativeModeTab FF_MATERIALS = FabricItemGroup.builder().icon(()-> new ItemStack(FFItems.KEVLAR_FABRIC)).title(Component.translatable("itemGroup.final_frontier.ff_materials")).build();

    public static  void init() {

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, FF_BUILDING_BLOCKS_KEY, FF_BUILDING_BLOCKS);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, FF_NATURAL_BLOCKS_KEY, FF_NATURAL_BLOCKS);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, FF_MATERIALS_KEY, FF_MATERIALS);

        ItemGroupEvents.modifyEntriesEvent(FF_BUILDING_BLOCKS_KEY).register((entries) -> {
            entries.accept(FFBlocks.KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.WHITE_KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.LIGHT_GRAY_KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.GRAY_KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.BLACK_KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.BROWN_KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.RED_KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.ORANGE_KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.YELLOW_KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.LIME_KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.GREEN_KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.LIGHT_BLUE_KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.CYAN_KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.BLUE_KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.PURPLE_KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.MAGENTA_KEVLAR_BLOCK.asItem());
            entries.accept(FFBlocks.PINK_KEVLAR_BLOCK.asItem());
        });

        ItemGroupEvents.modifyEntriesEvent(FF_NATURAL_BLOCKS_KEY).register((entries)-> {
            entries.accept(FFBlocks.HIGHLANDS_REGOLITH.asItem());
            entries.accept(FFBlocks.MARIA_REGOLITH.asItem());
            entries.accept(FFBlocks.MOONSTONE.asItem());
            entries.accept(FFBlocks.MOONSTONE_IRON_ORE.asItem());
            entries.accept(FFBlocks.MOONSTONE_GOLD_ORE.asItem());
            entries.accept(FFBlocks.MOONSTONE_COPPER_ORE.asItem());
            entries.accept(FFBlocks.MOONSTONE_DIAMOND_ORE.asItem());
            entries.accept(FFBlocks.KOMATIITE.asItem());
            entries.accept(FFBlocks.SUBCINDER.asItem());
            entries.accept(FFBlocks.SUBCINDER_IRON_ORE.asItem());
            entries.accept(FFBlocks.SUBCINDER_GOLD_ORE.asItem());
            entries.accept(FFBlocks.SUBCINDER_COPPER_ORE.asItem());
            entries.accept(FFBlocks.SUBCINDER_DIAMOND_ORE.asItem());
            entries.accept(FFBlocks.PYROXENITE.asItem());
        });

        ItemGroupEvents.modifyEntriesEvent(FF_MATERIALS_KEY).register((entries) -> {
            entries.accept(FFItems.KEVLAR_FABRIC);
        });

    }
}
