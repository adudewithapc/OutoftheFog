package org.ootf.outofthefog.world.dimension;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ITeleporter;

public class TeleporterSkullIsland implements ITeleporter
{
    @Override
    public void placeEntity(World world, Entity entity, float yaw)
    {
        int x = MathHelper.floor(entity.posX);
        int y = MathHelper.floor(entity.posY) + 1;
        int z = MathHelper.floor(entity.posZ);

        entity.setLocationAndAngles(x, y, z, entity.rotationYaw, entity.rotationPitch);
        entity.motionX = 0;
        entity.motionY = 0;
        entity.motionZ = 0;
    }
}
