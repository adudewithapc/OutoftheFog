package org.ootf.outofthefog.world.dimension;

import net.minecraft.init.Biomes;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import org.ootf.outofthefog.init.ModDimensions;

public class WorldProviderSkullIsland extends WorldProvider
{
    public WorldProviderSkullIsland()
    {
        biomeProvider = new BiomeProviderSingle(Biomes.PLAINS);
    }

    @Override
    public boolean isSurfaceWorld()
    {
        return false;
    }

    @Override
    public boolean canCoordinateBeSpawn(int x, int z)
    {
        return false;
    }

    @Override
    public boolean canRespawnHere()
    {
        return false;
    }

    @Override
    public DimensionType getDimensionType()
    {
        return ModDimensions.skullIslandDimension;
    }
}
