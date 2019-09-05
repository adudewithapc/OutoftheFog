package org.ootf.outofthefog.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockTallPlant extends BlockDoublePlant
{
    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        if(!super.canPlaceBlockAt(worldIn, pos))
            return false;

        pos = pos.down();
        IBlockState state = worldIn.getBlockState(pos);
        Block block = state.getBlock();

        if(block == this)
        {
            return false;
        }
        else if(block != Blocks.GRASS)
        {
            return false;
        }
        else
        {
            System.out.println(worldIn.getBlockState(pos));

            return true;
        }
    }
}
