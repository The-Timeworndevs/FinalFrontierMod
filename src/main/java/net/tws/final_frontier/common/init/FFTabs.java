package net.tws.final_frontier.common.init;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.tws.final_frontier.Main;

public class FFTabs {

    public static final ResourceKey<CreativeModeTab> FF_BUILDING_BLOCKS_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Main.MOD_ID, "ff_building_blocks"));
    public static final CreativeModeTab FF_BUILDING_BLOCKS = FabricCreativeModeTab.builder().icon(()-> new ItemStack(FFBlocks.POLISHED_KOMATIITE)).title(Component.translatable("itemGroup.final_frontier.ff_building_blocks")).displayItems((parameters, output) -> {
        output.accept(FFBlocks.MOONSTONE.asItem());
        output.accept(FFBlocks.MOONSTONE_STAIRS.asItem());
        output.accept(FFBlocks.MOONSTONE_SLAB.asItem());
        output.accept(FFBlocks.MOONSTONE_WALL.asItem());
        output.accept(FFBlocks.CHISELED_POLISHED_MOONSTONE.asItem());
        output.accept(FFBlocks.POLISHED_MOONSTONE.asItem());
        output.accept(FFBlocks.POLISHED_MOONSTONE_STAIRS.asItem());
        output.accept(FFBlocks.POLISHED_MOONSTONE_SLAB.asItem());
        output.accept(FFBlocks.POLISHED_MOONSTONE_WALL.asItem());
        output.accept(FFBlocks.POLISHED_MOONSTONE_PRESSURE_PLATE.asItem());
        output.accept(FFBlocks.POLISHED_MOONSTONE_BUTTON.asItem());
        output.accept(FFBlocks.MOONSTONE_BRICKS.asItem());
        output.accept(FFBlocks.CRACKED_MOONSTONE_BRICKS.asItem());
        output.accept(FFBlocks.MOONSTONE_BRICKS_STAIRS.asItem());
        output.accept(FFBlocks.MOONSTONE_BRICKS_SLAB.asItem());
        output.accept(FFBlocks.MOONSTONE_BRICKS_WALL.asItem());
        output.accept(FFBlocks.KOMATIITE.asItem());
        output.accept(FFBlocks.KOMATIITE_STAIRS.asItem());
        output.accept(FFBlocks.KOMATIITE_SLAB.asItem());
        output.accept(FFBlocks.KOMATIITE_WALL.asItem());
        output.accept(FFBlocks.POLISHED_KOMATIITE.asItem());
        output.accept(FFBlocks.POLISHED_KOMATIITE_STAIRS.asItem());
        output.accept(FFBlocks.POLISHED_KOMATIITE_SLAB.asItem());
        output.accept(FFBlocks.POLISHED_KOMATIITE_WALL.asItem());
        output.accept(FFBlocks.SUBCINDER.asItem());
        output.accept(FFBlocks.SUBCINDER_STAIRS.asItem());
        output.accept(FFBlocks.SUBCINDER_SLAB.asItem());
        output.accept(FFBlocks.SUBCINDER_WALL.asItem());
        output.accept(FFBlocks.CHISELED_POLISHED_SUBCINDER.asItem());
        output.accept(FFBlocks.POLISHED_SUBCINDER.asItem());
        output.accept(FFBlocks.POLISHED_SUBCINDER_STAIRS.asItem());
        output.accept(FFBlocks.POLISHED_SUBCINDER_SLAB.asItem());
        output.accept(FFBlocks.POLISHED_SUBCINDER_WALL.asItem());
        output.accept(FFBlocks.POLISHED_SUBCINDER_PRESSURE_PLATE.asItem());
        output.accept(FFBlocks.POLISHED_SUBCINDER_BUTTON.asItem());
        output.accept(FFBlocks.SUBCINDER_BRICKS.asItem());
        output.accept(FFBlocks.CRACKED_SUBCINDER_BRICKS.asItem());
        output.accept(FFBlocks.SUBCINDER_BRICKS_STAIRS.asItem());
        output.accept(FFBlocks.SUBCINDER_BRICKS_SLAB.asItem());
        output.accept(FFBlocks.SUBCINDER_BRICKS_WALL.asItem());
        output.accept(FFBlocks.PYROXENITE.asItem());
        output.accept(FFBlocks.PYROXENITE_STAIRS.asItem());
        output.accept(FFBlocks.PYROXENITE_SLAB.asItem());
        output.accept(FFBlocks.PYROXENITE_WALL.asItem());
        output.accept(FFBlocks.POLISHED_PYROXENITE.asItem());
        output.accept(FFBlocks.POLISHED_PYROXENITE_STAIRS.asItem());
        output.accept(FFBlocks.POLISHED_PYROXENITE_SLAB.asItem());
        output.accept(FFBlocks.POLISHED_PYROXENITE_WALL.asItem());
        output.accept(FFBlocks.ALUMINA_BLOCK.asItem());
        output.accept(FFBlocks.ALUMINUM_BLOCK.asItem());
        output.accept(FFBlocks.OLIVINE_BLOCK.asItem());
    }).build();

    public static final ResourceKey<CreativeModeTab> FF_NATURAL_BLOCKS_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Main.MOD_ID, "ff_natural_blocks"));
    public static final CreativeModeTab FF_NATURAL_BLOCKS = FabricCreativeModeTab.builder().icon(()-> new ItemStack(FFBlocks.HIGHLANDS_REGOLITH)).title(Component.translatable("itemGroup.final_frontier.ff_natural_blocks")).displayItems((parameters, output) -> {
        output.accept(FFBlocks.ALUMINA_ORE.asItem());
        output.accept(FFBlocks.DEEPSLATE_ALUMINA_ORE.asItem());
        output.accept(FFBlocks.HIGHLANDS_REGOLITH.asItem());
        output.accept(FFBlocks.MARIA_REGOLITH.asItem());
        output.accept(FFBlocks.MOONSTONE.asItem());
        output.accept(FFBlocks.MOONSTONE_IRON_ORE.asItem());
        output.accept(FFBlocks.MOONSTONE_GOLD_ORE.asItem());
        output.accept(FFBlocks.MOONSTONE_COPPER_ORE.asItem());
        output.accept(FFBlocks.MOONSTONE_DIAMOND_ORE.asItem());
        output.accept(FFBlocks.MOONSTONE_ALUMINA_ORE.asItem());
        output.accept(FFBlocks.MOONSTONE_QUARTZ_ORE.asItem());
        output.accept(FFBlocks.MOONSTONE_REDSTONE_ORE.asItem());
        output.accept(FFBlocks.MOONSTONE_OLIVINE_ORE.asItem());
        output.accept(FFBlocks.KOMATIITE.asItem());
        output.accept(FFBlocks.SUBCINDER.asItem());
        output.accept(FFBlocks.SUBCINDER_IRON_ORE.asItem());
        output.accept(FFBlocks.SUBCINDER_GOLD_ORE.asItem());
        output.accept(FFBlocks.SUBCINDER_COPPER_ORE.asItem());
        output.accept(FFBlocks.SUBCINDER_DIAMOND_ORE.asItem());
        output.accept(FFBlocks.SUBCINDER_ALUMINA_ORE.asItem());
        output.accept(FFBlocks.SUBCINDER_QUARTZ_ORE.asItem());
        output.accept(FFBlocks.SUBCINDER_REDSTONE_ORE.asItem());
        output.accept(FFBlocks.SUBCINDER_OLIVINE_ORE.asItem());
        output.accept(FFBlocks.PYROXENITE.asItem());
    }).build();

    public static final ResourceKey<CreativeModeTab> FF_COLORED_BLOCKS_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Main.MOD_ID, "ff_colored_blocks"));
    public static final CreativeModeTab FF_COLORED_BLOCKS = FabricCreativeModeTab.builder().icon(()-> new ItemStack(FFBlocks.DURAFABRIC_BLOCK)).title(Component.translatable("itemGroup.final_frontier.ff_materials")).displayItems((parameters, output) -> {
        output.accept(FFBlocks.DURAFABRIC_BLOCK.asItem());
        output.accept(FFBlocks.WHITE_DURAFABRIC_BLOCK.asItem());
        output.accept(FFBlocks.LIGHT_GRAY_DURAFABRIC_BLOCK.asItem());
        output.accept(FFBlocks.GRAY_DURAFABRIC_BLOCK.asItem());
        output.accept(FFBlocks.BLACK_DURAFABRIC_BLOCK.asItem());
        output.accept(FFBlocks.BROWN_DURAFABRIC_BLOCK.asItem());
        output.accept(FFBlocks.RED_DURAFABRIC_BLOCK.asItem());
        output.accept(FFBlocks.ORANGE_DURAFABRIC_BLOCK.asItem());
        output.accept(FFBlocks.YELLOW_DURAFABRIC_BLOCK.asItem());
        output.accept(FFBlocks.LIME_DURAFABRIC_BLOCK.asItem());
        output.accept(FFBlocks.GREEN_DURAFABRIC_BLOCK.asItem());
        output.accept(FFBlocks.LIGHT_BLUE_DURAFABRIC_BLOCK.asItem());
        output.accept(FFBlocks.CYAN_DURAFABRIC_BLOCK.asItem());
        output.accept(FFBlocks.BLUE_DURAFABRIC_BLOCK.asItem());
        output.accept(FFBlocks.PURPLE_DURAFABRIC_BLOCK.asItem());
        output.accept(FFBlocks.MAGENTA_DURAFABRIC_BLOCK.asItem());
        output.accept(FFBlocks.PINK_DURAFABRIC_BLOCK.asItem());
    }).build();

    public static final ResourceKey<CreativeModeTab> FF_MATERIALS_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Main.MOD_ID, "ff_materials"));
    public static final CreativeModeTab FF_MATERIALS = FabricCreativeModeTab.builder().icon(()-> new ItemStack(FFItems.DURAFABRIC)).title(Component.translatable("itemGroup.final_frontier.ff_materials")).displayItems((parameters, output) -> {
        output.accept(FFItems.DURAFABRIC);
        output.accept(FFItems.RAW_ALUMINA);
        output.accept(FFItems.OLIVINE);
        output.accept(FFItems.IRON_ROD);
        output.accept(FFItems.ALUMINUM_NUGGET);
        output.accept(FFItems.ALUMINUM_INGOT);
    }).build();

    public static final ResourceKey<CreativeModeTab> FF_TOOLS_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Main.MOD_ID, "ff_tools"));
    public static final CreativeModeTab FF_TOOLS = FabricCreativeModeTab.builder().icon(()-> new ItemStack(FFItems.OLIVINE_PICKAXE)).title(Component.translatable("itemGroup.final_frontier.ff_tools")).displayItems((parameters, output) -> {
        output.accept(FFItems.OLIVINE_SHOVEL);
        output.accept(FFItems.OLIVINE_PICKAXE);
        output.accept(FFItems.OLIVINE_AXE);
        output.accept(FFItems.OLIVINE_HOE);
    }).build();

    public static final ResourceKey<CreativeModeTab> FF_COMBAT_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Main.MOD_ID, "ff_combat"));
    public static final CreativeModeTab FF_COMBAT = FabricCreativeModeTab.builder().icon(()-> new ItemStack(FFItems.OLIVINE_SWORD)).title(Component.translatable("itemGroup.final_frontier.ff_combat")).displayItems((parameters, output) -> {
        output.accept(FFItems.OLIVINE_SWORD);
        output.accept(FFItems.OLIVINE_SPEAR);
        output.accept(FFItems.OLIVINE_AXE);
        output.accept(FFItems.OLIVINE_HELMET);
        output.accept(FFItems.OLIVINE_CHESTPLATE);
        output.accept(FFItems.OLIVINE_LEGGINGS);
        output.accept(FFItems.OLIVINE_BOOTS);
    }).build();

    public static void init() {

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, FF_BUILDING_BLOCKS_KEY, FF_BUILDING_BLOCKS);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, FF_NATURAL_BLOCKS_KEY, FF_NATURAL_BLOCKS);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, FF_COLORED_BLOCKS_KEY, FF_COLORED_BLOCKS);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, FF_MATERIALS_KEY, FF_MATERIALS);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, FF_TOOLS_KEY, FF_TOOLS);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, FF_COMBAT_KEY, FF_COMBAT);

        Main.LOGGER.info("Tab Registry Successful");
    }
}
