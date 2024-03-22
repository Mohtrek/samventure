package net.samantha.samventure.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.samantha.samventure.Samventure;
import net.samantha.samventure.block.ModBlocks;

@Mod.EventBusSubscriber(modid = Samventure.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab Samventure_Blocks_Tab;
    public static CreativeModeTab Samventure_Ingredients_Tab;
    public static CreativeModeTab Samventure_Equipment_Tab;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        Samventure_Blocks_Tab = event.registerCreativeModeTab(new ResourceLocation(Samventure.MOD_ID, "samventure_blocks_tab"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.RAW_TIN_BLOCK.get())).title(Component.translatable("samventure_blocks_tab")).build());
        Samventure_Ingredients_Tab = event.registerCreativeModeTab(new ResourceLocation(Samventure.MOD_ID, "samventure_ingredients_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.TIN_INGOT.get())).title(Component.translatable("samventure_ingredients_tab")).build());
        Samventure_Equipment_Tab = event.registerCreativeModeTab(new ResourceLocation(Samventure.MOD_ID, "samventure_equipment_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BRONZE_PICKAXE.get())).title(Component.translatable("samventure_equipment_tab")).build());
    };


    /*        = new CreativeModeTab("samventureblockstab") {
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
    };*/
}
