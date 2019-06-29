package org.ootf.outofthefog.client.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import org.ootf.outofthefog.client.models.ModelBloodfish;
import org.ootf.outofthefog.entity.EntityBloodfish;
import org.ootf.outofthefog.util.ResourceHelper;

import javax.annotation.Nullable;

public class RenderBloodfish extends RenderLiving<EntityBloodfish>
{
    private static final ResourceLocation TEXTURE_MALE = ResourceHelper.entityTexture("bloodfish_male");
    private static final ResourceLocation TEXTURE_FEMALE = ResourceHelper.entityTexture("bloodfish_female");

    public RenderBloodfish(RenderManager rendermanagerIn)
    {
        super(rendermanagerIn, new ModelBloodfish(), 0.1f/*FIXME*/);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityBloodfish entity)
    {
        return entity.isFemale() ? TEXTURE_FEMALE : TEXTURE_MALE;
    }
}
