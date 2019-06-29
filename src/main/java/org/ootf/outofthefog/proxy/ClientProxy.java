package org.ootf.outofthefog.proxy;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import org.ootf.outofthefog.client.render.*;
import org.ootf.outofthefog.client.render.butterfly.*;
import org.ootf.outofthefog.client.render.humen.*;
import org.ootf.outofthefog.entity.*;
import org.ootf.outofthefog.entity.butterfly.*;
import org.ootf.outofthefog.entity.humen.*;

public class ClientProxy implements IProxy
{
    @Override
    public void preInit()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityVastatosaurusRex.class, RenderVastatosaurusRex::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityClam.class, RenderClam::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityRamakongFarmer.class, RenderRamakongFarmer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityScorpioPede.class, RenderScorpioPede::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityMosuraAeterna.class, RenderMosuraAeterna::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTigerShark.class, RenderTigerShark::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityBloodfish.class, RenderBloodfish::new);
    }
}
