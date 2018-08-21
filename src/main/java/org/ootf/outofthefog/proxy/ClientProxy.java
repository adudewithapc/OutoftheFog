package org.ootf.outofthefog.proxy;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import org.ootf.outofthefog.client.models.ModelClam;
import org.ootf.outofthefog.client.models.ModelVastatosaurusRex;
import org.ootf.outofthefog.client.render.RenderClam;
import org.ootf.outofthefog.client.render.RenderVastasaurusRex;
import org.ootf.outofthefog.entity.EntityClam;
import org.ootf.outofthefog.entity.EntityVastatosaurusRex;

public class ClientProxy implements IProxy
{
    @Override
    public void preInit()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityVastatosaurusRex.class, manager -> new RenderVastasaurusRex(manager, new ModelVastatosaurusRex(), 0.5f));

        RenderingRegistry.registerEntityRenderingHandler(EntityClam.class, manager -> new RenderClam(manager, new ModelClam(), 0.1f));
    }
}
