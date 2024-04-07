package net.samantha.samventure;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.samantha.samventure.block.ModBlocks;
import net.samantha.samventure.item.ModCreativeModeTab;
import net.samantha.samventure.item.ModItems;
import net.samantha.samventure.world.feature.ModConfiguredFeatures;
import net.samantha.samventure.world.feature.ModPlacedFeatures;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Samventure.MOD_ID)
public class Samventure {
    public static final String MOD_ID = "samventure";
    private static final Logger LOGGER = LogUtils.getLogger();
    public Samventure() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTab.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTab() == ModCreativeModeTab.Samventure_Blocks_Tab.get()) {
            event.accept(ModBlocks.TIN_ORE);
            event.accept(ModBlocks.TIN_ORE_DEEPSLATE);
            event.accept(ModBlocks.RAW_TIN_BLOCK);
            event.accept(ModBlocks.TIN_BLOCK);
            event.accept(ModBlocks.CUT_TIN);
            event.accept(ModBlocks.CUT_TIN_SLAB);
            event.accept(ModBlocks.CUT_TIN_STAIRS);
            event.accept(ModBlocks.BRONZE_BLOCK);
            event.accept(ModBlocks.SLUSH);
            event.accept(ModBlocks.FROZEN_LIGHT);
        }

        if(event.getTab() == ModCreativeModeTab.Samventure_Ingredients_Tab.get()) {
            event.accept(ModItems.RAW_TIN);
            event.accept(ModItems.TIN_INGOT);
        }

        if(event.getTab() == ModCreativeModeTab.Samventure_Equipment_Tab.get()) {
            event.accept(ModItems.BRONZE_SWORD);
            event.accept(ModItems.BRONZE_PICKAXE);
            event.accept(ModItems.BRONZE_AXE);
            event.accept(ModItems.BRONZE_SHOVEL);
            event.accept(ModItems.BRONZE_HOE);
            /*event.accept(ModItems.BRONZE_HELMET);
            event.accept(ModItems.BRONZE_CHESTPLATE);
            event.accept(ModItems.BRONZE_LEGGINGS);
            event.accept(ModItems.BRONZE_BOOTS);*/
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
