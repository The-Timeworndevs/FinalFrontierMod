package net.tws.final_frontier.common;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tws.final_frontier.FFMain;

public class FFTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FFMain.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FF_BUILDING_BLOCKS = CREATIVE_TABS.register("ff_building_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.final_frontier.ff_building_blocks")).withTabsBefore(CreativeModeTabs.COMBAT)
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .icon(() -> FFBlocks.MOONSTONE_ITEM.get().getDefaultInstance())
            .displayItems(((parameters, output) -> {
                output.accept(FFBlocks.MOONSTONE_ITEM.get());
                output.accept(FFBlocks.MOONSTONE_STAIRS_ITEM.get());
                output.accept(FFBlocks.MOONSTONE_SLAB_ITEM.get());
                output.accept(FFBlocks.MOONSTONE_WALL_ITEM.get());
                output.accept(FFBlocks.CHISELED_POLISHED_MOONSTONE_ITEM.get());
                output.accept(FFBlocks.POLISHED_MOONSTONE_ITEM.get());
                output.accept(FFBlocks.POLISHED_MOONSTONE_STAIRS_ITEM.get());
                output.accept(FFBlocks.POLISHED_MOONSTONE_SLAB_ITEM.get());
                output.accept(FFBlocks.POLISHED_MOONSTONE_WALL_ITEM.get());
                output.accept(FFBlocks.MOONSTONE_BRICKS_ITEM.get());
                output.accept(FFBlocks.CRACKED_MOONSTONE_BRICKS_ITEM.get());
                output.accept(FFBlocks.MOONSTONE_BRICKS_STAIRS_ITEM.get());
                output.accept(FFBlocks.MOONSTONE_BRICKS_SLAB_ITEM.get());
                output.accept(FFBlocks.MOONSTONE_BRICKS_WALL_ITEM.get());
                output.accept(FFBlocks.KOMATIITE_ITEM.get());
                output.accept(FFBlocks.POLISHED_KOMATIITE_ITEM.get());
                output.accept(FFBlocks.SUBCINDER_ITEM.get());
                output.accept(FFBlocks.SUBCINDER_STAIRS_ITEM.get());
                output.accept(FFBlocks.SUBCINDER_SLAB_ITEM.get());
                output.accept(FFBlocks.SUBCINDER_WALL_ITEM.get());
                output.accept(FFBlocks.CHISELED_POLISHED_SUBCINDER_ITEM.get());
                output.accept(FFBlocks.POLISHED_SUBCINDER_ITEM.get());
                output.accept(FFBlocks.POLISHED_MOONSTONE_ITEM.get());
                output.accept(FFBlocks.POLISHED_SUBCINDER_STAIRS_ITEM.get());
                output.accept(FFBlocks.POLISHED_SUBCINDER_SLAB_ITEM.get());
                output.accept(FFBlocks.POLISHED_SUBCINDER_WALL_ITEM.get());
                output.accept(FFBlocks.SUBCINDER_BRICKS_ITEM.get());
                output.accept(FFBlocks.CRACKED_SUBCINDER_BRICKS_ITEM.get());
                output.accept(FFBlocks.SUBCINDER_BRICKS_STAIRS_ITEM.get());
                output.accept(FFBlocks.SUBCINDER_BRICKS_SLAB_ITEM.get());
                output.accept(FFBlocks.SUBCINDER_BRICKS_WALL_ITEM.get());
                output.accept(FFBlocks.PYROXENITE_ITEM.get());
                output.accept(FFBlocks.POLISHED_PYROXENITE_ITEM.get());
            }))
            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FF_NATURAL_BLOCKS = CREATIVE_TABS.register("ff_natural_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.final_frontier.ff_natural_blocks")).withTabsBefore(CreativeModeTabs.COMBAT)
            .withTabsBefore(FF_BUILDING_BLOCKS.getKey())
            .icon(() -> FFBlocks.MARIA_REGOLITH_ITEM.get().getDefaultInstance())
            .displayItems(((parameters, output) -> {
                output.accept(FFBlocks.HIGHLANDS_REGOLITH_ITEM.get());
                output.accept(FFBlocks.MARIA_REGOLITH_ITEM.get());
                output.accept(FFBlocks.MOONSTONE_ITEM.get());
                output.accept(FFBlocks.MOONSTONE_IRON_ORE_ITEM.get());
                output.accept(FFBlocks.MOONSTONE_GOLD_ORE_ITEM.get());
                output.accept(FFBlocks.MOONSTONE_COPPER_ORE_ITEM.get());
                output.accept(FFBlocks.MOONSTONE_DIAMOND_ORE_ITEM.get());
                output.accept(FFBlocks.KOMATIITE_ITEM.get());
                output.accept(FFBlocks.SUBCINDER_ITEM.get());
                output.accept(FFBlocks.SUBCINDER_IRON_ORE_ITEM.get());
                output.accept(FFBlocks.SUBCINDER_GOLD_ORE_ITEM.get());
                output.accept(FFBlocks.SUBCINDER_COPPER_ORE_ITEM.get());
                output.accept(FFBlocks.SUBCINDER_DIAMOND_ORE_ITEM.get());
                output.accept(FFBlocks.PYROXENITE_ITEM.get());
            }))
            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FF_COLORED_BLOCKS = CREATIVE_TABS.register("colored_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.final_frontier.ff_colored_blocks"))
            .withTabsBefore(FFTabs.FF_NATURAL_BLOCKS.getId())
            .icon(() -> FFBlocks.DURAFABRIC_BLOCK_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(FFBlocks.DURAFABRIC_BLOCK_ITEM.get());
                output.accept(FFBlocks.WHITE_DURAFABRIC_BLOCK_ITEM.get());
                output.accept(FFBlocks.LIGHT_GRAY_DURAFABRIC_BLOCK_ITEM.get());
                output.accept(FFBlocks.GRAY_DURAFABRIC_BLOCK_ITEM.get());
                output.accept(FFBlocks.BLACK_DURAFABRIC_BLOCK_ITEM.get());
                output.accept(FFBlocks.BROWN_DURAFABRIC_BLOCK_ITEM.get());
                output.accept(FFBlocks.RED_DURAFABRIC_BLOCK_ITEM.get());
                output.accept(FFBlocks.ORANGE_DURAFABRIC_BLOCK_ITEM.get());
                output.accept(FFBlocks.YELLOW_DURAFABRIC_BLOCK_ITEM.get());
                output.accept(FFBlocks.LIME_DURAFABRIC_BLOCK_ITEM.get());
                output.accept(FFBlocks.GREEN_DURAFABRIC_BLOCK_ITEM.get());
                output.accept(FFBlocks.LIGHT_BLUE_DURAFABRIC_BLOCK_ITEM.get());
                output.accept(FFBlocks.CYAN_DURAFABRIC_BLOCK_ITEM.get());
                output.accept(FFBlocks.BLUE_DURAFABRIC_BLOCK_ITEM.get());
                output.accept(FFBlocks.PURPLE_DURAFABRIC_BLOCK_ITEM.get());
                output.accept(FFBlocks.MAGENTA_DURAFABRIC_BLOCK_ITEM.get());
                output.accept(FFBlocks.PINK_DURAFABRIC_BLOCK_ITEM.get());
            }).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FF_MATERIALS = CREATIVE_TABS.register("ff_materials", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.final_frontier.ff_materials"))
            .withTabsBefore(FFTabs.FF_COLORED_BLOCKS.getId())
            .icon(() -> FFItems.DURAFABRIC.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(FFItems.DURAFABRIC.get());
            }).build());

    public static void addCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
        }
    }
}
