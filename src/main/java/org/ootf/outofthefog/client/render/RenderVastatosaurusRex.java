package org.ootf.outofthefog.client.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import org.ootf.outofthefog.client.models.ModelVastatosaurusRex;
import org.ootf.outofthefog.entity.EntityVastatosaurusRex;
import org.ootf.outofthefog.util.ResourceHelper;

import javax.annotation.Nullable;

public class RenderVastatosaurusRex extends RenderLiving<EntityVastatosaurusRex>
{
    private static final ResourceLocation TEXTURE_MALE = ResourceHelper.entityTexture("vastasaurus_rex_male.png");
    private static final ResourceLocation TEXTURE_FEMALE = ResourceHelper.entityTexture("vastasaurus_rex_female.png");

    public RenderVastatosaurusRex(RenderManager rendermanagerIn)
    {
        super(rendermanagerIn, new ModelVastatosaurusRex(), 0.5f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityVastatosaurusRex entity)
    {
        return entity.isMale() ? TEXTURE_MALE : TEXTURE_FEMALE;
    }
}
