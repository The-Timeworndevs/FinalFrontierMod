package net.tws.final_frontier.client.data;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import net.tws.final_frontier.Main;
import net.tws.final_frontier.common.init.FFBlocks;

import static net.tws.final_frontier.client.data.LootTables.*;

import java.util.concurrent.CompletableFuture;

public class LootTableProvider extends FabricBlockLootSubProvider {

    public LootTableProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        for (Block block : SLABS) {
            add(block, createSlabItemTable(block));
        }

        for (Block block : DROPS_SELF) {
            dropSelf(block);
        }

    }
}
