package org.ootf.outofthefog.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import org.ootf.outofthefog.OOTFConfig;
import org.ootf.outofthefog.world.dimension.TeleporterSkullIsland;

public class ItemMysteriousMap extends Item
{
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        if (!worldIn.isRemote)
        {
            EntityPlayerMP playerMP = (EntityPlayerMP) playerIn;
            playerMP.mcServer.getPlayerList().transferPlayerToDimension(playerMP, playerIn.dimension == OOTFConfig.skullIslandID ? 0 : OOTFConfig.skullIslandID, new TeleporterSkullIsland());
        }

        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}
