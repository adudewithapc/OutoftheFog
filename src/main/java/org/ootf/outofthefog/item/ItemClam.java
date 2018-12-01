package org.ootf.outofthefog.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.ootf.outofthefog.entity.EntityClam;

public class ItemClam extends Item
{
    public ItemClam()
    {
        this.setHasSubtypes(true);
    }

    @Override
    public String getTranslationKey(ItemStack stack)
    {
        return super.getTranslationKey(stack) + (stack.getMetadata() == 1 ? "_pearl" : "");
    }

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
                clam.setHasPearl(player.getHeldItem(hand).getMetadata() == 1);

                worldIn.spawnEntity(clam);
            }
            player.swingArm(hand);

            if(!player.isCreative())
                player.getHeldItem(hand).shrink(1);

            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.FAIL;
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        if(this.isInCreativeTab(tab))
        {
            items.add(new ItemStack(this));
            items.add(new ItemStack(this, 1, 1));
        }
    }
}
