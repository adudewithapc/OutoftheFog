package org.ootf.outofthefog.entity;

// FIXME

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityTigerShark extends EntityLiving
{
    public EntityTigerShark(World worldIn)
    {
        super(worldIn);
        this.setSize(0.8f, 0.2f);//TODO
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        //TODO
        getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.5);
        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2);
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return null;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound()
    {
        return null;
    }

    @Nullable
    @Override
    protected ResourceLocation getLootTable()
    {
        return null;//TODO
    }
}
