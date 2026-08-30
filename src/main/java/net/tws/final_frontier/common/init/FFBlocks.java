package net.tws.final_frontier.common.init;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tws.final_frontier.FinalFrontier;

import java.util.function.Function;

public class FFBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(FinalFrontier.MODID);

    //Block Registry

    //Natural Blocks

    public static final DeferredBlock<Block> ALUMINA_ORE = registerBlock("alumina_ore", (properties) -> new Block(properties.mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_ALUMINA_ORE = registerBlock("deepslate_alumina_ore", (properties) -> new Block(properties.mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.DEEPSLATE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> HIGHLANDS_REGOLITH = registerBlock("highlands_regolith", (properties)-> new FallingBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.SAND).strength(0.5F, 0.5F)){
        @Override
        protected MapCodec<? extends FallingBlock> codec() {
            return null;
        }

        @Override
        public int getDustColor(BlockState state, BlockGetter level, BlockPos pos) {
            return 7895160;
        }
    });
    public static final DeferredBlock<Block> MARIA_REGOLITH = registerBlock("maria_regolith", (properties)-> new FallingBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.SAND).strength(0.5F, 0.5F)){
        @Override
        protected MapCodec<? extends FallingBlock> codec() {
            return null;
        }

        @Override
        public int getDustColor(BlockState state, BlockGetter level, BlockPos pos) {
            return 5329233;
        }
    });
    public static final DeferredBlock<Block> MOONSTONE = registerBlock("moonstone", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MOONSTONE_IRON_ORE = registerBlock("moonstone_iron_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MOONSTONE_GOLD_ORE = registerBlock("moonstone_gold_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MOONSTONE_COPPER_ORE = registerBlock("moonstone_copper_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MOONSTONE_DIAMOND_ORE = registerBlock("moonstone_diamond_ore", (properties)-> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MOONSTONE_ALUMINA_ORE = registerBlock("moonstone_alumina_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MOONSTONE_QUARTZ_ORE = registerBlock("moonstone_quartz_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> KOMATIITE = registerBlock("komatiite", (properties) -> new Block(properties.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SUBCINDER = registerBlock("subcinder", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(6,3).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SUBCINDER_IRON_ORE = registerBlock("subcinder_iron_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SUBCINDER_GOLD_ORE = registerBlock("subcinder_gold_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SUBCINDER_COPPER_ORE = registerBlock("subcinder_copper_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SUBCINDER_DIAMOND_ORE = registerBlock("subcinder_diamond_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SUBCINDER_ALUMINA_ORE = registerBlock("subcinder_alumina_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SUBCINDER_QUARTZ_ORE = registerBlock("subcinder_quartz_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> PYROXENITE = registerBlock("pyroxenite", (properties) -> new Block(properties.mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.TUFF).strength(1.5f, 6).requiresCorrectToolForDrops()));


    //Building Blocks
    public static final DeferredBlock<StairBlock> MOONSTONE_STAIRS = registerBlock("moonstone_stairs", (properties) -> new StairBlock(MOONSTONE.get().defaultBlockState(), properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> MOONSTONE_SLAB = registerBlock("moonstone_slab", (properties) -> new SlabBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> MOONSTONE_WALL = registerBlock("moonstone_wall", (properties) -> new WallBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CHISELED_POLISHED_MOONSTONE = registerBlock("chiseled_polished_moonstone", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_MOONSTONE = registerBlock("polished_moonstone", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> POLISHED_MOONSTONE_STAIRS = registerBlock("polished_moonstone_stairs", (properties) -> new StairBlock(POLISHED_MOONSTONE.get().defaultBlockState(), properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> POLISHED_MOONSTONE_SLAB = registerBlock("polished_moonstone_slab", (properties) -> new SlabBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> POLISHED_MOONSTONE_WALL = registerBlock("polished_moonstone_wall", (properties) -> new WallBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MOONSTONE_BRICKS = registerBlock("moonstone_bricks", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CRACKED_MOONSTONE_BRICKS = registerBlock("cracked_moonstone_bricks", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> MOONSTONE_BRICKS_STAIRS = registerBlock("moonstone_bricks_stairs", (properties) -> new StairBlock(MOONSTONE_BRICKS.get().defaultBlockState(), properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> MOONSTONE_BRICKS_SLAB = registerBlock("moonstone_bricks_slab", (properties) -> new SlabBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> MOONSTONE_BRICKS_WALL = registerBlock("moonstone_bricks_wall", (properties) -> new WallBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_KOMATIITE = registerBlock("polished_komatiite", (properties) -> new Block(properties.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> SUBCINDER_STAIRS = registerBlock("subcinder_stairs", (properties) -> new StairBlock(SUBCINDER.get().defaultBlockState(), properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> SUBCINDER_SLAB = registerBlock("subcinder_slab", (properties) -> new SlabBlock(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> SUBCINDER_WALL = registerBlock("subcinder_wall", (properties) -> new WallBlock(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CHISELED_POLISHED_SUBCINDER = registerBlock("chiseled_polished_subcinder", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_SUBCINDER = registerBlock("polished_subcinder", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> POLISHED_SUBCINDER_STAIRS = registerBlock("polished_subcinder_stairs", (properties) -> new StairBlock(POLISHED_SUBCINDER.get().defaultBlockState(), properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> POLISHED_SUBCINDER_SLAB = registerBlock("polished_subcinder_slab", (properties) -> new SlabBlock(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> POLISHED_SUBCINDER_WALL = registerBlock("polished_subcinder_wall", (properties) -> new WallBlock(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SUBCINDER_BRICKS = registerBlock("subcinder_bricks", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CRACKED_SUBCINDER_BRICKS = registerBlock("cracked_subcinder_bricks", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> SUBCINDER_BRICKS_STAIRS = registerBlock("subcinder_bricks_stairs", (properties) -> new StairBlock(SUBCINDER_BRICKS.get().defaultBlockState(), properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> SUBCINDER_BRICKS_SLAB = registerBlock("subcinder_bricks_slab", (properties) -> new SlabBlock(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> SUBCINDER_BRICKS_WALL = registerBlock("subcinder_bricks_wall", (properties) -> new WallBlock(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_PYROXENITE = registerBlock("polished_pyroxenite", (properties) -> new Block(properties.mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.TUFF).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ALUMINA_BLOCK = registerBlock("alumina_block", (properties) -> new Block(properties.mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops()));

    //Colored Blocks
    public static final DeferredBlock<Block> DURAFABRIC_BLOCK = registerBlock("durafabric_block", (properties) -> new Block(properties.mapColor(MapColor.SAND).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final DeferredBlock<Block> WHITE_DURAFABRIC_BLOCK = registerBlock("white_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.WHITE).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final DeferredBlock<Block> LIGHT_GRAY_DURAFABRIC_BLOCK = registerBlock("light_gray_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.LIGHT_GRAY).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final DeferredBlock<Block> GRAY_DURAFABRIC_BLOCK = registerBlock("gray_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.GRAY).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final DeferredBlock<Block> BLACK_DURAFABRIC_BLOCK = registerBlock("black_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.BLACK).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final DeferredBlock<Block> BROWN_DURAFABRIC_BLOCK = registerBlock("brown_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.BROWN).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final DeferredBlock<Block> RED_DURAFABRIC_BLOCK = registerBlock("red_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.RED).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final DeferredBlock<Block> ORANGE_DURAFABRIC_BLOCK = registerBlock("orange_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.ORANGE).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final DeferredBlock<Block> YELLOW_DURAFABRIC_BLOCK = registerBlock("yellow_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.YELLOW).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final DeferredBlock<Block> LIME_DURAFABRIC_BLOCK = registerBlock("lime_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.LIME).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final DeferredBlock<Block> GREEN_DURAFABRIC_BLOCK = registerBlock("green_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.GREEN).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final DeferredBlock<Block> LIGHT_BLUE_DURAFABRIC_BLOCK = registerBlock("light_blue_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.LIGHT_BLUE).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final DeferredBlock<Block> CYAN_DURAFABRIC_BLOCK = registerBlock("cyan_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.CYAN).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final DeferredBlock<Block> BLUE_DURAFABRIC_BLOCK = registerBlock("blue_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.BLUE).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final DeferredBlock<Block> PURPLE_DURAFABRIC_BLOCK = registerBlock("purple_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.PURPLE).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final DeferredBlock<Block> MAGENTA_DURAFABRIC_BLOCK = registerBlock("magenta_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.MAGENTA).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final DeferredBlock<Block> PINK_DURAFABRIC_BLOCK = registerBlock("pink_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.PINK).sound(SoundType.WOOL).strength(0.8f, 0.8f)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        FFItems.ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(), properties));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
