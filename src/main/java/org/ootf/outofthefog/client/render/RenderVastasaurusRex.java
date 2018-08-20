package org.ootf.outofthefog.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import org.ootf.outofthefog.entity.EntityVastatosaurusRex;
import org.ootf.outofthefog.util.ResourceHelper;

import javax.annotation.Nullable;

public class RenderVastasaurusRex extends RenderLiving<EntityVastatosaurusRex>
{
    private static final ResourceLocation TEXTURE = ResourceHelper.entityTexture("vastasaurus_rex.png");

    public RenderVastasaurusRex(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn)
    {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityVastatosaurusRex entity)
    {
        return TEXTURE;
    }
}
