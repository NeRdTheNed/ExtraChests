package com.technovision.extrachests.registry;

import com.technovision.extrachests.ExtraChests;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item IRON_CHEST = new BlockItem(ModBlocks.IRON_CHEST, new Item.Settings().group(ExtraChests.TAB));
    public static final Item GOLD_CHEST = new BlockItem(ModBlocks.GOLD_CHEST, new Item.Settings().group(ExtraChests.TAB));
    public static final Item DIAMOND_CHEST = new BlockItem(ModBlocks.DIAMOND_CHEST, new Item.Settings().group(ExtraChests.TAB));
    public static final Item COPPER_CHEST = new BlockItem(ModBlocks.COPPER_CHEST, new Item.Settings().group(ExtraChests.TAB));
    public static final Item SILVER_CHEST = new BlockItem(ModBlocks.SILVER_CHEST, new Item.Settings().group(ExtraChests.TAB));
    public static final Item CRYSTAL_CHEST = new BlockItem(ModBlocks.CRYSTAL_CHEST, new Item.Settings().group(ExtraChests.TAB));
    public static final Item OBSIDIAN_CHEST = new BlockItem(ModBlocks.OBSIDIAN_CHEST, new Item.Settings().group(ExtraChests.TAB));
    public static final Item HOLIDAY_CHEST = new BlockItem(ModBlocks.HOLIDAY_CHEST, new Item.Settings().group(ExtraChests.TAB));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(ExtraChests.MOD_ID, "iron_chest"), IRON_CHEST);
        Registry.register(Registry.ITEM, new Identifier(ExtraChests.MOD_ID, "gold_chest"), GOLD_CHEST);
        Registry.register(Registry.ITEM, new Identifier(ExtraChests.MOD_ID, "diamond_chest"), DIAMOND_CHEST);
        Registry.register(Registry.ITEM, new Identifier(ExtraChests.MOD_ID, "copper_chest"), COPPER_CHEST);
        Registry.register(Registry.ITEM, new Identifier(ExtraChests.MOD_ID, "silver_chest"), SILVER_CHEST);
        Registry.register(Registry.ITEM, new Identifier(ExtraChests.MOD_ID, "crystal_chest"), CRYSTAL_CHEST);
        Registry.register(Registry.ITEM, new Identifier(ExtraChests.MOD_ID, "obsidian_chest"), OBSIDIAN_CHEST);
        Registry.register(Registry.ITEM, new Identifier(ExtraChests.MOD_ID, "holiday_chest"), HOLIDAY_CHEST);
    }
}
