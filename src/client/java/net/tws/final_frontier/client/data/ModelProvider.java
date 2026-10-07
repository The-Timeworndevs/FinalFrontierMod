package net.tws.final_frontier.client.data;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jspecify.annotations.NonNull;

import static net.minecraft.client.data.models.model.TextureMapping.getBlockTexture;
import static net.minecraft.client.data.models.model.TexturedModel.createDefault;
import static net.tws.final_frontier.client.data.Models.*;
import static net.tws.final_frontier.common.init.FFBlocks.*;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricPackOutput output) {
        super(output);
    }

    public static TextureMapping column(final Block block) {
        return (new TextureMapping()).put(TextureSlot.SIDE, getBlockTexture(block)).put(TextureSlot.END, getBlockTexture(block, "_top"));
    }

    private static void generatePillarBlockStates(@NonNull BlockModelGenerators blockModelGenerators) {
        final TexturedModel.Provider COLUMN = createDefault(ModelProvider::column, ModelTemplates.CUBE_COLUMN);
        final TexturedModel.Provider HORIZONTAL = createDefault(ModelProvider::column, ModelTemplates.CUBE_COLUMN_HORIZONTAL);

        for (Block pillar : PILLARS) {
            blockModelGenerators.createRotatedPillarWithHorizontalVariant(pillar, COLUMN, HORIZONTAL);
        }
    }

    @Override
    public void generateBlockStateModels(@NonNull BlockModelGenerators blockModelGenerators) {
        generatePillarBlockStates(blockModelGenerators);

        for (Block block : BASIC_BLOCKS) {
            blockModelGenerators.createTrivialCube(block);
        }

        blockModelGenerators.family(CUT_ALUMINUM)
                .stairs(CUT_ALUMINUM_STAIRS)
                .slab(CUT_ALUMINUM_SLAB);

        blockModelGenerators.family(CUT_STEEL)
                .stairs(CUT_STEEL_STAIRS)
                .slab(CUT_STEEL_SLAB);

        blockModelGenerators.family(CUT_IRON)
                .stairs(CUT_IRON_STAIRS)
                .slab(CUT_IRON_SLAB);

        blockModelGenerators.family(MOONSTONE)
                .stairs(MOONSTONE_STAIRS)
                .slab(MOONSTONE_SLAB)
                .wall(MOONSTONE_WALL);

        blockModelGenerators.family(SUBCINDER)
                .stairs(SUBCINDER_STAIRS)
                .slab(SUBCINDER_SLAB)
                .wall(SUBCINDER_WALL);

        blockModelGenerators.family(POLISHED_SUBCINDER)
                .stairs(POLISHED_SUBCINDER_STAIRS)
                .slab(POLISHED_SUBCINDER_SLAB)
                .button(POLISHED_SUBCINDER_BUTTON)
                .pressurePlate(POLISHED_SUBCINDER_PRESSURE_PLATE)
                .wall(POLISHED_SUBCINDER_WALL);

        blockModelGenerators.family(SUBCINDER_BRICKS)
                .slab(SUBCINDER_BRICKS_SLAB)
                .stairs(SUBCINDER_BRICKS_STAIRS)
                .wall(SUBCINDER_BRICKS_WALL);

        blockModelGenerators.family(POLISHED_MOONSTONE)
                .stairs(POLISHED_MOONSTONE_STAIRS)
                .slab(POLISHED_MOONSTONE_SLAB)
                .button(POLISHED_MOONSTONE_BUTTON)
                .pressurePlate(POLISHED_MOONSTONE_PRESSURE_PLATE)
                .wall(POLISHED_MOONSTONE_WALL);
        
        blockModelGenerators.family(MOONSTONE_BRICKS)
                .slab(MOONSTONE_BRICKS_SLAB)
                .stairs(MOONSTONE_BRICKS_STAIRS)
                .wall(MOONSTONE_BRICKS_WALL);

        blockModelGenerators.family(KOMATIITE)
                .stairs(KOMATIITE_STAIRS)
                .slab(KOMATIITE_SLAB)
                .wall(KOMATIITE_WALL);

        blockModelGenerators.family(POLISHED_KOMATIITE)
                .stairs(POLISHED_KOMATIITE_STAIRS)
                .slab(POLISHED_KOMATIITE_SLAB)
                .wall(POLISHED_KOMATIITE_WALL);

        blockModelGenerators.family(PYROXENITE)
                .stairs(PYROXENITE_STAIRS)
                .slab(PYROXENITE_SLAB)
                .wall(PYROXENITE_WALL);

        blockModelGenerators.family(POLISHED_PYROXENITE)
                .stairs(POLISHED_PYROXENITE_STAIRS)
                .slab(POLISHED_PYROXENITE_SLAB)
                .wall(POLISHED_PYROXENITE_WALL);
    }

    @Override
    public void generateItemModels(@NonNull ItemModelGenerators itemModelGenerators) {
        for (Item item : BASIC_ITEMS) {
            itemModelGenerators.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
        }
    }
}