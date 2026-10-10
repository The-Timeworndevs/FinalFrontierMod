package net.tws.final_frontier.client.data;

import net.minecraft.world.level.block.Block;
import net.tws.final_frontier.common.init.FFBlocks;

public class LootTables {

    static final Block[] SLABS = new Block[] {
            FFBlocks.MOONSTONE_SLAB,
            FFBlocks.KOMATIITE_SLAB,
            FFBlocks.SUBCINDER_SLAB,
            FFBlocks.PYROXENITE_SLAB,

            FFBlocks.POLISHED_MOONSTONE_SLAB,
            FFBlocks.POLISHED_KOMATIITE_SLAB,
            FFBlocks.POLISHED_SUBCINDER_SLAB,
            FFBlocks.POLISHED_PYROXENITE_SLAB,

            FFBlocks.MOONSTONE_BRICKS_SLAB,
            FFBlocks.SUBCINDER_BRICKS_SLAB,

            FFBlocks.CUT_ALUMINUM_SLAB,
            FFBlocks.CUT_STEEL_SLAB,
            FFBlocks.CUT_IRON_SLAB
    };

    static final Block[] DROPS_SELF = new Block[] {
            FFBlocks.HIGHLANDS_REGOLITH,
            FFBlocks.MARIA_REGOLITH,

            FFBlocks.MOONSTONE,

            FFBlocks.KOMATIITE,

            FFBlocks.SUBCINDER,

            FFBlocks.PYROXENITE,

            FFBlocks.MOONSTONE_STAIRS,
            FFBlocks.MOONSTONE_WALL,

            FFBlocks.KOMATIITE_STAIRS,
            FFBlocks.KOMATIITE_WALL,

            FFBlocks.SUBCINDER_STAIRS,
            FFBlocks.SUBCINDER_WALL,

            FFBlocks.PYROXENITE_STAIRS,
            FFBlocks.PYROXENITE_WALL,

            FFBlocks.POLISHED_MOONSTONE,
            FFBlocks.CHISELED_POLISHED_MOONSTONE,
            FFBlocks.POLISHED_MOONSTONE_STAIRS,
            FFBlocks.POLISHED_MOONSTONE_WALL,
            FFBlocks.POLISHED_MOONSTONE_PRESSURE_PLATE,
            FFBlocks.POLISHED_MOONSTONE_BUTTON,

            FFBlocks.POLISHED_KOMATIITE,
            FFBlocks.POLISHED_KOMATIITE_STAIRS,
            FFBlocks.POLISHED_KOMATIITE_WALL,

            FFBlocks.POLISHED_SUBCINDER,
            FFBlocks.CHISELED_POLISHED_SUBCINDER,
            FFBlocks.POLISHED_SUBCINDER_STAIRS,
            FFBlocks.POLISHED_SUBCINDER_WALL,
            FFBlocks.POLISHED_SUBCINDER_PRESSURE_PLATE,
            FFBlocks.POLISHED_SUBCINDER_BUTTON,

            FFBlocks.POLISHED_PYROXENITE,
            FFBlocks.POLISHED_PYROXENITE_STAIRS,
            FFBlocks.POLISHED_PYROXENITE_WALL,

            FFBlocks.MOONSTONE_BRICKS,
            FFBlocks.CRACKED_MOONSTONE_BRICKS,
            FFBlocks.MOONSTONE_BRICKS,
            FFBlocks.MOONSTONE_BRICKS_STAIRS,
            FFBlocks.MOONSTONE_BRICKS_WALL,

            FFBlocks.SUBCINDER_BRICKS,
            FFBlocks.CRACKED_SUBCINDER_BRICKS,
            FFBlocks.SUBCINDER_BRICKS,
            FFBlocks.SUBCINDER_BRICKS_STAIRS,
            FFBlocks.SUBCINDER_BRICKS_WALL,

            FFBlocks.ALUMINA_BLOCK,
            FFBlocks.OLIVINE_BLOCK,

            FFBlocks.ALUMINUM_BLOCK,
            FFBlocks.ALUMINUM_PANEL,
            FFBlocks.CUT_ALUMINUM,
            FFBlocks.CUT_ALUMINUM_STAIRS,
            FFBlocks.ALUMINUM_PILLAR,
            FFBlocks.ALUMINUM_PILLAR_HAZARD,

            FFBlocks.STEEL_BLOCK,
            FFBlocks.STEEL_PANEL,
            FFBlocks.CUT_STEEL,
            FFBlocks.CUT_STEEL_STAIRS,
            FFBlocks.STEEL_PILLAR,
            FFBlocks.STEEL_PILLAR_HAZARD,

            FFBlocks.IRON_PANEL,
            FFBlocks.CUT_IRON,
            FFBlocks.CUT_IRON_STAIRS,
            FFBlocks.IRON_PILLAR,
            FFBlocks.IRON_PILLAR_HAZARD,

            FFBlocks.WHITE_DURAFABRIC_BLOCK,
            FFBlocks.LIGHT_GRAY_DURAFABRIC_BLOCK,
            FFBlocks.GRAY_DURAFABRIC_BLOCK,
            FFBlocks.BLACK_DURAFABRIC_BLOCK,
            FFBlocks.BROWN_DURAFABRIC_BLOCK,
            FFBlocks.RED_DURAFABRIC_BLOCK,
            FFBlocks.ORANGE_DURAFABRIC_BLOCK,
            FFBlocks.YELLOW_DURAFABRIC_BLOCK,
            FFBlocks.LIME_DURAFABRIC_BLOCK,
            FFBlocks.GREEN_DURAFABRIC_BLOCK,
            FFBlocks.LIGHT_BLUE_DURAFABRIC_BLOCK,
            FFBlocks.CYAN_DURAFABRIC_BLOCK,
            FFBlocks.BLUE_DURAFABRIC_BLOCK,
            FFBlocks.PURPLE_DURAFABRIC_BLOCK,
            FFBlocks.MAGENTA_DURAFABRIC_BLOCK,
            FFBlocks.PINK_DURAFABRIC_BLOCK,

            FFBlocks.WHITE_GLOWING_ALUMINUM_PILLAR,
            FFBlocks.LIGHT_GRAY_GLOWING_ALUMINUM_PILLAR,
            FFBlocks.GRAY_GLOWING_ALUMINUM_PILLAR,
            FFBlocks.BLACK_GLOWING_ALUMINUM_PILLAR,
            FFBlocks.BROWN_GLOWING_ALUMINUM_PILLAR,
            FFBlocks.RED_GLOWING_ALUMINUM_PILLAR,
            FFBlocks.ORANGE_GLOWING_ALUMINUM_PILLAR,
            FFBlocks.YELLOW_GLOWING_ALUMINUM_PILLAR,
            FFBlocks.LIME_GLOWING_ALUMINUM_PILLAR,
            FFBlocks.GREEN_GLOWING_ALUMINUM_PILLAR,
            FFBlocks.LIGHT_BLUE_GLOWING_ALUMINUM_PILLAR,
            FFBlocks.CYAN_GLOWING_ALUMINUM_PILLAR,
            FFBlocks.BLUE_GLOWING_ALUMINUM_PILLAR,
            FFBlocks.PURPLE_GLOWING_ALUMINUM_PILLAR,
            FFBlocks.MAGENTA_GLOWING_ALUMINUM_PILLAR,
            FFBlocks.PINK_GLOWING_ALUMINUM_PILLAR,

            FFBlocks.WHITE_GLOWING_STEEL_PILLAR,
            FFBlocks.LIGHT_GRAY_GLOWING_STEEL_PILLAR,
            FFBlocks.GRAY_GLOWING_STEEL_PILLAR,
            FFBlocks.BLACK_GLOWING_STEEL_PILLAR,
            FFBlocks.BROWN_GLOWING_STEEL_PILLAR,
            FFBlocks.RED_GLOWING_STEEL_PILLAR,
            FFBlocks.ORANGE_GLOWING_STEEL_PILLAR,
            FFBlocks.YELLOW_GLOWING_STEEL_PILLAR,
            FFBlocks.LIME_GLOWING_STEEL_PILLAR,
            FFBlocks.GREEN_GLOWING_STEEL_PILLAR,
            FFBlocks.LIGHT_BLUE_GLOWING_STEEL_PILLAR,
            FFBlocks.CYAN_GLOWING_STEEL_PILLAR,
            FFBlocks.BLUE_GLOWING_STEEL_PILLAR,
            FFBlocks.PURPLE_GLOWING_STEEL_PILLAR,
            FFBlocks.MAGENTA_GLOWING_STEEL_PILLAR,
            FFBlocks.PINK_GLOWING_STEEL_PILLAR,

            FFBlocks.WHITE_GLOWING_IRON_PILLAR,
            FFBlocks.LIGHT_GRAY_GLOWING_IRON_PILLAR,
            FFBlocks.GRAY_GLOWING_IRON_PILLAR,
            FFBlocks.BLACK_GLOWING_IRON_PILLAR,
            FFBlocks.BROWN_GLOWING_IRON_PILLAR,
            FFBlocks.RED_GLOWING_IRON_PILLAR,
            FFBlocks.ORANGE_GLOWING_IRON_PILLAR,
            FFBlocks.YELLOW_GLOWING_IRON_PILLAR,
            FFBlocks.LIME_GLOWING_IRON_PILLAR,
            FFBlocks.GREEN_GLOWING_IRON_PILLAR,
            FFBlocks.LIGHT_BLUE_GLOWING_IRON_PILLAR,
            FFBlocks.CYAN_GLOWING_IRON_PILLAR,
            FFBlocks.BLUE_GLOWING_IRON_PILLAR,
            FFBlocks.PURPLE_GLOWING_IRON_PILLAR,
            FFBlocks.MAGENTA_GLOWING_IRON_PILLAR,
            FFBlocks.PINK_GLOWING_IRON_PILLAR,
    };
}
