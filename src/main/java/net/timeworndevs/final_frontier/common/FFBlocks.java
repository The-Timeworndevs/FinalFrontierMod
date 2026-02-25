package net.timeworndevs.final_frontier.common;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ColoredFallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.timeworndevs.final_frontier.Main;

import java.util.function.Function;

public class FFBlocks {



    public static Block register(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings, boolean shouldregister) {

        ResourceKey<Block> blockkey = keyOfBlock(name);

        Block block = factory.apply(settings);

        if (shouldregister) {
            ResourceKey<Item> itemkey = keyOfItem(name);

            BlockItem blockitem = new BlockItem(block, new Item.Properties());

            Registry.register(BuiltInRegistries.ITEM, itemkey, blockitem);
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockkey, block);
    }

    private static ResourceKey<Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, name));
    }

    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, name));
    }

    public static final Block HIGHLANDS_REGOLITH = register("highlands_regolith", (properties)->new ColoredFallingBlock(new ColorRGBA(7566195), properties), BlockBehaviour.Properties.of().sound(SoundType.SAND).strength(0.5f, 0.5f).mapColor(DyeColor.LIGHT_GRAY), true);
    public static final Block MARIA_REGOLITH = register("maria_regolith", (properties)->new ColoredFallingBlock(new ColorRGBA(5329233), properties), BlockBehaviour.Properties.of().sound(SoundType.SAND).strength(0.5f, 0.5f).mapColor(DyeColor.GRAY), true);
    public static final Block MOONSTONE = register("moonstone", Block::new, BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops().mapColor(DyeColor.LIGHT_GRAY), true);
    public static final Block MOONSTONE_IRON_ORE = register("moonstone_iron_ore", Block::new, BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops().mapColor(DyeColor.LIGHT_GRAY), true);
    public static final Block MOONSTONE_GOLD_ORE = register("moonstone_gold_ore", Block::new, BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops().mapColor(DyeColor.LIGHT_GRAY), true);
    public static final Block MOONSTONE_COPPER_ORE = register("moonstone_copper_ore", Block::new, BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops().mapColor(DyeColor.LIGHT_GRAY), true);
    public static final Block MOONSTONE_DIAMOND_ORE = register("moonstone_diamond_ore", Block::new, BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(3, 3).requiresCorrectToolForDrops().mapColor(DyeColor.LIGHT_GRAY), true);
    public static final Block KOMATIITE = register("komatiite", Block::new, BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.5f, 6).requiresCorrectToolForDrops(), true);
    public static final Block SUBCINDER = register("subcinder", Block::new, BlockBehaviour.Properties.of().sound(SoundType.BASALT).strength(6,3).requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_LIGHT_GREEN), true);
    public static final Block SUBCINDER_IRON_ORE = register("subcinder_iron_ore", Block::new, BlockBehaviour.Properties.of().sound(SoundType.BASALT).strength(3, 4.5f).requiresCorrectToolForDrops().mapColor(DyeColor.GRAY), true);
    public static final Block SUBCINDER_GOLD_ORE = register("subcinder_gold_ore", Block::new, BlockBehaviour.Properties.of().sound(SoundType.BASALT).strength(3, 4.5f).requiresCorrectToolForDrops().mapColor(DyeColor.GRAY), true);
    public static final Block SUBCINDER_COPPER_ORE = register("subcinder_copper_ore", Block::new, BlockBehaviour.Properties.of().sound(SoundType.BASALT).strength(3, 4.5f).requiresCorrectToolForDrops().mapColor(DyeColor.GRAY), true);
    public static final Block SUBCINDER_DIAMOND_ORE = register("subcinder_diamond_ore", Block::new, BlockBehaviour.Properties.of().sound(SoundType.BASALT).strength(3, 4.5f).requiresCorrectToolForDrops().mapColor(DyeColor.GRAY), true);
    public static final Block PYROXENITE = register("pyroxenite", Block::new, BlockBehaviour.Properties.of().sound(SoundType.TUFF).strength(1.5f, 6).requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_BROWN), true);

    public static final Block DURAFABRIC_BLOCK = register("durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(MapColor.SAND), true);
    public static final Block WHITE_DURAFABRIC_BLOCK = register("white_durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(DyeColor.WHITE), true);
    public static final Block LIGHT_GRAY_DURAFABRIC_BLOCK = register("light_gray_durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(DyeColor.LIGHT_GRAY), true);
    public static final Block GRAY_DURAFABRIC_BLOCK = register("gray_durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(DyeColor.GRAY), true);
    public static final Block BLACK_DURAFABRIC_BLOCK = register("black_durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(DyeColor.BLACK), true);
    public static final Block BROWN_DURAFABRIC_BLOCK = register("brown_durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(DyeColor.BROWN), true);
    public static final Block RED_DURAFABRIC_BLOCK = register("red_durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(DyeColor.RED), true);
    public static final Block ORANGE_DURAFABRIC_BLOCK = register("orange_durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(DyeColor.ORANGE), true);
    public static final Block YELLOW_DURAFABRIC_BLOCK = register("yellow_durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(DyeColor.YELLOW), true);
    public static final Block LIME_DURAFABRIC_BLOCK = register("lime_durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(DyeColor.LIME), true);
    public static final Block GREEN_DURAFABRIC_BLOCK = register("green_durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(DyeColor.GREEN), true);
    public static final Block LIGHT_BLUE_DURAFABRIC_BLOCK = register("light_blue_durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(DyeColor.CYAN), true);
    public static final Block CYAN_DURAFABRIC_BLOCK = register("cyan_durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(DyeColor.LIGHT_BLUE), true);
    public static final Block BLUE_DURAFABRIC_BLOCK = register("blue_durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(DyeColor.BLUE), true);
    public static final Block PURPLE_DURAFABRIC_BLOCK = register("purple_durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(DyeColor.PURPLE), true);
    public static final Block MAGENTA_DURAFABRIC_BLOCK = register("magenta_durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(DyeColor.MAGENTA), true);
    public static final Block PINK_DURAFABRIC_BLOCK = register("pink_durafabric_block", Block::new, BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(08f, 08f).mapColor(DyeColor.PINK), true);

    public static void init() {

    }
}
