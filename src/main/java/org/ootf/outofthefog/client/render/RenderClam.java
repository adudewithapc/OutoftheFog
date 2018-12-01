package org.ootf.outofthefog.client.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import org.ootf.outofthefog.client.models.ModelClam;
import org.ootf.outofthefog.entity.EntityClam;
import org.ootf.outofthefog.util.ResourceHelper;

import javax.annotation.Nullable;

public class RenderClam extends RenderLiving<EntityClam>
{
    private static final ResourceLocation TEXTURE = ResourceHelper.entityTexture("clam");
    private static final ResourceLocation TEXTURE_PEARL = ResourceHelper.entityTexture("clam_pearl");

    public RenderClam(RenderManager rendermanagerIn)
    {
        super(rendermanagerIn, new ModelClam(), 0.1f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityClam entity)
    {
        return entity.hasPearl() ? TEXTURE_PEARL : TEXTURE;
    }
}
