package org.ootf.outofthefog.init;

import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;
import org.ootf.outofthefog.util.Reference;
import org.ootf.outofthefog.util.ResourceHelper;

@EventBusSubscriber(modid = Reference.MOD_ID)
@ObjectHolder(Reference.MOD_ID)
public class ModSounds
{
    @ObjectHolder("vastatosaurus_bite")
    public static final SoundEvent ENTITY_VASTATOSAURUS_BITE = null;

    @ObjectHolder("vastatosaurus_death")
    public static final SoundEvent ENTITY_VASTATOSAURUS_DEATH = null;

    @ObjectHolder("vastatosaurus_hurt")
    public static final SoundEvent ENTITY_VASTATOSAURUS_HURT = null;

    @ObjectHolder("vastatosaurus_living")
    public static final SoundEvent ENTITY_VASTATOSAURUS_LIVING = null;

    @ObjectHolder("vastatosaurus_roar")
    public static final SoundEvent ENTITY_VASTATOSAURUS_ROAR = null;

    @SubscribeEvent
    public static void registerSounds(RegistryEvent.Register<SoundEvent> event)
    {
        IForgeRegistry<SoundEvent> forgeRegistry = event.getRegistry();

        registerSound("vastatosaurus_bite", forgeRegistry);
        registerSound("vastatosaurus_death", forgeRegistry);
        registerSound("vastatosaurus_hurt", forgeRegistry);
        registerSound("vastatosaurus_living", forgeRegistry);
        registerSound("vastatosaurus_roar", forgeRegistry);
    }

    private static void registerSound(String location, IForgeRegistry<SoundEvent> forgeRegistry)
    {
        SoundEvent soundEvent = new SoundEvent(ResourceHelper.createResource(location));
        soundEvent.setRegistryName(ResourceHelper.createResource(location));
        forgeRegistry.register(soundEvent);
    }
}
