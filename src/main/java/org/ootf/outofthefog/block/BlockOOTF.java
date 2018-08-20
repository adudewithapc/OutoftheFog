package org.ootf.outofthefog.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockOOTF extends Block
{
    public BlockOOTF(Material materialIn)
    {
        super(materialIn);
    }

    public Block setSoundType(SoundType soundType)
    {
        this.blockSoundType = soundType;
        return this;
    }
}
