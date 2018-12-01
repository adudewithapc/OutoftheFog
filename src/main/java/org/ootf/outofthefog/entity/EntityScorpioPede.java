package org.ootf.outofthefog.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EntityScorpioPede extends EntityOOTFHostile
{
    public EntityScorpioPede(World worldIn)
    {
        super(worldIn);
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8);
        getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(7);
        getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5);
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn)
    {
        if(entityIn instanceof EntityLivingBase && rand.nextInt(100) <= 50)
            ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.POISON, 100));
        return super.attackEntityAsMob(entityIn);
    }
}
