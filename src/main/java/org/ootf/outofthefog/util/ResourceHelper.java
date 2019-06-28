package org.ootf.outofthefog.util;

import net.minecraft.util.ResourceLocation;

public class ResourceHelper
{
    public static ResourceLocation createResource(String location)
    {
        return new ResourceLocation(Reference.MOD_ID, location);
    }

    public static ResourceLocation entityTexture(String textureName)
    {
        if(textureName.substring(textureName.length() - 4).equals(".png"))//TODO: replace with endsWith
            return createResource("textures/entities/" + textureName);
        return createResource("textures/entities/" + textureName + ".png");
    }

    public static ResourceLocation entityLoot(String location)
    {
        return createResource("entity/" + location);
    }
}
