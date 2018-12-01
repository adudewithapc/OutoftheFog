package org.ootf.outofthefog.entity.humen;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public class EntityRamakong extends EntityNativeHuman
{
    private static final DataParameter<Boolean> MALE = EntityDataManager.createKey(EntityRamakong.class, DataSerializers.BOOLEAN);

    public EntityRamakong(World worldIn)
    {
        super(worldIn);
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        dataManager.register(MALE, true);
    }

    public void setMale(boolean male)
    {
        dataManager.set(MALE, male);
    }

    public boolean isMale()
    {
        return dataManager.get(MALE);
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);

        compound.setBoolean("male", isMale());
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);

        setMale(compound.getBoolean("male"));
    }
}
