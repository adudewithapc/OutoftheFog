package org.ootf.outofthefog.client.render.humen;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import org.ootf.outofthefog.entity.humen.EntityRamakongFarmer;
import org.ootf.outofthefog.util.ResourceHelper;

import javax.annotation.Nullable;

public class RenderRamakongFarmer extends RenderLiving<EntityRamakongFarmer>
{
    private static final ResourceLocation TEXTURE_MALE = ResourceHelper.entityTexture("ramakong_farmer_male");
    private static final ResourceLocation TEXTURE_FEMALE = ResourceHelper.entityTexture("ramakong_farmer_female");

    public RenderRamakongFarmer(RenderManager rendermanagerIn)
    {
        super(rendermanagerIn, new ModelBiped(), 0.4f);
    }

    @Override
    public void doRender(EntityRamakongFarmer entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        mainModel = entity.isMale() ? new ModelBiped() : new ModelPlayer(1, true);
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityRamakongFarmer entity)
    {
        return entity.isMale() ? TEXTURE_MALE : TEXTURE_FEMALE;
    }
}
