package net.samantha.samventure.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.samantha.samventure.Samventure;
import net.samantha.samventure.block.ModBlocks;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            Samventure.MOD_ID);

    public static RegistryObject<CreativeModeTab> Samventure_Blocks_Tab = CREATIVE_MODE_TABS.register("samventure_blocks_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.RAW_TIN_BLOCK.get()))
                    .title(Component.translatable("samventure_blocks_tab")).build());
    public static RegistryObject<CreativeModeTab> Samventure_Ingredients_Tab = CREATIVE_MODE_TABS.register("samventure_ingredients_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TIN_INGOT.get()))
                    .title(Component.translatable("samventure_ingredients_tab")).build());
    public static RegistryObject<CreativeModeTab> Samventure_Equipment_Tab = CREATIVE_MODE_TABS.register("samventure_equipment_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRONZE_PICKAXE.get()))
                    .title(Component.translatable("samventure_equipment_tab")).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
