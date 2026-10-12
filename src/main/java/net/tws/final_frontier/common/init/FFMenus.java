package net.tws.final_frontier.common.init;

import net.fabricmc.fabric.api.menu.v1.ExtendedMenuType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.inventory.MenuType;
import net.tws.final_frontier.Main;
import net.tws.final_frontier.common.menu.AlloyFurnaceMenu;

public class FFMenus {

    public static final MenuType<AlloyFurnaceMenu> ALLOY_FURNACE_MENU_MENU =
            Registry.register(BuiltInRegistries.MENU, Identifier.fromNamespaceAndPath(Main.MOD_ID, "alloy_furnace_menu"), new ExtendedMenuType<>(AlloyFurnaceMenu::new, BlockPos.STREAM_CODEC));

    public static void init() {

        Main.LOGGER.info("Registered MenuTypes Successfully");
    }
}
