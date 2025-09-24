package net.timeworndevs.final_frontier.common;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ColoredFallingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.timeworndevs.final_frontier.Main;

import java.util.function.Function;

public class FFBlocks {

    public static Block register(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings, boolean shouldregister) {

        RegistryKey<Block> blockkey = keyOfBlock(name);

        Block block = factory.apply(settings.registryKey(blockkey));

        if (shouldregister) {
            RegistryKey<Item> itemkey = keyOfItem(name);

            BlockItem blockitem = new BlockItem(block, new Item.Settings().registryKey(itemkey).useBlockPrefixedTranslationKey());

            Registry.register(Registries.ITEM, itemkey, blockitem);
        }

        return Registry.register(Registries.BLOCK, blockkey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Main.MOD_ID, name));
    }

    public static final Block HIGHLANDS_REGOLITH = register("highlands_regolith", (properties)->new ColoredFallingBlock(new ColorCode(7566195), properties), AbstractBlock.Settings.create().sounds(BlockSoundGroup.SAND).strength(0.5f, 0.5f).mapColor(DyeColor.LIGHT_GRAY), true);
    public static final Block MARIA_REGOLITH = register("maria_regolith", (properties)->new ColoredFallingBlock(new ColorCode(5329233), properties), AbstractBlock.Settings.create().sounds(BlockSoundGroup.SAND).strength(0.5f, 0.5f).mapColor(DyeColor.GRAY), true);
    public static final Block MOONSTONE = register("moonstone", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f, 6), true);
    public static final Block MOONSTONE_IRON_ORE = register("moonstone_iron_ore", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(3, 3), true);
    public static final Block MOONSTONE_GOLD_ORE = register("moonstone_gold_ore", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(3, 3), true);
    public static final Block MOONSTONE_COPPER_ORE = register("moonstone_copper_ore", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(3, 3), true);
    public static final Block MOONSTONE_DIAMOND_ORE = register("moonstone_diamond_ore", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(3, 3), true);
    //public static final Block KOMATIITE = register("komatiite", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f, 6), true);
    //public static final Block PYROXINITE = register("pyroxinite", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(1.5f, 6), true);
    public static final Block SUBCINDER = register("subcinder", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.BASALT).strength(6,3), true);
    public static final Block SUBCINDER_IRON_ORE = register("subcinder_iron_ore", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.BASALT).strength(3, 4.5f), true);
    public static final Block SUBCINDER_GOLD_ORE = register("subcinder_gold_ore", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.BASALT).strength(3, 4.5f), true);
    public static final Block SUBCINDER_COPPER_ORE = register("subcinder_copper_ore", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.BASALT).strength(3, 4.5f), true);
    public static final Block SUBCINDER_DIAMOND_ORE = register("subcinder_diamond_ore", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.BASALT).strength(3, 4.5f), true);

    //public static final Block KEVLAR_BLOCK = register("kevlar_block", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(08f, 08f), true);
    //public static final Block WHITE_KEVLAR_BLOCK = register("white_kevlar_block", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(08f, 08f), true);

    public static void init() {

    }
}
