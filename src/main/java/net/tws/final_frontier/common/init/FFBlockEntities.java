package net.tws.final_frontier.common.init;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.tws.final_frontier.Main;
import net.tws.final_frontier.common.block.entity.AlloyFurnaceBlockEntity;

public class FFBlockEntities {

    public static final BlockEntityType<AlloyFurnaceBlockEntity> ALLOY_FURNACE_BE =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(Main.MOD_ID, "alloy_furnace_be"),
                    FabricBlockEntityTypeBuilder.create(AlloyFurnaceBlockEntity::new, FFBlocks.ALLOY_FURNACE).build());

    public static void init() {
        Main.LOGGER.info("Registered BlockEntities Successfully");
    }
}
