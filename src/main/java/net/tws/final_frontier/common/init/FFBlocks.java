package net.tws.final_frontier.common.init;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.tws.final_frontier.Main;
import net.tws.final_frontier.common.block.FFBlockSetTypes;

import java.util.function.Function;

public class FFBlocks {

    //Natural Blocks

    //Natural Blocks

    public static final Block ALUMINA_ORE = registerBlock("alumina_ore", (properties) -> new Block(properties.mapColor(MapColor.QUARTZ).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final Block DEEPSLATE_ALUMINA_ORE = registerBlock("deepslate_alumina_ore", (properties) -> new Block(properties.mapColor(MapColor.QUARTZ).sound(SoundType.DEEPSLATE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final Block HIGHLANDS_REGOLITH = registerBlock("highlands_regolith", (properties)-> new FallingBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.SAND).strength(0.5F, 0.5F)){
        @Override
        protected MapCodec<? extends FallingBlock> codec() {
            return null;
        }

        @Override
        public int getDustColor(BlockState state, BlockGetter level, BlockPos pos) {
            return 7895160;
        }
    });
    public static final Block MARIA_REGOLITH = registerBlock("maria_regolith", (properties)-> new FallingBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.SAND).strength(0.5F, 0.5F)){
        @Override
        protected MapCodec<? extends FallingBlock> codec() {
            return null;
        }

        @Override
        public int getDustColor(BlockState state, BlockGetter level, BlockPos pos) {
            return 5329233;
        }
    });
    public static final Block MOONSTONE = registerBlock("moonstone", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block MOONSTONE_IRON_ORE = registerBlock("moonstone_iron_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final Block MOONSTONE_GOLD_ORE = registerBlock("moonstone_gold_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final Block MOONSTONE_COPPER_ORE = registerBlock("moonstone_copper_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final Block MOONSTONE_DIAMOND_ORE = registerBlock("moonstone_diamond_ore", (properties)-> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final Block MOONSTONE_ALUMINA_ORE = registerBlock("moonstone_alumina_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final Block MOONSTONE_QUARTZ_ORE = registerBlock("moonstone_quartz_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final Block MOONSTONE_REDSTONE_ORE = registerBlock("moonstone_redstone_ore", (properties) -> new RedStoneOreBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final Block MOONSTONE_OLIVINE_ORE = registerBlock("moonstone_olivine_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops()));
    public static final Block KOMATIITE = registerBlock("komatiite", (properties) -> new Block(properties.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block SUBCINDER = registerBlock("subcinder", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(6,3).requiresCorrectToolForDrops()));
    public static final Block SUBCINDER_IRON_ORE = registerBlock("subcinder_iron_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops()));
    public static final Block SUBCINDER_GOLD_ORE = registerBlock("subcinder_gold_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops()));
    public static final Block SUBCINDER_COPPER_ORE = registerBlock("subcinder_copper_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops()));
    public static final Block SUBCINDER_DIAMOND_ORE = registerBlock("subcinder_diamond_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops()));
    public static final Block SUBCINDER_ALUMINA_ORE = registerBlock("subcinder_alumina_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops()));
    public static final Block SUBCINDER_QUARTZ_ORE = registerBlock("subcinder_quartz_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops()));
    public static final Block SUBCINDER_REDSTONE_ORE = registerBlock("subcinder_redstone_ore", (properties) -> new RedStoneOreBlock(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops()));
    public static final Block SUBCINDER_OLIVINE_ORE = registerBlock("subcinder_olivine_ore", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.ANCIENT_DEBRIS).strength(3, 4.5f).requiresCorrectToolForDrops()));
    public static final Block PYROXENITE = registerBlock("pyroxenite", (properties) -> new Block(properties.mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.TUFF).strength(1.5f, 6).requiresCorrectToolForDrops()));


    //Building Blocks
    public static final Block MOONSTONE_STAIRS = registerBlock("moonstone_stairs", (properties) -> new StairBlock(MOONSTONE.defaultBlockState(), properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block MOONSTONE_SLAB = registerBlock("moonstone_slab", (properties) -> new SlabBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block MOONSTONE_WALL = registerBlock("moonstone_wall", (properties) -> new WallBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));

    public static final Block CHISELED_POLISHED_MOONSTONE = registerBlock("chiseled_polished_moonstone", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_MOONSTONE = registerBlock("polished_moonstone", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_MOONSTONE_STAIRS = registerBlock("polished_moonstone_stairs", (properties) -> new StairBlock(POLISHED_MOONSTONE.defaultBlockState(), properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_MOONSTONE_SLAB = registerBlock("polished_moonstone_slab", (properties) -> new SlabBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_MOONSTONE_WALL = registerBlock("polished_moonstone_wall", (properties) -> new WallBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_MOONSTONE_PRESSURE_PLATE = registerBlock("polished_moonstone_pressure_plate", (properties -> new PressurePlateBlock(FFBlockSetTypes.MOONSTONE, properties.mapColor(MapColor.STONE).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).noCollision().strength(0.5F).pushReaction(PushReaction.DESTROY))));
    public static final Block POLISHED_MOONSTONE_BUTTON = registerBlock("polished_moonstone_button", (properties) -> new ButtonBlock(FFBlockSetTypes.MOONSTONE, 20, properties.noCollision().strength(0.5F).pushReaction(PushReaction.DESTROY)));

    public static final Block MOONSTONE_BRICKS = registerBlock("moonstone_bricks", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block CRACKED_MOONSTONE_BRICKS = registerBlock("cracked_moonstone_bricks", (properties) -> new Block(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block MOONSTONE_BRICKS_STAIRS = registerBlock("moonstone_bricks_stairs", (properties) -> new StairBlock(MOONSTONE_BRICKS.defaultBlockState(), properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block MOONSTONE_BRICKS_SLAB = registerBlock("moonstone_bricks_slab", (properties) -> new SlabBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block MOONSTONE_BRICKS_WALL = registerBlock("moonstone_bricks_wall", (properties) -> new WallBlock(properties.mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));

    public static final Block KOMATIITE_STAIRS = registerBlock("komatiite_stairs", (properties) -> new StairBlock(KOMATIITE.defaultBlockState(), properties.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block KOMATIITE_SLAB = registerBlock("komatiite_slab", (properties) -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block KOMATIITE_WALL = registerBlock("komatiite_wall", (properties) -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_KOMATIITE = registerBlock("polished_komatiite", (properties) -> new Block(properties.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_KOMATIITE_STAIRS = registerBlock("polished_komatiite_stairs", (properties) -> new StairBlock(POLISHED_KOMATIITE.defaultBlockState(), properties.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_KOMATIITE_SLAB = registerBlock("polished_komatiite_slab", (properties) -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_KOMATIITE_WALL = registerBlock("polished_komatiite_wall", (properties) -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN).sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops()));

    public static final Block SUBCINDER_STAIRS = registerBlock("subcinder_stairs", (properties) -> new StairBlock(SUBCINDER.defaultBlockState(), properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block SUBCINDER_SLAB = registerBlock("subcinder_slab", (properties) -> new SlabBlock(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block SUBCINDER_WALL = registerBlock("subcinder_wall", (properties) -> new WallBlock(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));

    public static final Block CHISELED_POLISHED_SUBCINDER = registerBlock("chiseled_polished_subcinder", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_SUBCINDER = registerBlock("polished_subcinder", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_SUBCINDER_STAIRS = registerBlock("polished_subcinder_stairs", (properties) -> new StairBlock(POLISHED_SUBCINDER.defaultBlockState(), properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_SUBCINDER_SLAB = registerBlock("polished_subcinder_slab", (properties) -> new SlabBlock(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_SUBCINDER_WALL = registerBlock("polished_subcinder_wall", (properties) -> new WallBlock(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_SUBCINDER_PRESSURE_PLATE = registerBlock("polished_subcinder_pressure_plate", (properties -> new PressurePlateBlock(FFBlockSetTypes.SUBCINDER, properties.mapColor(MapColor.STONE).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).noCollision().strength(0.5F).pushReaction(PushReaction.DESTROY))));
    public static final Block POLISHED_SUBCINDER_BUTTON = registerBlock("polished_subcinder_button", (properties) -> new ButtonBlock(FFBlockSetTypes.SUBCINDER, 20, properties.noCollision().strength(0.5F).pushReaction(PushReaction.DESTROY)));

    public static final Block SUBCINDER_BRICKS = registerBlock("subcinder_bricks", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block CRACKED_SUBCINDER_BRICKS = registerBlock("cracked_subcinder_bricks", (properties) -> new Block(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block SUBCINDER_BRICKS_STAIRS = registerBlock("subcinder_bricks_stairs", (properties) -> new StairBlock(SUBCINDER_BRICKS.defaultBlockState(), properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block SUBCINDER_BRICKS_SLAB = registerBlock("subcinder_bricks_slab", (properties) -> new SlabBlock(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block SUBCINDER_BRICKS_WALL = registerBlock("subcinder_bricks_wall", (properties) -> new WallBlock(properties.mapColor(MapColor.COLOR_GRAY).sound(SoundType.BASALT).strength(1.5f, 6).requiresCorrectToolForDrops()));

    public static final Block PYROXENITE_STAIRS = registerBlock("pyroxenite_stairs", (properties) -> new StairBlock(PYROXENITE.defaultBlockState(), properties.mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.TUFF).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block PYROXENITE_SLAB = registerBlock("pyroxenite_slab", (properties) -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.TUFF).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block PYROXENITE_WALL = registerBlock("pyroxenite_wall", (properties) -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.TUFF).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_PYROXENITE = registerBlock("polished_pyroxenite", (properties) -> new Block(properties.mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.TUFF).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_PYROXENITE_STAIRS = registerBlock("polished_pyroxenite_stairs", (properties) -> new StairBlock(POLISHED_PYROXENITE.defaultBlockState(), properties.mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.TUFF).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_PYROXENITE_SLAB = registerBlock("polished_pyroxenite_slab", (properties) -> new SlabBlock(properties.mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.TUFF).strength(1.5f, 6).requiresCorrectToolForDrops()));
    public static final Block POLISHED_PYROXENITE_WALL = registerBlock("polished_pyroxenite_wall", (properties) -> new WallBlock(properties.mapColor(MapColor.TERRACOTTA_BROWN).sound(SoundType.TUFF).strength(1.5f, 6).requiresCorrectToolForDrops()));

    public static final Block ALUMINA_BLOCK = registerBlock("alumina_block", (properties) -> new Block(properties.mapColor(MapColor.QUARTZ).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final Block ALUMINUM_BLOCK = registerBlock("aluminum_block", (properties) -> new Block(properties.mapColor(MapColor.QUARTZ).sound(SoundType.METAL).strength(3.0F, 3.0F).requiresCorrectToolForDrops()));
    public static final Block OLIVINE_BLOCK = registerBlock("olivine_block", (properties) -> new Block(properties.mapColor(MapColor.EMERALD).sound(SoundType.STONE).strength(3.0F, 3.0F).requiresCorrectToolForDrops()));

    //Colored Blocks
    public static final Block DURAFABRIC_BLOCK = registerBlock("durafabric_block", (properties) -> new Block(properties.mapColor(MapColor.SAND).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final Block WHITE_DURAFABRIC_BLOCK = registerBlock("white_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.WHITE).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final Block LIGHT_GRAY_DURAFABRIC_BLOCK = registerBlock("light_gray_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.LIGHT_GRAY).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final Block GRAY_DURAFABRIC_BLOCK = registerBlock("gray_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.GRAY).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final Block BLACK_DURAFABRIC_BLOCK = registerBlock("black_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.BLACK).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final Block BROWN_DURAFABRIC_BLOCK = registerBlock("brown_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.BROWN).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final Block RED_DURAFABRIC_BLOCK = registerBlock("red_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.RED).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final Block ORANGE_DURAFABRIC_BLOCK = registerBlock("orange_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.ORANGE).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final Block YELLOW_DURAFABRIC_BLOCK = registerBlock("yellow_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.YELLOW).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final Block LIME_DURAFABRIC_BLOCK = registerBlock("lime_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.LIME).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final Block GREEN_DURAFABRIC_BLOCK = registerBlock("green_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.GREEN).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final Block LIGHT_BLUE_DURAFABRIC_BLOCK = registerBlock("light_blue_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.LIGHT_BLUE).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final Block CYAN_DURAFABRIC_BLOCK = registerBlock("cyan_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.CYAN).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final Block BLUE_DURAFABRIC_BLOCK = registerBlock("blue_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.BLUE).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final Block PURPLE_DURAFABRIC_BLOCK = registerBlock("purple_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.PURPLE).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final Block MAGENTA_DURAFABRIC_BLOCK = registerBlock("magenta_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.MAGENTA).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final Block PINK_DURAFABRIC_BLOCK = registerBlock("pink_durafabric_block", (properties) -> new Block(properties.mapColor(DyeColor.PINK).sound(SoundType.WOOL).strength(0.8f, 0.8f)));


    private static Block registerBlockWithoutBlockItem(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name), toRegister);
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }

    public static void init() {
        Main.LOGGER.info("Block Registry Successful");
    }
}
