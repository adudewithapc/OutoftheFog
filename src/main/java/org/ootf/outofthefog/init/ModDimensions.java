package org.ootf.outofthefog.init;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import org.ootf.outofthefog.OOTFConfig;
import org.ootf.outofthefog.world.dimension.WorldProviderSkullIsland;

public class ModDimensions
{
    public static DimensionType skullIslandDimension = DimensionType.register("skull_island", "_skull_island", OOTFConfig.skullIslandID, WorldProviderSkullIsland.class, false);

    public static void registerDimensions()
    {
        DimensionManager.registerDimension(OOTFConfig.skullIslandID, skullIslandDimension);
    }
}
