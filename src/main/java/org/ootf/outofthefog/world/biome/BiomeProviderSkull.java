package org.ootf.outofthefog.world.biome;

import com.google.common.collect.Lists;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.storage.WorldInfo;

import java.util.ArrayList;
import java.util.List;

public class BiomeProviderSkull extends BiomeProvider
{
    private final List<Biome> biomesToSpawn;

    public BiomeProviderSkull(WorldInfo worldInfo, Biome... biomes)
    {
        super(worldInfo);
        biomesToSpawn = new ArrayList<>();
        biomesToSpawn.addAll(Lists.newArrayList(biomes));
    }

    @Override
    public List<Biome> getBiomesToSpawnIn()
    {
        return biomesToSpawn;
    }
}
