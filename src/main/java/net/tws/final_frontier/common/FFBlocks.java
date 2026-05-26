package net.tws.final_frontier.common;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.crafting.BlastingRecipe;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tws.final_frontier.FFMain;

public class FFBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(FFMain.MODID);

    //Block Registry

    //Natural Blocks

    public static final DeferredBlock<Block> BAUXITE_ORE = BLOCKS.registerSimpleBlock("bauxite_ore", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> DEEPSLATE_BAUXITE_ORE = BLOCKS.registerSimpleBlock("deepslate_bauxite_ore", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.DEEPSLATE).strength(3, 3).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> HIGHLANDS_REGOLITH = BLOCKS.register("highlands_regolith", () -> new FallingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.SAND).strength(0.5F, 0.5F)) {
        @Override
        protected MapCodec<? extends FallingBlock> codec() {
            return null;
        }
    });
    public static final DeferredBlock<Block> MARIA_REGOLITH = BLOCKS.register("maria_regolith", () -> new FallingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.SAND).strength(0.5F, 0.5F)) {
        @Override
        protected MapCodec<? extends FallingBlock> codec() {
            return null;
        }
    });
    public static final DeferredBlock<Block> MOONSTONE = BLOCKS.registerSimpleBlock("moonstone", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> MOONSTONE_IRON_ORE = BLOCKS.registerSimpleBlock("moonstone_iron_ore", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> MOONSTONE_GOLD_ORE = BLOCKS.registerSimpleBlock("moonstone_gold_ore", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> MOONSTONE_COPPER_ORE = BLOCKS.registerSimpleBlock("moonstone_copper_ore", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> MOONSTONE_DIAMOND_ORE = BLOCKS.registerSimpleBlock("moonstone_diamond_ore", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> MOONSTONE_BAUXITE_ORE = BLOCKS.registerSimpleBlock("moonstone_bauxite_ore", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> KOMATIITE = BLOCKS.registerSimpleBlock("komatiite", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> SUBCINDER = BLOCKS.registerSimpleBlock("subcinder", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(6,3).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> SUBCINDER_IRON_ORE = BLOCKS.registerSimpleBlock("subcinder_iron_ore", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> SUBCINDER_GOLD_ORE = BLOCKS.registerSimpleBlock("subcinder_gold_ore", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> SUBCINDER_COPPER_ORE = BLOCKS.registerSimpleBlock("subcinder_copper_ore", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> SUBCINDER_DIAMOND_ORE = BLOCKS.registerSimpleBlock("subcinder_diamond_ore", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> SUBCINDER_BAUXITE_ORE = BLOCKS.registerSimpleBlock("subcinder_bauxite_ore", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> PYROXENITE = BLOCKS.registerSimpleBlock("pyroxenite", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.TUFF).strength(1.5f, 6).requiresCorrectToolForDrops());

    //Building Blocks
    public static final DeferredBlock<Block> MOONSTONE_STAIRS = BLOCKS.register("moonstone_stairs", () -> new StairBlock(MOONSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MOONSTONE_SLAB = BLOCKS.register("moonstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MOONSTONE_WALL = BLOCKS.register("moonstone_wall", () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CHISELED_POLISHED_MOONSTONE = BLOCKS.registerSimpleBlock("chiseled_polished_moonstone", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> POLISHED_MOONSTONE = BLOCKS.registerSimpleBlock("polished_moonstone", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> POLISHED_MOONSTONE_STAIRS = BLOCKS.register("polished_moonstone_stairs", () -> new StairBlock(POLISHED_MOONSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_MOONSTONE_SLAB = BLOCKS.register("polished_moonstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_MOONSTONE_WALL = BLOCKS.register("polished_moonstone_wall", () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MOONSTONE_BRICKS = BLOCKS.registerSimpleBlock("moonstone_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> CRACKED_MOONSTONE_BRICKS = BLOCKS.registerSimpleBlock("cracked_moonstone_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> MOONSTONE_BRICKS_STAIRS = BLOCKS.register("moonstone_bricks_stairs", () -> new StairBlock(MOONSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MOONSTONE_BRICKS_SLAB = BLOCKS.register("moonstone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MOONSTONE_BRICKS_WALL = BLOCKS.register("moonstone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_KOMATIITE = BLOCKS.registerSimpleBlock("polished_komatiite", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> SUBCINDER_STAIRS = BLOCKS.register("subcinder_stairs", () -> new StairBlock(SUBCINDER.get().defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SUBCINDER_SLAB = BLOCKS.register("subcinder_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(6,3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SUBCINDER_WALL = BLOCKS.register("subcinder_wall", () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(6,3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_SUBCINDER = BLOCKS.registerSimpleBlock("polished_subcinder", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(6,3).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> CHISELED_POLISHED_SUBCINDER = BLOCKS.registerSimpleBlock("chiseled_polished_subcinder", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(6,3).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> POLISHED_SUBCINDER_STAIRS = BLOCKS.register("polished_subcinder_stairs", () -> new StairBlock(POLISHED_SUBCINDER.get().defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(6,3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_SUBCINDER_SLAB = BLOCKS.register("polished_subcinder_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(6,3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_SUBCINDER_WALL = BLOCKS.register("polished_subcinder_wall", () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(6,3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SUBCINDER_BRICKS = BLOCKS.registerSimpleBlock("subcinder_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(6,3).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> CRACKED_SUBCINDER_BRICKS = BLOCKS.registerSimpleBlock("cracked_subcinder_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(6,3).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> SUBCINDER_BRICKS_STAIRS = BLOCKS.register("subcinder_bricks_stairs", () -> new StairBlock(POLISHED_SUBCINDER.get().defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(6,3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SUBCINDER_BRICKS_SLAB = BLOCKS.register("subcinder_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(6,3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SUBCINDER_BRICKS_WALL = BLOCKS.register("subcinder_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(6,3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_PYROXENITE = BLOCKS.registerSimpleBlock("polished_pyroxenite", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.TUFF).strength(1.5f, 6).requiresCorrectToolForDrops());

    //Colored Blocks
    public static final DeferredBlock<Block> DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("durafabric_block", BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.WOOL).strength(0.8f, 0.8f));
    public static final DeferredBlock<Block> WHITE_DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("white_durafabric_block", BlockBehaviour.Properties.of().mapColor(DyeColor.WHITE).sound(SoundType.WOOL).strength(0.8f, 0.8f));
    public static final DeferredBlock<Block> LIGHT_GRAY_DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("light_gray_durafabric_block", BlockBehaviour.Properties.of().mapColor(DyeColor.LIGHT_GRAY).sound(SoundType.WOOL).strength(0.8f, 0.8f));
    public static final DeferredBlock<Block> GRAY_DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("gray_durafabric_block", BlockBehaviour.Properties.of().mapColor(DyeColor.GRAY).sound(SoundType.WOOL).strength(0.8f, 0.8f));
    public static final DeferredBlock<Block> BLACK_DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("black_durafabric_block", BlockBehaviour.Properties.of().mapColor(DyeColor.BLACK).sound(SoundType.WOOL).strength(0.8f, 0.8f));
    public static final DeferredBlock<Block> BROWN_DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("brown_durafabric_block", BlockBehaviour.Properties.of().mapColor(DyeColor.BROWN).sound(SoundType.WOOL).strength(0.8f, 0.8f));
    public static final DeferredBlock<Block> RED_DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("red_durafabric_block", BlockBehaviour.Properties.of().mapColor(DyeColor.RED).sound(SoundType.WOOL).strength(0.8f, 0.8f));
    public static final DeferredBlock<Block> ORANGE_DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("orange_durafabric_block", BlockBehaviour.Properties.of().mapColor(DyeColor.ORANGE).sound(SoundType.WOOL).strength(0.8f, 0.8f));
    public static final DeferredBlock<Block> YELLOW_DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("yellow_durafabric_block", BlockBehaviour.Properties.of().mapColor(DyeColor.YELLOW).sound(SoundType.WOOL).strength(0.8f, 0.8f));
    public static final DeferredBlock<Block> LIME_DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("lime_durafabric_block", BlockBehaviour.Properties.of().mapColor(DyeColor.LIME).sound(SoundType.WOOL).strength(0.8f, 0.8f));
    public static final DeferredBlock<Block> GREEN_DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("green_durafabric_block", BlockBehaviour.Properties.of().mapColor(DyeColor.GREEN).sound(SoundType.WOOL).strength(0.8f, 0.8f));
    public static final DeferredBlock<Block> LIGHT_BLUE_DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("light_blue_durafabric_block", BlockBehaviour.Properties.of().mapColor(DyeColor.LIGHT_BLUE).sound(SoundType.WOOL).strength(0.8f, 0.8f));
    public static final DeferredBlock<Block> CYAN_DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("cyan_durafabric_block", BlockBehaviour.Properties.of().mapColor(DyeColor.CYAN).sound(SoundType.WOOL).strength(0.8f, 0.8f));
    public static final DeferredBlock<Block> BLUE_DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("blue_durafabric_block", BlockBehaviour.Properties.of().mapColor(DyeColor.BLUE).sound(SoundType.WOOL).strength(0.8f, 0.8f));
    public static final DeferredBlock<Block> PURPLE_DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("purple_durafabric_block", BlockBehaviour.Properties.of().mapColor(DyeColor.PURPLE).sound(SoundType.WOOL).strength(0.8f, 0.8f));
    public static final DeferredBlock<Block> MAGENTA_DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("magenta_durafabric_block", BlockBehaviour.Properties.of().mapColor(DyeColor.PURPLE).sound(SoundType.WOOL).strength(0.8f, 0.8f));
    public static final DeferredBlock<Block> PINK_DURAFABRIC_BLOCK = BLOCKS.registerSimpleBlock("pink_durafabric_block", BlockBehaviour.Properties.of().mapColor(DyeColor.PURPLE).sound(SoundType.WOOL).strength(0.8f, 0.8f));

    //Item Registry

    //Natural Blocks

    public static final DeferredItem<BlockItem> BAUXITE_ORE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("bauxite_ore", BAUXITE_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_BAUXITE_ORE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("deepslate_bauxite_ore", DEEPSLATE_BAUXITE_ORE);

    public static final DeferredItem<BlockItem> HIGHLANDS_REGOLITH_ITEM = FFItems.ITEMS.registerSimpleBlockItem("highlands_regolith", HIGHLANDS_REGOLITH);
    public static final DeferredItem<BlockItem> MARIA_REGOLITH_ITEM = FFItems.ITEMS.registerSimpleBlockItem("maria_regolith", MARIA_REGOLITH);
    public static final DeferredItem<BlockItem> MOONSTONE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("moonstone", MOONSTONE);
    public static final DeferredItem<BlockItem> MOONSTONE_IRON_ORE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("moonstone_iron_ore", MOONSTONE_IRON_ORE);
    public static final DeferredItem<BlockItem> MOONSTONE_GOLD_ORE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("moonstone_gold_ore", MOONSTONE_GOLD_ORE);
    public static final DeferredItem<BlockItem> MOONSTONE_COPPER_ORE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("moonstone_copper_ore", MOONSTONE_COPPER_ORE);
    public static final DeferredItem<BlockItem> MOONSTONE_DIAMOND_ORE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("moonstone_diamond_ore", MOONSTONE_DIAMOND_ORE);
    public static final DeferredItem<BlockItem> MOONSTONE_BAUXITE_ORE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("moonstone_bauxite_ore", MOONSTONE_BAUXITE_ORE);
    public static final DeferredItem<BlockItem> KOMATIITE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("komatiite", KOMATIITE);
    public static final DeferredItem<BlockItem> SUBCINDER_ITEM = FFItems.ITEMS.registerSimpleBlockItem("subcinder", SUBCINDER);
    public static final DeferredItem<BlockItem> SUBCINDER_IRON_ORE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("subcinder_iron_ore", SUBCINDER_IRON_ORE);
    public static final DeferredItem<BlockItem> SUBCINDER_GOLD_ORE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("subcinder_gold_ore", SUBCINDER_GOLD_ORE);
    public static final DeferredItem<BlockItem> SUBCINDER_COPPER_ORE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("subcinder_copper_ore", SUBCINDER_COPPER_ORE);
    public static final DeferredItem<BlockItem> SUBCINDER_DIAMOND_ORE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("subcinder_diamond_ore", SUBCINDER_DIAMOND_ORE);
    public static final DeferredItem<BlockItem> SUBCINDER_BAUXITE_ORE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("subcinder_bauxite_ore", SUBCINDER_BAUXITE_ORE);
    public static final DeferredItem<BlockItem> PYROXENITE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("pyroxenite", PYROXENITE);

    //Building Blocks
    public static final DeferredItem<BlockItem> MOONSTONE_STAIRS_ITEM = FFItems.ITEMS.registerSimpleBlockItem("moonstone_stairs", MOONSTONE_STAIRS);
    public static final DeferredItem<BlockItem> MOONSTONE_SLAB_ITEM = FFItems.ITEMS.registerSimpleBlockItem("moonstone_slab", MOONSTONE_SLAB);
    public static final DeferredItem<BlockItem> MOONSTONE_WALL_ITEM = FFItems.ITEMS.registerSimpleBlockItem("moonstone_wall", MOONSTONE_WALL);
    public static final DeferredItem<BlockItem> CHISELED_POLISHED_MOONSTONE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("chiseled_polished_moonstone", CHISELED_POLISHED_MOONSTONE);
    public static final DeferredItem<BlockItem> POLISHED_MOONSTONE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("polished_moonstone", POLISHED_MOONSTONE);
    public static final DeferredItem<BlockItem> POLISHED_MOONSTONE_STAIRS_ITEM = FFItems.ITEMS.registerSimpleBlockItem("polished_moonstone_stairs", POLISHED_MOONSTONE_STAIRS);
    public static final DeferredItem<BlockItem> POLISHED_MOONSTONE_SLAB_ITEM = FFItems.ITEMS.registerSimpleBlockItem("polished_moonstone_slab", POLISHED_MOONSTONE_SLAB);
    public static final DeferredItem<BlockItem> POLISHED_MOONSTONE_WALL_ITEM = FFItems.ITEMS.registerSimpleBlockItem("polished_moonstone_wall", POLISHED_MOONSTONE_WALL);
    public static final DeferredItem<BlockItem> MOONSTONE_BRICKS_ITEM = FFItems.ITEMS.registerSimpleBlockItem("moonstone_bricks", MOONSTONE_BRICKS);
    public static final DeferredItem<BlockItem> CRACKED_MOONSTONE_BRICKS_ITEM = FFItems.ITEMS.registerSimpleBlockItem("cracked_moonstone_bricks", CRACKED_MOONSTONE_BRICKS);
    public static final DeferredItem<BlockItem> MOONSTONE_BRICKS_STAIRS_ITEM = FFItems.ITEMS.registerSimpleBlockItem("moonstone_bricks_stairs", MOONSTONE_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> MOONSTONE_BRICKS_SLAB_ITEM = FFItems.ITEMS.registerSimpleBlockItem("moonstone_bricks_slab", MOONSTONE_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> MOONSTONE_BRICKS_WALL_ITEM = FFItems.ITEMS.registerSimpleBlockItem("moonstone_bricks_wall", MOONSTONE_BRICKS_WALL);
    public static final DeferredItem<BlockItem> POLISHED_KOMATIITE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("polished_komatiite", POLISHED_KOMATIITE);
    public static final DeferredItem<BlockItem> SUBCINDER_STAIRS_ITEM = FFItems.ITEMS.registerSimpleBlockItem("subcinder_stairs", SUBCINDER_STAIRS);
    public static final DeferredItem<BlockItem> SUBCINDER_SLAB_ITEM = FFItems.ITEMS.registerSimpleBlockItem("subcinder_slab", SUBCINDER_SLAB);
    public static final DeferredItem<BlockItem> SUBCINDER_WALL_ITEM = FFItems.ITEMS.registerSimpleBlockItem("subcinder_wall", SUBCINDER_WALL);
    public static final DeferredItem<BlockItem> CHISELED_POLISHED_SUBCINDER_ITEM = FFItems.ITEMS.registerSimpleBlockItem("chiseled_polished_subcinder", CHISELED_POLISHED_SUBCINDER);
    public static final DeferredItem<BlockItem> POLISHED_SUBCINDER_ITEM = FFItems.ITEMS.registerSimpleBlockItem("polished_subcinder", POLISHED_SUBCINDER);
    public static final DeferredItem<BlockItem> POLISHED_SUBCINDER_STAIRS_ITEM = FFItems.ITEMS.registerSimpleBlockItem("polished_subcinder_stairs", POLISHED_SUBCINDER_STAIRS);
    public static final DeferredItem<BlockItem> POLISHED_SUBCINDER_SLAB_ITEM = FFItems.ITEMS.registerSimpleBlockItem("polished_subcinder_slab", POLISHED_SUBCINDER_SLAB);
    public static final DeferredItem<BlockItem> POLISHED_SUBCINDER_WALL_ITEM = FFItems.ITEMS.registerSimpleBlockItem("polished_subcinder_wall", POLISHED_SUBCINDER_WALL);
    public static final DeferredItem<BlockItem> SUBCINDER_BRICKS_ITEM = FFItems.ITEMS.registerSimpleBlockItem("subcinder_bricks", SUBCINDER_BRICKS);
    public static final DeferredItem<BlockItem> CRACKED_SUBCINDER_BRICKS_ITEM = FFItems.ITEMS.registerSimpleBlockItem("cracked_subcinder_bricks", CRACKED_SUBCINDER_BRICKS);
    public static final DeferredItem<BlockItem> SUBCINDER_BRICKS_STAIRS_ITEM = FFItems.ITEMS.registerSimpleBlockItem("subcinder_bricks_stairs", SUBCINDER_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> SUBCINDER_BRICKS_SLAB_ITEM = FFItems.ITEMS.registerSimpleBlockItem("subcinder_bricks_slab", SUBCINDER_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> SUBCINDER_BRICKS_WALL_ITEM = FFItems.ITEMS.registerSimpleBlockItem("subcinder_bricks_wall", SUBCINDER_BRICKS_WALL);
    public static final DeferredItem<BlockItem> POLISHED_PYROXENITE_ITEM = FFItems.ITEMS.registerSimpleBlockItem("polished_pyroxenite", POLISHED_PYROXENITE);

    //Colored Blocks
    public static final DeferredItem<BlockItem> DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("durafabric_block", DURAFABRIC_BLOCK);
    public static final DeferredItem<BlockItem> WHITE_DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("white_durafabric_block", WHITE_DURAFABRIC_BLOCK);
    public static final DeferredItem<BlockItem> LIGHT_GRAY_DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("light_gray_durafabric_block", LIGHT_GRAY_DURAFABRIC_BLOCK);
    public static final DeferredItem<BlockItem> GRAY_DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("gray_durafabric_block", GRAY_DURAFABRIC_BLOCK);
    public static final DeferredItem<BlockItem> BLACK_DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("black_durafabric_block", BLACK_DURAFABRIC_BLOCK);
    public static final DeferredItem<BlockItem> BROWN_DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("brown_durafabric_block", BROWN_DURAFABRIC_BLOCK);
    public static final DeferredItem<BlockItem> RED_DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("red_durafabric_block", RED_DURAFABRIC_BLOCK);
    public static final DeferredItem<BlockItem> ORANGE_DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("orange_durafabric_block", ORANGE_DURAFABRIC_BLOCK);
    public static final DeferredItem<BlockItem> YELLOW_DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("yellow_durafabric_block", YELLOW_DURAFABRIC_BLOCK);
    public static final DeferredItem<BlockItem> LIME_DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("lime_durafabric_block", LIME_DURAFABRIC_BLOCK);
    public static final DeferredItem<BlockItem> GREEN_DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("green_durafabric_block", GREEN_DURAFABRIC_BLOCK);
    public static final DeferredItem<BlockItem> LIGHT_BLUE_DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("light_blue_durafabric_block", LIGHT_BLUE_DURAFABRIC_BLOCK);
    public static final DeferredItem<BlockItem> CYAN_DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("cyan_durafabric_block", CYAN_DURAFABRIC_BLOCK);
    public static final DeferredItem<BlockItem> BLUE_DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("blue_durafabric_block", BLUE_DURAFABRIC_BLOCK);
    public static final DeferredItem<BlockItem> PURPLE_DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("purple_durafabric_block", PURPLE_DURAFABRIC_BLOCK);
    public static final DeferredItem<BlockItem> MAGENTA_DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("magenta_durafabric_block", MAGENTA_DURAFABRIC_BLOCK);
    public static final DeferredItem<BlockItem> PINK_DURAFABRIC_BLOCK_ITEM = FFItems.ITEMS.registerSimpleBlockItem("pink_durafabric_block", PINK_DURAFABRIC_BLOCK);

}
