package org.ootf.outofthefog;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.ootf.outofthefog.util.Reference;

@EventBusSubscriber
@Config(modid = Reference.MOD_ID, name = Reference.MOD_NAME)
@Config.LangKey("outofthefog.config.title")
public class OOTFConfig
{
    @Config.Comment("Dimension ID for skull island")
    @Config.Name("Skull Island ID")
    @Config.RequiresMcRestart
    public static int skullIslandID = -33;

    @SubscribeEvent
    public static void configChanged(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.getModID().equals(Reference.MOD_ID))
        {
            ConfigManager.sync(Reference.MOD_ID, Config.Type.INSTANCE);
        }
    }
}
