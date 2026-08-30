package net.tws.final_frontier.common.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tws.final_frontier.FinalFrontier;

public class FFTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FinalFrontier.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FF_BUILDING_BLOCKS = CREATIVE_TABS.register("ff_building_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.final_frontier.ff_building_blocks")).withTabsBefore(CreativeModeTabs.COMBAT)
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .icon(() -> FFBlocks.MOONSTONE.asItem().getDefaultInstance())
            .displayItems(((parameters, output) -> {
                output.accept(FFBlocks.MOONSTONE.asItem().getDefaultInstance());
                output.accept(FFBlocks.MOONSTONE_STAIRS.asItem().getDefaultInstance());
                output.accept(FFBlocks.MOONSTONE_SLAB.asItem().getDefaultInstance());
                output.accept(FFBlocks.MOONSTONE_WALL.asItem().getDefaultInstance());
                output.accept(FFBlocks.CHISELED_POLISHED_MOONSTONE.asItem().getDefaultInstance());
                output.accept(FFBlocks.POLISHED_MOONSTONE.asItem().getDefaultInstance());
                output.accept(FFBlocks.POLISHED_MOONSTONE_STAIRS.asItem().getDefaultInstance());
                output.accept(FFBlocks.POLISHED_MOONSTONE_SLAB.asItem().getDefaultInstance());
                output.accept(FFBlocks.POLISHED_MOONSTONE_WALL.asItem().getDefaultInstance());
                output.accept(FFBlocks.MOONSTONE_BRICKS.asItem().getDefaultInstance());
                output.accept(FFBlocks.CRACKED_MOONSTONE_BRICKS.asItem().getDefaultInstance());
                output.accept(FFBlocks.MOONSTONE_BRICKS_STAIRS.asItem().getDefaultInstance());
                output.accept(FFBlocks.MOONSTONE_BRICKS_SLAB.asItem().getDefaultInstance());
                output.accept(FFBlocks.MOONSTONE_BRICKS_WALL.asItem().getDefaultInstance());
                output.accept(FFBlocks.KOMATIITE.asItem().getDefaultInstance());
                output.accept(FFBlocks.POLISHED_KOMATIITE.asItem().getDefaultInstance());
                output.accept(FFBlocks.SUBCINDER.asItem().getDefaultInstance());
                output.accept(FFBlocks.SUBCINDER_STAIRS.asItem().getDefaultInstance());
                output.accept(FFBlocks.SUBCINDER_SLAB.asItem().getDefaultInstance());
                output.accept(FFBlocks.SUBCINDER_WALL.asItem().getDefaultInstance());
                output.accept(FFBlocks.CHISELED_POLISHED_SUBCINDER.asItem().getDefaultInstance());
                output.accept(FFBlocks.POLISHED_SUBCINDER.asItem().getDefaultInstance());
                output.accept(FFBlocks.POLISHED_MOONSTONE.asItem().getDefaultInstance());
                output.accept(FFBlocks.POLISHED_SUBCINDER_STAIRS.asItem().getDefaultInstance());
                output.accept(FFBlocks.POLISHED_SUBCINDER_SLAB.asItem().getDefaultInstance());
                output.accept(FFBlocks.POLISHED_SUBCINDER_WALL.asItem().getDefaultInstance());
                output.accept(FFBlocks.SUBCINDER_BRICKS.asItem().getDefaultInstance());
                output.accept(FFBlocks.CRACKED_SUBCINDER_BRICKS.asItem().getDefaultInstance());
                output.accept(FFBlocks.SUBCINDER_BRICKS_STAIRS.asItem().getDefaultInstance());
                output.accept(FFBlocks.SUBCINDER_BRICKS_SLAB.asItem().getDefaultInstance());
                output.accept(FFBlocks.SUBCINDER_BRICKS_WALL.asItem().getDefaultInstance());
                output.accept(FFBlocks.PYROXENITE.asItem().getDefaultInstance());
                output.accept(FFBlocks.POLISHED_PYROXENITE.asItem().getDefaultInstance());
                output.accept(FFBlocks.ALUMINA_BLOCK.asItem().getDefaultInstance());
            }))
            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FF_NATURAL_BLOCKS = CREATIVE_TABS.register("ff_natural_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.final_frontier.ff_natural_blocks")).withTabsBefore(CreativeModeTabs.COMBAT)
            .withTabsBefore(FF_BUILDING_BLOCKS.getKey())
            .icon(() -> FFBlocks.MARIA_REGOLITH.asItem().getDefaultInstance())
            .displayItems(((parameters, output) -> {
                output.accept(FFBlocks.ALUMINA_ORE.asItem().getDefaultInstance());
                output.accept(FFBlocks.DEEPSLATE_ALUMINA_ORE.asItem().getDefaultInstance());
                output.accept(FFBlocks.HIGHLANDS_REGOLITH.asItem().getDefaultInstance());
                output.accept(FFBlocks.MARIA_REGOLITH.asItem().getDefaultInstance());
                output.accept(FFBlocks.MOONSTONE.asItem().getDefaultInstance());
                output.accept(FFBlocks.MOONSTONE_IRON_ORE.asItem().getDefaultInstance());
                output.accept(FFBlocks.MOONSTONE_GOLD_ORE.asItem().getDefaultInstance());
                output.accept(FFBlocks.MOONSTONE_COPPER_ORE.asItem().getDefaultInstance());
                output.accept(FFBlocks.MOONSTONE_DIAMOND_ORE.asItem().getDefaultInstance());
                output.accept(FFBlocks.MOONSTONE_ALUMINA_ORE.asItem().getDefaultInstance());
                output.accept(FFBlocks.MOONSTONE_QUARTZ_ORE.asItem().getDefaultInstance());
                output.accept(FFBlocks.KOMATIITE.asItem().getDefaultInstance());
                output.accept(FFBlocks.SUBCINDER.asItem().getDefaultInstance());
                output.accept(FFBlocks.SUBCINDER_IRON_ORE.asItem().getDefaultInstance());
                output.accept(FFBlocks.SUBCINDER_GOLD_ORE.asItem().getDefaultInstance());
                output.accept(FFBlocks.SUBCINDER_COPPER_ORE.asItem().getDefaultInstance());
                output.accept(FFBlocks.SUBCINDER_DIAMOND_ORE.asItem().getDefaultInstance());
                output.accept(FFBlocks.SUBCINDER_ALUMINA_ORE.asItem().getDefaultInstance());
                output.accept(FFBlocks.SUBCINDER_QUARTZ_ORE.asItem().getDefaultInstance());
                output.accept(FFBlocks.PYROXENITE.asItem().getDefaultInstance());
            }))
            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FF_COLORED_BLOCKS = CREATIVE_TABS.register("colored_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.final_frontier.ff_colored_blocks"))
            .withTabsBefore(FFTabs.FF_NATURAL_BLOCKS.getId())
            .icon(() -> FFBlocks.DURAFABRIC_BLOCK.asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(FFBlocks.DURAFABRIC_BLOCK.asItem().getDefaultInstance());
                output.accept(FFBlocks.WHITE_DURAFABRIC_BLOCK.asItem().getDefaultInstance());
                output.accept(FFBlocks.LIGHT_GRAY_DURAFABRIC_BLOCK.asItem().getDefaultInstance());
                output.accept(FFBlocks.GRAY_DURAFABRIC_BLOCK.asItem().getDefaultInstance());
                output.accept(FFBlocks.BLACK_DURAFABRIC_BLOCK.asItem().getDefaultInstance());
                output.accept(FFBlocks.BROWN_DURAFABRIC_BLOCK.asItem().getDefaultInstance());
                output.accept(FFBlocks.RED_DURAFABRIC_BLOCK.asItem().getDefaultInstance());
                output.accept(FFBlocks.ORANGE_DURAFABRIC_BLOCK.asItem().getDefaultInstance());
                output.accept(FFBlocks.YELLOW_DURAFABRIC_BLOCK.asItem().getDefaultInstance());
                output.accept(FFBlocks.LIME_DURAFABRIC_BLOCK.asItem().getDefaultInstance());
                output.accept(FFBlocks.GREEN_DURAFABRIC_BLOCK.asItem().getDefaultInstance());
                output.accept(FFBlocks.LIGHT_BLUE_DURAFABRIC_BLOCK.asItem().getDefaultInstance());
                output.accept(FFBlocks.CYAN_DURAFABRIC_BLOCK.asItem().getDefaultInstance());
                output.accept(FFBlocks.BLUE_DURAFABRIC_BLOCK.asItem().getDefaultInstance());
                output.accept(FFBlocks.PURPLE_DURAFABRIC_BLOCK.asItem().getDefaultInstance());
                output.accept(FFBlocks.MAGENTA_DURAFABRIC_BLOCK.asItem().getDefaultInstance());
                output.accept(FFBlocks.PINK_DURAFABRIC_BLOCK.asItem().getDefaultInstance());
            }).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FF_MATERIALS = CREATIVE_TABS.register("ff_materials", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.final_frontier.ff_materials"))
            .withTabsBefore(FFTabs.FF_COLORED_BLOCKS.getId())
            .icon(() -> FFItems.DURAFABRIC.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(FFItems.DURAFABRIC.get());
                output.accept(FFItems.RAW_ALUMINA.get());
                output.accept(FFItems.ALUMINUM_NUGGET.get());
                output.accept(FFItems.ALUMINUM_INGOT.get());
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
