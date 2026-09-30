package net.tws.final_frontier.common.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.tws.final_frontier.Main;

public class FFItemTags {

    public static final TagKey<Item> OLIVINE_TOOL_MATERIALS;
    public static final TagKey<Item> REPAIRS_OLIVINE_ARMOR;

    private FFItemTags() {

    }

    private static TagKey<Item> bind(final String name) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name));
    }

    static {
        OLIVINE_TOOL_MATERIALS = bind("olivine_tool_materials");
        REPAIRS_OLIVINE_ARMOR = bind("repairs_olivine_armor");
    }
}
