package com.technovision.ironchest.registry;

import com.technovision.ironchest.IronChests;
import com.technovision.ironchest.items.IronChestsUpgradeType;
import com.technovision.ironchest.items.UpgradeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Chest Items
    public static final Item IRON_CHEST = new BlockItem(ModBlocks.IRON_CHEST, new Item.Settings().group(IronChests.TAB));
    public static final Item GOLD_CHEST = new BlockItem(ModBlocks.GOLD_CHEST, new Item.Settings().group(IronChests.TAB));
    public static final Item DIAMOND_CHEST = new BlockItem(ModBlocks.DIAMOND_CHEST, new Item.Settings().group(IronChests.TAB));
    public static final Item COPPER_CHEST = new BlockItem(ModBlocks.COPPER_CHEST, new Item.Settings().group(IronChests.TAB));
    public static final Item SILVER_CHEST = new BlockItem(ModBlocks.SILVER_CHEST, new Item.Settings().group(IronChests.TAB));
    public static final Item CRYSTAL_CHEST = new BlockItem(ModBlocks.CRYSTAL_CHEST, new Item.Settings().group(IronChests.TAB));
    public static final Item OBSIDIAN_CHEST = new BlockItem(ModBlocks.OBSIDIAN_CHEST, new Item.Settings().group(IronChests.TAB));
    public static final Item HOLIDAY_CHEST = new BlockItem(ModBlocks.HOLIDAY_CHEST, new Item.Settings().group(IronChests.TAB));
    public static final Item DIRT_CHEST = new BlockItem(ModBlocks.DIRT_CHEST, new Item.Settings().group(IronChests.TAB));

    // Upgrade Items
    public static final Item WOOD_IRON_UPGRADE = new UpgradeItem(IronChestsUpgradeType.WOOD_TO_IRON);
    public static final Item WOOD_COPPER_UPGRADE = new UpgradeItem(IronChestsUpgradeType.WOOD_TO_COPPER);
    public static final Item COPPER_SILVER_UPGRADE = new UpgradeItem(IronChestsUpgradeType.COPPER_TO_SILVER);
    public static final Item COPPER_IRON_UPGRADE = new UpgradeItem(IronChestsUpgradeType.COPPER_TO_IRON);
    public static final Item SILVER_GOLD_UPGRADE = new UpgradeItem(IronChestsUpgradeType.SILVER_TO_GOLD);
    public static final Item IRON_GOLD_UPGRADE = new UpgradeItem(IronChestsUpgradeType.IRON_TO_GOLD);
    public static final Item GOLD_DIAMOND_UPGRADE = new UpgradeItem(IronChestsUpgradeType.GOLD_TO_DIAMOND);
    public static final Item DIAMOND_CRYSTAL_UPGRADE = new UpgradeItem(IronChestsUpgradeType.DIAMOND_TO_CRYSTAL);
    public static final Item DIAMOND_OBSIDIAN_UPGRADE = new UpgradeItem(IronChestsUpgradeType.DIAMOND_TO_OBSIDIAN);

    // Dirt chest guide book
    public static final ItemStack dirtChestGuideBook = new ItemStack(Items.WRITTEN_BOOK);

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "iron_chest"), IRON_CHEST);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "gold_chest"), GOLD_CHEST);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "diamond_chest"), DIAMOND_CHEST);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "copper_chest"), COPPER_CHEST);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "silver_chest"), SILVER_CHEST);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "crystal_chest"), CRYSTAL_CHEST);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "obsidian_chest"), OBSIDIAN_CHEST);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "holiday_chest"), HOLIDAY_CHEST);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "dirt_chest"), DIRT_CHEST);

        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "wood_iron_upgrade"), WOOD_IRON_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "wood_copper_upgrade"), WOOD_COPPER_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "copper_silver_upgrade"), COPPER_SILVER_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "copper_iron_upgrade"), COPPER_IRON_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "silver_gold_upgrade"), SILVER_GOLD_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "iron_gold_upgrade"), IRON_GOLD_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "gold_diamond_upgrade"), GOLD_DIAMOND_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "diamond_crystal_upgrade"), DIAMOND_CRYSTAL_UPGRADE);
        Registry.register(Registry.ITEM, new Identifier(IronChests.MOD_ID, "diamond_obsidian_upgrade"), DIAMOND_OBSIDIAN_UPGRADE);
    }

    static {
        CompoundTag tag = dirtChestGuideBook.getOrCreateTag();
        tag.putString("title", "How to Use Your DirtChest 9000!");
        tag.putString("author", "TechnoVision");
        ListTag pages = new ListTag();
        pages.add(StringTag.of(Text.Serializer.toJson(new TranslatableText("book.ironchest.guidebook.page1"))));
        pages.add(StringTag.of(Text.Serializer.toJson(new TranslatableText("book.ironchest.guidebook.page2"))));
        pages.add(StringTag.of(Text.Serializer.toJson(new TranslatableText("book.ironchest.guidebook.page3"))));
        pages.add(StringTag.of(Text.Serializer.toJson(new TranslatableText("book.ironchest.guidebook.page4"))));
        pages.add(StringTag.of(Text.Serializer.toJson(new TranslatableText("book.ironchest.guidebook.page5"))));
        tag.put("pages", pages);
        dirtChestGuideBook.setTag(tag);
    }
}
