package org.ootf.outofthefog.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import org.ootf.outofthefog.init.ModItems;

import javax.annotation.Nullable;

public class EntityClam extends EntityLiving
{
    public EntityClam(World worldIn)
    {
        super(worldIn);
        this.setSize(0.8f, 0.2f);
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.5);
    }

    @Override
    protected boolean processInteract(EntityPlayer player, EnumHand hand)
    {
        if(player.getHeldItem(hand).isEmpty())
        {
            player.addItemStackToInventory(new ItemStack(ModItems.CLAM));
            player.swingArm(hand);
            setDead();
        }
        return true;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return null;
    }
}
