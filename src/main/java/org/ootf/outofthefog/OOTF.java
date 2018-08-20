package org.ootf.outofthefog;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.ootf.outofthefog.init.ModItems;
import org.ootf.outofthefog.proxy.IProxy;

import static org.ootf.outofthefog.util.Reference.*;

@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION)
public class OOTF
{
    public static final CreativeTabs TAB_OOTF = new CreativeTabs("tabOOTF")
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModItems.MYSTERIOUS_MAP);
        }
    };

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();

        GameRegistry.addSmelting(ModItems.INVERTEBRATE_FLESH_RAW, new ItemStack(ModItems.INVERTEBRATE_FLESH_COOKED), );
    }

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
    public static IProxy proxy;
}
