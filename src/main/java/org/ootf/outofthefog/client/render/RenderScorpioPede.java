package org.ootf.outofthefog.client.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import org.ootf.outofthefog.client.models.ModelScorpioPede;
import org.ootf.outofthefog.entity.EntityScorpioPede;
import org.ootf.outofthefog.util.ResourceHelper;

import javax.annotation.Nullable;

public class RenderScorpioPede extends RenderLiving<EntityScorpioPede>
{
    private static final ResourceLocation TEXTURE = ResourceHelper.entityTexture("scorpio-pede");

    public RenderScorpioPede(RenderManager rendermanagerIn)
    {
        super(rendermanagerIn, new ModelScorpioPede(), 0.3f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityScorpioPede entity)
    {
        return TEXTURE;
    }
}
