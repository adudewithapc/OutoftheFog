package org.ootf.outofthefog.entity;

// FIXME

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityBloodfish extends EntityLiving
{
    private static final DataParameter<Boolean> IS_FEMALE = EntityDataManager.createKey(EntityBloodfish.class, DataSerializers.BOOLEAN);

    public EntityBloodfish(World worldIn)
    {
        super(worldIn);
        this.setSize(0.8f, 0.2f);//TODO
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setBoolean("isFemale", isFemale());
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        if (compound.hasKey("isFemale")) {
            setFemale(compound.getBoolean("isFemale"));
        }
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        dataManager.register(IS_FEMALE, false);
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
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
    {
        setFemale(rand.nextInt(99) <= 19);//TODO

        return livingdata;
    }

    public void setFemale(boolean hasPearl)
    {
        dataManager.set(IS_FEMALE, hasPearl);
    }

    public boolean isFemale()
    {
        return dataManager.get(IS_FEMALE);
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
