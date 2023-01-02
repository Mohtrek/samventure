package net.samantha.samventure.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.samantha.samventure.block.ModBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab Samventure_Blocks_Tab = new CreativeModeTab("samventureblockstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.RAW_TIN_BLOCK.get());
        }
    };
    public static final CreativeModeTab Samventure_Misc_Tab = new CreativeModeTab("samventuremisctab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_TIN.get());
        }
    };
    public static final CreativeModeTab Samventure_Equipment_Tab = new CreativeModeTab("samventureequipmenttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BRONZE_SWORD.get());
        }
    };
}
