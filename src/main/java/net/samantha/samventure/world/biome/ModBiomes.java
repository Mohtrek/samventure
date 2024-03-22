package net.samantha.samventure.world.biome;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.samantha.samventure.Samventure;

public class ModBiomes {
    public static final ResourceKey<Biome> HAUNTED_WOODS = ResourceKey.create(Registry.BIOME_REGISTRY,
            new ResourceLocation(Samventure.MOD_ID, "haunted_woods"));

}
