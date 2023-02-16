package com.exline.boneequipment.init;

import com.exline.boneequipment.BoneEquipmentMain;
import com.exline.boneequipment.item.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit {
    //armor material
    public static final ArmorMaterial BONE_ARMOR_MATERIAL = new BoneArmorMaterial();

    public static ToolItem BONE_SWORD = new SwordItem(BoneToolMaterial.INSTANCE, 0, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    //armor items
    public static final Item BONE_HELMET = new ArmorItem(BONE_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item BONE_CHESTPLATE = new ArmorItem(BONE_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item BONE_LEGGINGS = new ArmorItem(BONE_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item BONE_BOOTS = new ArmorItem(BONE_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    //tool items, tool material is registered elsewhere
    public static ToolItem BONE_SHOVEL = new ShovelItem(BoneToolMaterial.INSTANCE, -1.5F, -3F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem BONE_PICKAXE = new ModPickaxeItem(BoneToolMaterial.INSTANCE, -2, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem BONE_AXE = new ModAxeItem(BoneToolMaterial.INSTANCE, 3.3F, -3.1F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem BONE_HOE = new ModHoeItem(BoneToolMaterial.INSTANCE, -2.7F, 0F, new Item.Settings().group(ItemGroup.TOOLS));
    //horse armor
    public static HorseArmorItem BONE_HORSE_ARMOR = new HorseArmorItem(4,"bone",new Item.Settings().group(ItemGroup.MISC));

    public static void registerItems(){
        registerItem(BONE_SWORD, "bone_sword");

        registerItem(BONE_HELMET, "bone_helmet");
        registerItem(BONE_CHESTPLATE, "bone_chestplate");
        registerItem(BONE_LEGGINGS, "bone_leggings");
        registerItem(BONE_BOOTS, "bone_boots");

        registerItem(BONE_SHOVEL, "bone_shovel");
        registerItem(BONE_PICKAXE, "bone_pickaxe");
        registerItem(BONE_AXE, "bone_axe");
        registerItem(BONE_HOE, "bone_hoe");

        registerItem(BONE_HORSE_ARMOR, "bone_horse_armor");
    }

    //default register item
    public static void registerItem(Item item, String name){
        Registry.register(Registry.ITEM, new Identifier(BoneEquipmentMain.MOD_ID, name), item);
    }
}