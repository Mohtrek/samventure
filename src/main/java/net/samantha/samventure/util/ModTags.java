package net.samantha.samventure.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.samantha.samventure.Samventure;

public class ModTags {
    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Samventure.MOD_ID, name));
        }
    }
}
