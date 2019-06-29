package org.ootf.outofthefog.client.render.butterfly;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import org.ootf.outofthefog.client.models.ModelMosuraAeterna;
import org.ootf.outofthefog.entity.EntityScorpioPede;/*FIXME*/
import org.ootf.outofthefog.util.ResourceHelper;

import javax.annotation.Nullable;

public class RenderMosuraAeterna extends RenderLiving<EntityScorpioPede/*FIXME*/>
{
    private static final ResourceLocation TEXTURE = ResourceHelper.entityTexture("butterfly/mosura_aeterna");

    public RenderMosuraAeterna(RenderManager rendermanagerIn)
    {
        super(rendermanagerIn, new ModelMosuraAeterna(), 0.1f/*FIXME*/);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityScorpioPede/*FIXME*/ entity)
    {
        return TEXTURE;
    }
}