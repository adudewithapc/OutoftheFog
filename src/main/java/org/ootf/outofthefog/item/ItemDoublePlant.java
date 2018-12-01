package org.ootf.outofthefog.item;

import net.minecraft.block.SoundType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.ootf.outofthefog.block.BlockDoublePlant;

public class ItemDoublePlant extends ItemBlock
{
    public ItemDoublePlant(BlockDoublePlant plant)
    {
        super(plant);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if(facing != EnumFacing.UP)
            return EnumActionResult.FAIL;

        if(!worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos))
            pos = pos.offset(facing);

        ItemStack stack = player.getHeldItem(hand);

        if(player.canPlayerEdit(pos, facing, stack) && this.block.canPlaceBlockAt(worldIn, pos))
        {
            worldIn.setBlockState(pos, block.getDefaultState().withProperty(BlockDoublePlant.TOP, false));
            worldIn.setBlockState(pos.up(), block.getDefaultState().withProperty(BlockDoublePlant.TOP, true));
            worldIn.playSound(player, pos, SoundEvents.BLOCK_GRASS_PLACE, SoundCategory.BLOCKS, (SoundType.PLANT.getVolume() + 1) / 2, SoundType.PLANT.getPitch() * 0.8f);
            if(!player.isCreative()) stack.shrink(1);
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.FAIL;
    }
}
