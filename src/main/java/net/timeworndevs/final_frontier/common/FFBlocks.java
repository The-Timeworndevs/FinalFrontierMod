package net.timeworndevs.final_frontier.common;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
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

    public static final Block LIGHT_REGOLITH = register()

    //public static final Block KEVLAR_BLOCK = register("kevlar_block", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(08f, 08f), true);
    //public static final Block WHITE_KEVLAR_BLOCK = register("white_kevlar_block", Block::new, AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(08f, 08f), true);

    public static void init() {

    }
}
