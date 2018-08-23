package org.ootf.outofthefog.world.dimension;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ITeleporter;

import java.util.Random;

public class TeleporterSkullIsland implements ITeleporter
{
    private static final Random random = new Random();

    @Override
    public void placeEntity(World world, Entity entity, float yaw)
    {
        int x = MathHelper.floor(entity.posX) + random.nextInt(800) - 400;
        int z = MathHelper.floor(entity.posZ) + random.nextInt(800) - 400;
        int y = world.getTopSolidOrLiquidBlock(new BlockPos(x, entity.posY, z)).getY();

        entity.setLocationAndAngles(x, y, z, entity.rotationYaw, entity.rotationPitch);
        entity.motionX = 0;
        entity.motionY = 0;
        entity.motionZ = 0;
    }
}
