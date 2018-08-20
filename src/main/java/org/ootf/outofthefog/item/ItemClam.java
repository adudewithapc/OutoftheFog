package org.ootf.outofthefog.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.ootf.outofthefog.entity.EntityClam;

public class ItemClam extends Item
{
    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if(facing == EnumFacing.UP)
        {
            if(!worldIn.isRemote)
            {
                BlockPos spawnPos = pos.up();

                EntityClam clam = new EntityClam(worldIn);
                clam.setPosition(spawnPos.getX(), spawnPos.getY(), spawnPos.getZ());

                worldIn.spawnEntity(clam);
            }
            player.swingArm(hand);

            if(!player.isCreative())
                player.getHeldItem(hand).shrink(1);

            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.FAIL;
    }
}
