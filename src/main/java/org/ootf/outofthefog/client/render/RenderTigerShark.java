package org.ootf.outofthefog.client.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import org.ootf.outofthefog.client.models.ModelTigerShark;
import org.ootf.outofthefog.entity.EntityVastatosaurusRex;/*FIXME*/
import org.ootf.outofthefog.util.ResourceHelper;

import javax.annotation.Nullable;

public class RenderTigerShark extends RenderLiving<EntityVastatosaurusRex/*FIXME*/>
{
    private static final ResourceLocation TEXTURE = ResourceHelper.entityTexture("tiger_shark");

    public RenderTigerShark(RenderManager rendermanagerIn)
    {
        super(rendermanagerIn, new ModelTigerShark(), 0.1f/*FIXME*/);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityVastatosaurusRex/*FIXME*/ entity)
    {
        return TEXTURE;
    }
}