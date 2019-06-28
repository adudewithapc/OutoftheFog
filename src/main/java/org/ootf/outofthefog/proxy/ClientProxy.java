package org.ootf.outofthefog.proxy;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import org.ootf.outofthefog.client.render.*;/*FIXME*/
import org.ootf.outofthefog.client.render.RenderScorpioPede;
import org.ootf.outofthefog.client.render.RenderVastatosaurusRex;
import org.ootf.outofthefog.client.render.butterfly.*;/*FIXME*/
import org.ootf.outofthefog.client.render.humen.*;/*FIXME*/
import org.ootf.outofthefog.entity.EntityClam;
import org.ootf.outofthefog.entity.EntityScorpioPede;
import org.ootf.outofthefog.entity.EntityVastatosaurusRex;
import org.ootf.outofthefog.entity.humen.EntityRamakongFarmer;

public class ClientProxy implements IProxy
{
    @Override
    public void preInit()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityVastatosaurusRex.class, RenderTigerShark/*FIXME*/::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityClam.class, RenderBloodfish/*FIXME*/::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityRamakongFarmer.class, RenderRamakongFarmer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityScorpioPede.class, RenderMosuraAeterna/*FIXME*/::new);
    }
}
