package net.samantha.samventure.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier BRONZE = new ForgeTier(2, 500, 6.5f, 2.5f, 16, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.BRONZE_INGOT.get()));
}
