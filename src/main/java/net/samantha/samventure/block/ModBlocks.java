package net.samantha.samventure.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.samantha.samventure.Samventure;
import net.samantha.samventure.item.ModCreativeModeTab;
import net.samantha.samventure.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Samventure.MOD_ID);

    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Samventure_Blocks_Tab);
    public static final RegistryObject<Block> CUT_TIN = registerBlock("cut_tin",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Samventure_Blocks_Tab);
    public static final RegistryObject<Block> CUT_TIN_SLAB = registerBlock("cut_tin_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Samventure_Blocks_Tab);
    public static final RegistryObject<Block> CUT_TIN_STAIRS = registerBlock("cut_tin_stairs",
            () -> new StairBlock(() -> ModBlocks.CUT_TIN.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Samventure_Blocks_Tab);
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.Samventure_Blocks_Tab);
    public static final RegistryObject<Block> TIN_ORE_DEEPSLATE = registerBlock("tin_ore_deepslate",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.Samventure_Blocks_Tab);
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Samventure_Blocks_Tab);
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.Samventure_Blocks_Tab);
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
