package com.exline.boneequipment.init;

import com.exline.boneequipment.BoneEquipmentMain;
import com.exline.boneequipment.item.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {
    //armor material
    public static final ArmorMaterial BONE_ARMOR_MATERIAL = new BoneArmorMaterial();

    public static ToolItem BONE_SWORD = new SwordItem(BoneToolMaterial.INSTANCE, 0, -2.4F, new Item.Settings());
    //armor items
    public static final Item BONE_HELMET = new ArmorItem(BONE_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings());
    public static final Item BONE_CHESTPLATE = new ArmorItem(BONE_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings());
    public static final Item BONE_LEGGINGS = new ArmorItem(BONE_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings());
    public static final Item BONE_BOOTS = new ArmorItem(BONE_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings());
    //tool items, tool material is registered elsewhere
    public static ToolItem BONE_SHOVEL = new ShovelItem(BoneToolMaterial.INSTANCE, -1.5F, -3F, new Item.Settings());
    public static ToolItem BONE_PICKAXE = new ModPickaxeItem(BoneToolMaterial.INSTANCE, -2, -2.8F, new Item.Settings());
    public static ToolItem BONE_AXE = new ModAxeItem(BoneToolMaterial.INSTANCE, 3.3F, -3.1F, new Item.Settings());
    public static ToolItem BONE_HOE = new ModHoeItem(BoneToolMaterial.INSTANCE, -2.7F, 0F, new Item.Settings());
    //horse armor
    public static HorseArmorItem BONE_HORSE_ARMOR = new HorseArmorItem(4,"bone",new Item.Settings());

    public static void registerItems(){
        registerItem(BONE_SWORD, "bone_sword");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(BONE_SWORD);});

        registerItem(BONE_HELMET, "bone_helmet");
        registerItem(BONE_CHESTPLATE, "bone_chestplate");
        registerItem(BONE_LEGGINGS, "bone_leggings");
        registerItem(BONE_BOOTS, "bone_boots");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(BONE_HELMET);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(BONE_CHESTPLATE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(BONE_LEGGINGS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(BONE_BOOTS);});

        registerItem(BONE_SHOVEL, "bone_shovel");
        registerItem(BONE_PICKAXE, "bone_pickaxe");
        registerItem(BONE_AXE, "bone_axe");
        registerItem(BONE_HOE, "bone_hoe");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(BONE_SHOVEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(BONE_PICKAXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(BONE_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(BONE_HOE);});

        registerItem(BONE_HORSE_ARMOR, "bone_horse_armor");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(BONE_HORSE_ARMOR);});
    }

    //default register item
    public static void registerItem(Item item, String name){
        Registry.register(Registries.ITEM, new Identifier(BoneEquipmentMain.MOD_ID, name), item);
    }
}