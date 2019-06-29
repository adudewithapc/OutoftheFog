package org.ootf.outofthefog.init;

import net.minecraft.entity.Entity;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;
import org.ootf.outofthefog.entity.*;
import org.ootf.outofthefog.entity.humen.*;
import org.ootf.outofthefog.util.Reference;
import org.ootf.outofthefog.util.ResourceHelper;

import javax.annotation.Nullable;
import java.awt.*;

@EventBusSubscriber(modid = Reference.MOD_ID)
@ObjectHolder(Reference.MOD_ID)
public class ModEntities
{
    private static int entityID = -1;

    @ObjectHolder("vastatosaurus_rex")
    public static final EntityEntry VASTATOSAURUS_REX = null;

    @ObjectHolder("clam")
    public static final EntityEntry CLAM = null;

    @ObjectHolder("ramakong_farmer")
    public static final EntityEntry RAMAKONG_FARMER = null;

    @ObjectHolder("ramakong_chief")
    public static final EntityEntry RAMAKONG_CHIEF = null;

    @ObjectHolder("scorpio-pede")
    public static final EntityEntry SCORPIO_PEDE = null;

    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityEntry> event)
    {
        IForgeRegistry<EntityEntry> forgeRegistry = event.getRegistry();

        forgeRegistry.registerAll(
                getEntryBuilder(EntityVastatosaurusRex.class, "vastatosaurus_rex", 64, 3, false, Color.decode("#003a08"), Color.decode("#002805")).build(),
                getEntryBuilder(EntityClam.class, "clam", 64, 3, false, null, null).build(),
                getEntryBuilder(EntityRamakongFarmer.class, "ramakong_farmer", 64, 3, false, Color.decode("#4f2700"), Color.LIGHT_GRAY).build(),
                getEntryBuilder(EntityScorpioPede.class, "scorpio-pede", 64, 3, false, Color.decode("#5e2100"), Color.decode("#602c03")).build(),
                /*FIXME*/getEntryBuilder(EntityBloodfish.class, "bloodfish", 64, 3, false, null, null).build());
    }

    private static <E extends Entity> EntityEntryBuilder<E> getEntryBuilder(Class<E> entityClass, String name, int range, int updateFrequency, boolean sendsVelocityUpdates, @Nullable Color primaryColor, @Nullable Color secondaryColor)
    {
        EntityEntryBuilder<E> entryBuilder = EntityEntryBuilder.create();
        entryBuilder.name(name).entity(entityClass).id(ResourceHelper.createResource(name), entityID++).tracker(range, updateFrequency, sendsVelocityUpdates);
        if(primaryColor != null && secondaryColor != null) entryBuilder.egg(primaryColor.getRGB(), secondaryColor.getRGB());
        return entryBuilder;
    }
}
