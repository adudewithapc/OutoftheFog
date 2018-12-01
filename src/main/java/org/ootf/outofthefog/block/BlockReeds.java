package org.ootf.outofthefog.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockReeds extends BlockDoublePlant
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
        else if(block != Blocks.GRASS && block != Blocks.DIRT)
        {
            return false;
        }
        else
        {
            System.out.println(worldIn.getBlockState(pos));

            for(EnumFacing facing : EnumFacing.HORIZONTALS)
            {

                if(worldIn.getBlockState(pos.offset(facing)).getMaterial() == Material.WATER)
                    return true;
            }

            return false;
        }
    }
}
