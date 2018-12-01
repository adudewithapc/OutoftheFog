package org.ootf.outofthefog.entity.humen;

import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import org.ootf.outofthefog.entity.EntityVastatosaurusRex;

import javax.annotation.Nullable;

public class EntityRamakongFarmer extends EntityRamakong
{
    public EntityRamakongFarmer(World worldIn)
    {
        super(worldIn);
    }

    @Override
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAvoidEntity<>(this, EntityVastatosaurusRex.class, 32, 1, 1.5));
        this.tasks.addTask(2, new EntityAIAttackMelee(this, 1, false));
        this.tasks.addTask(4, new EntityAIWanderAvoidWater(this, 1));
        this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 16));
        this.tasks.addTask(6, new EntityAILookIdle(this));
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20);
        getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(1);
    }

    @Nullable
    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
    {
        setMale(rand.nextBoolean());
        return super.onInitialSpawn(difficulty, livingdata);
    }
}
