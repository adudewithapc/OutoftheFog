package org.ootf.outofthefog.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public abstract class EntityHostileGrowable extends EntityOOTFHostile
{
    protected static final DataParameter<Boolean> BABY = EntityDataManager.createKey(EntityHostileGrowable.class, DataSerializers.BOOLEAN);
    protected int growingAge;
    protected int forcedAge;
    protected int forcedAgeTimer;

    public EntityHostileGrowable(World worldIn)
    {
        super(worldIn);
    }

    @Nullable
    public abstract EntityHostileGrowable createChild(EntityHostileGrowable entityHostileGrowable);

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if(world.isRemote)
        {
            if(forcedAgeTimer > 0)
            {
                if(forcedAgeTimer % 4 == 0)
                    world.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + 0.5D + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, 0.0D, 0.0D, 0.0D);
                --forcedAgeTimer;
            }
        }
        else
        {
            int growingAge = getGrowingAge();

            if(growingAge < 0)
            {
                ++growingAge;
                this.setGrowingAge(growingAge);

                if(growingAge == 0)
                    onGrowingAdult();
            }
            else if(growingAge > 0)
            {
                --growingAge;
                setGrowingAge(growingAge);
            }
        }
    }

    @Override
    protected boolean processInteract(EntityPlayer player, EnumHand hand)
    {
        ItemStack itemStack = player.getHeldItem(hand);

        if(itemStack.getItem() == Items.SPAWN_EGG)
        {
            if(!world.isRemote)
            {
                Class<? extends Entity> entityClass = EntityList.getClass(ItemMonsterPlacer.getNamedIdFrom(itemStack));

                if(entityClass != null && entityClass == this.getClass())
                {
                    EntityHostileGrowable entityGrowable = this.createChild(this);

                    if(entityGrowable != null)
                    {
                        entityGrowable.setGrowingAge(getNewbornAge());
                        entityGrowable.setLocationAndAngles(posX, posY, posZ, 0, 0);
                        world.spawnEntity(entityGrowable);

                        if (itemStack.hasDisplayName())
                        {
                            entityGrowable.setCustomNameTag(itemStack.getDisplayName());
                        }

                        if (!player.capabilities.isCreativeMode)
                        {
                            itemStack.shrink(1);
                        }
                    }
                }
            }

            return true;
        }

        return false;
    }

    public void setGrowingAge(int age)
    {
        dataManager.set(BABY, age < 0);
        this.growingAge = age;
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        dataManager.register(BABY, false);
    }

    public int getGrowingAge()
    {
        if(world.isRemote)
        {
            return dataManager.get(BABY) ? -1 : 1;
        }
        return growingAge;
    }

    public void ageUp(int growthSeconds, boolean updateForcedAge)
    {
        int growingAge = this.getGrowingAge();
        int previousAge = growingAge;
        growingAge += growthSeconds * 20;

        if(growingAge > 0)
        {
            growingAge = 0;

            if(previousAge < 0 && canGrow())
                this.onGrowingAdult();
        }

        int ageDifference = growingAge - previousAge;
        this.setGrowingAge(growingAge);

        if(updateForcedAge)
        {
            this.forcedAge += ageDifference;

            if(forcedAge == 0)
                forcedAgeTimer = 40;
        }

        if(getGrowingAge() == 0)
            setGrowingAge(forcedAge);
    }

    public void addGrowth(int growth)
    {
        ageUp(growth, false);
    }

    protected int getNewbornAge()
    {
        return -24000;
    }

    public boolean canGrow()
    {
        return true;
    }

    protected void onGrowingAdult() {}

    @Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);

        compound.setInteger("age", getGrowingAge());
        compound.setInteger("forcedAge", forcedAge);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);

        setGrowingAge(compound.getInteger("age"));
        this.forcedAge = compound.getInteger("forcedAge");
    }

    @Override
    public boolean isChild()
    {
        return getGrowingAge() < 0;
    }
}
