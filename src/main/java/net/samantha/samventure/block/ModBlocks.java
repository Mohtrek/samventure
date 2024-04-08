package net.samantha.samventure.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.samantha.samventure.Samventure;
import net.samantha.samventure.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Samventure.MOD_ID);

    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));
    public static final RegistryObject<Block> CUT_TIN = registerBlock("cut_tin",
            () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.TIN_BLOCK.get())));
    public static final RegistryObject<Block> CUT_TIN_SLAB = registerBlock("cut_tin_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.TIN_BLOCK.get())));
    public static final RegistryObject<Block> CUT_TIN_STAIRS = registerBlock("cut_tin_stairs",
            () -> new StairBlock(() -> ModBlocks.CUT_TIN.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(ModBlocks.TIN_BLOCK.get())));
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TIN_ORE_DEEPSLATE = registerBlock("tin_ore_deepslate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(4.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW)
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> FROZEN_LIGHT = registerBlock("frozen_light",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE)
                    .strength(.3f).sound(SoundType.GLASS).requiresCorrectToolForDrops().friction(0.98F)
                    .lightLevel((p_60954_) -> {return 11;})));
    public static final RegistryObject<Block> SLUSH = registerBlock("slush",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .strength(0.5f).sound(SoundType.SNOW)));
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
