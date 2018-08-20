package org.ootf.outofthefog.event;

import com.google.common.collect.Sets;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.SetCount;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.ootf.outofthefog.init.ModItems;
import org.ootf.outofthefog.util.Reference;

import java.util.Set;

@EventBusSubscriber(modid = Reference.MOD_ID)
public class GenerationEvents
{
    private static final Set<ResourceLocation> mapFragmentTables = Sets.newHashSet(LootTableList.CHESTS_ABANDONED_MINESHAFT, LootTableList.CHESTS_DESERT_PYRAMID, LootTableList.CHESTS_JUNGLE_TEMPLE, LootTableList.CHESTS_STRONGHOLD_LIBRARY, LootTableList.CHESTS_WOODLAND_MANSION, LootTableList.CHESTS_NETHER_BRIDGE, LootTableList.CHESTS_END_CITY_TREASURE);

    @SubscribeEvent
    public static void loadLootTables(LootTableLoadEvent event)
    {
        ResourceLocation lootTableName = event.getName();
        LootTable lootTable = event.getTable();

        if(mapFragmentTables.contains(lootTableName))
        {
            SetCount fragmentCount = new SetCount(new LootCondition[] {}, new RandomValueRange(1));
            LootEntryItem lootEntry = new LootEntryItem(ModItems.MAP_FRAGMENT, 5, 1, new LootFunction[] {fragmentCount}, new LootCondition[] {}, "map_fragments");
            LootPool lootPool = new LootPool(new LootEntry[] {lootEntry}, new LootCondition[] {}, new RandomValueRange(1), new RandomValueRange(0), "map_fragment_pool");
            lootTable.addPool(lootPool);
        }
    }
}
