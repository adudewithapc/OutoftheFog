package org.ootf.outofthefog.entity;

import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityOOTFHostile extends EntityMob
{
    public EntityOOTFHostile(World worldIn)
    {
        super(worldIn);
    }

    @Override
    protected void initEntityAI()
    {
        tasks.addTask(0, new EntityAISwimming(this));
        tasks.addTask(1, new EntityAIAttackMelee(this, 1, false));
        tasks.addTask(4, new EntityAIWanderAvoidWater(this, 1));
        tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 16));
        tasks.addTask(6, new EntityAILookIdle(this));
        targetTasks.addTask(0, new EntityAIHurtByTarget(this, false));
        targetTasks.addTask(1, new EntityAINearestAttackableTarget<>(this, EntityPlayer.class, true));
    }
}
