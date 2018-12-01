package org.ootf.outofthefog.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import org.ootf.outofthefog.init.ModItems;
import org.ootf.outofthefog.init.ModLootTables;

import javax.annotation.Nullable;

public class EntityClam extends EntityLiving
{
    private static final DataParameter<Boolean> HAS_PEARL = EntityDataManager.createKey(EntityClam.class, DataSerializers.BOOLEAN);

    public EntityClam(World worldIn)
    {
        super(worldIn);
        this.setSize(0.8f, 0.2f);
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        dataManager.register(HAS_PEARL, false);
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.5);
        getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2);
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
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
    {
        setHasPearl(rand.nextInt(99) <= 19);

        return livingdata;
    }

    public void setHasPearl(boolean hasPearl)
    {
        dataManager.set(HAS_PEARL, hasPearl);
    }

    public boolean hasPearl()
    {
        return dataManager.get(HAS_PEARL);
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
        return hasPearl() ? ModLootTables.PEARL_CLAM : ModLootTables.CLAM;
    }
}
