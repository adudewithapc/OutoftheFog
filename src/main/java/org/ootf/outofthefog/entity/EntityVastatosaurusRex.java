package org.ootf.outofthefog.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import org.ootf.outofthefog.init.ModSounds;

import javax.annotation.Nullable;

public class EntityVastatosaurusRex extends EntityHostileGrowable
{
    private static final DataParameter<Boolean> JUVENILE = EntityDataManager.createKey(EntityVastatosaurusRex.class, DataSerializers.BOOLEAN);

    public EntityVastatosaurusRex(World worldIn)
    {
        super(worldIn);
        this.setSize(2.5f, 3);
    }

    @Nullable
    @Override
    public EntityHostileGrowable createChild(EntityHostileGrowable entityHostileGrowable)
    {
        return new EntityVastatosaurusRex(world);
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        dataManager.register(JUVENILE, false);
    }

    public void setJuvenile(boolean juvenile)
    {
        dataManager.set(JUVENILE, juvenile);
    }

    public boolean isJuvenile()
    {
        return dataManager.get(JUVENILE);
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
        getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8);
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return ModSounds.ENTITY_VASTATOSAURUS_HURT;
    }

    @Override
    protected SoundEvent getDeathSound()
    {
        return ModSounds.ENTITY_VASTATOSAURUS_DEATH;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound()
    {
        return getAttackTarget() != null || getRevengeTarget() != null ? ModSounds.ENTITY_VASTATOSAURUS_ROAR : ModSounds.ENTITY_VASTATOSAURUS_LIVING;
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn)
    {
        playSound(ModSounds.ENTITY_VASTATOSAURUS_BITE, 1, 1);
        return super.attackEntityAsMob(entityIn);
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);

        compound.setBoolean("juvenile", isJuvenile());
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);

        setJuvenile(compound.getBoolean("juvenile"));
    }
}
