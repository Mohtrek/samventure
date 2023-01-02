package net.samantha.samventure.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.samantha.samventure.Samventure;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Samventure.MOD_ID);

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Samventure_Misc_Tab)));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Samventure_Misc_Tab)));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Samventure_Misc_Tab)));
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword",
            () -> new SwordItem(ModTiers.BRONZE, 2, -2.2f,
                    new Item.Properties().tab(ModCreativeModeTab.Samventure_Equipment_Tab)));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
            () -> new PickaxeItem(ModTiers.BRONZE, 1, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.Samventure_Equipment_Tab)));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe",
            () -> new AxeItem(ModTiers.BRONZE, 2, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.Samventure_Equipment_Tab)));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel",
            () -> new ShovelItem(ModTiers.BRONZE, 1, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.Samventure_Equipment_Tab)));
    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe",
            () -> new HoeItem(ModTiers.BRONZE, 0, -1f,
                    new Item.Properties().tab(ModCreativeModeTab.Samventure_Equipment_Tab)));
    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet",
            () -> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.Samventure_Equipment_Tab)));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.Samventure_Equipment_Tab)));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings",
            () -> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.Samventure_Equipment_Tab)));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots",
            () -> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.Samventure_Equipment_Tab)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
