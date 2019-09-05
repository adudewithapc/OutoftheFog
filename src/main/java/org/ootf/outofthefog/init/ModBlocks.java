package org.ootf.outofthefog.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.GameData;
import org.ootf.outofthefog.OutOfTheFog;
import org.ootf.outofthefog.block.*;
import org.ootf.outofthefog.util.Reference;

@EventBusSubscriber(modid = Reference.MOD_ID)
@ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    @ObjectHolder("cabbage_palm")
    public static final Block CABBAGE_PALM = Blocks.AIR;

    @ObjectHolder("thatch_block")
    public static final Block THATCH_BLOCK = Blocks.AIR;

    @ObjectHolder("reeds")
    public static final BlockDoublePlant REEDS = null;

    @ObjectHolder("ribbon_fern")
    public static final BlockBush RIBBON_FERN = null;

    @ObjectHolder("weta_fern")
    public static final BlockBush WETA_FERN = null;

    @ObjectHolder("indigofera")
    public static final BlockBush INDIGOFERA = null;

    @ObjectHolder("lasiandra")
    public static final BlockBush LASIANDRA = null;

    @ObjectHolder("stout_dragon")
    public static final BlockBush STOUT_DRAGON = null;

    @ObjectHolder("epiphyte_fern")
    public static final BlockBush EPIPHYTE_FERN = null;

    @ObjectHolder("horsetails")
    public static final BlockBush HORSETAILS = null;

    @ObjectHolder("tropical_foliage")
    public static final BlockBush TROPICAL_FOLIAGE = null;

    @ObjectHolder("fanleaf")
    public static final BlockBush FANLEAF = null;

    @ObjectHolder("umbrella_leaf")
    public static final BlockBush UMBRELLA_LEAF = null;

    @ObjectHolder("jacksons_entbark_sapling")
    public static final Block JACKSONS_ENTBARK_SAPLING = Blocks.SAPLING;


        @ObjectHolder("jacksons_entbark_planks")
        public static final Block JACKSONS_ENTBARK_PLANKS = Blocks.PLANKS;

        @ObjectHolder("jacksons_entbark_leaves")
        public static final Block JACKSONS_ENTBARK_LEAVES = Blocks.LEAVES;

        @ObjectHolder("jacksons_entbark_log")
        public static final Block JACKSONS_ENTBARK_LOG = Blocks.LOG;

        @ObjectHolder("fig_tree_planks")
        public static final Block FIG_TREE_PLANKS = Blocks.PLANKS;

        @ObjectHolder("fig_tree_leaves")
        public static final Block FIG_TREE_LEAVES = Blocks.LEAVES;

        @ObjectHolder("fig_tree_log")
        public static final Block FIG_TREE_LOG = Blocks.LOG;

        @ObjectHolder("banana_tree_leaves")
        public static final Block BANANA_TREE_LEAVES = Blocks.LEAVES;

        @ObjectHolder("banana_tree_log")
        public static final Block BANANA_TREE_LOG = Blocks.LOG;

        @ObjectHolder("toona_ciliata_planks")
        public static final Block TOONA_CILIATA_PLANKS = Blocks.PLANKS;

        @ObjectHolder("toona_ciliata_leaves")
        public static final Block TOONA_CILIATA_LEAVES = Blocks.LEAVES;

        @ObjectHolder("toona_ciliata_log")
        public static final Block TOONA_CILIATA_LOG = Blocks.LOG;

        @ObjectHolder("coconut_palm_planks")
        public static final Block COCONUT_PALM_PLANKS = Blocks.LOG;

        @ObjectHolder("coconut_palm_leaves")
        public static final Block COCONUT_PALM_LEAVES = Blocks.LEAVES;

        @ObjectHolder("coconut_palm_log")
        public static final Block COCONUT_PALM_LOG = Blocks.LOG;

        @ObjectHolder("snagglebranch_planks")
        public static final Block SNAGGLEBRANCH_PLANKS = Blocks.PLANKS;

        @ObjectHolder("snagglebranch_leaves")
        public static final Block SNAGGLEBRANCH_LEAVES = Blocks.LEAVES;

        @ObjectHolder("snagglebranch_log")
        public static final Block SNAGGLEBRANCH_LOG = Blocks.LOG;

        @ObjectHolder("swamproot_planks")
        public static final Block SWAMPROOT_PLANKS = Blocks.LEAVES;

        @ObjectHolder("swamproot_leaves")
        public static final Block SWAMPROOT_LEAVES = Blocks.LEAVES;

        @ObjectHolder("swamproot_log")
        public static final Block SWAMPROOT_LOG = Blocks.LOG;

        @ObjectHolder("umbrella_palm_planks")
        public static final Block UMBRELLA_PALM_PLANKS = Blocks.LOG;

        @ObjectHolder("umbrella_palm_leaves")
        public static final Block UMBRELLA_PALM_LEAVES = Blocks.LEAVES;

        @ObjectHolder("umbrella_palm_log")
        public static final Block UMBRELLA_PALM_LOG = Blocks.LOG;


    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(
                prepare(new BlockCabbagePalm(), "cabbage_palm"),
                prepare(new BlockOOTF(Material.PLANTS).setSoundType(SoundType.PLANT), "thatch_block"),
                prepare(new BlockReeds(), "reeds"),
                prepare(new BlockGrassPlant(),"ribbon_fern"),
                prepare(new BlockGrassPlant(),"weta_fern"),
                prepare(new BlockGrassPlant(),"indigofera"),
                prepare(new BlockGrassPlant(),"lasiandra"),
                prepare(new BlockGrassPlant(),"stout_dragon"),
                prepare(new BlockGrassPlant(),"epiphyte_fern"),
                prepare(new BlockGrassPlant(),"tropical_foliage"),
                prepare(new BlockGrassPlant(),"horsetails"),
                prepare(new BlockGrassPlant(),"fanleaf"),
                prepare(new BlockGrassPlant(),"umbrella_leaf"),

                prepare(new BlockEntbarkSapling(),"jacksons_entbark_sapling"),

                prepare(new BlockOOTF(Material.WOOD).setSoundType(SoundType.WOOD),"fig_tree_planks"),
                prepare(new BlockFigLeaves(),"fig_tree_leaves"),
                prepare(new BlockOOTFLog(),"fig_tree_log"),
                prepare(new BlockBananaLeaves(),"banana_tree_leaves"),
                prepare(new BlockOOTFLog(),"banana_tree_log"),
                prepare(new BlockOOTF(Material.WOOD).setSoundType(SoundType.WOOD),"toona_ciliata_planks"),
                prepare(new BlockCiliataLeaves(),"toona_ciliata_leaves"),
                prepare(new BlockOOTFLog(),"toona_ciliata_log"),
                prepare(new BlockOOTF(Material.WOOD).setSoundType(SoundType.WOOD),"coconut_palm_planks"),
                prepare(new BlockCoconutLeaves(),"coconut_palm_leaves"),
                prepare(new BlockOOTFLog(),"coconut_palm_log"),
                prepare(new BlockOOTF(Material.WOOD).setSoundType(SoundType.WOOD),"snagglebranch_planks"),
                prepare(new BlockSnagglebranchLeaves(),"snagglebranch_leaves"),
                prepare(new BlockOOTFLog(),"snagglebranch_log"),
                prepare(new BlockOOTF(Material.WOOD).setSoundType(SoundType.WOOD),"swamproot_planks"),
                prepare(new BlockSwamprootLeaves(),"swamproot_leaves"),
                prepare(new BlockOOTFLog(),"swamproot_log"),
                prepare(new BlockOOTF(Material.WOOD).setSoundType(SoundType.WOOD),"umbrella_palm_planks"),
                prepare(new BlockUmbrellaLeaves(),"umbrella_palm_leaves"),
                prepare(new BlockOOTFLog(),"umbrella_palm_log"),
                prepare(new BlockOOTF(Material.WOOD).setSoundType(SoundType.WOOD),"jacksons_entbark_planks"),
                prepare(new BlockEntbarkLeaves(),"jacksons_entbark_leaves"),
                prepare(new BlockOOTFLog(),"jacksons_entbark_log")

        );
    }

    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                createItemBlock(THATCH_BLOCK),

                createItemBlock(RIBBON_FERN),
                createItemBlock(WETA_FERN),
                createItemBlock(INDIGOFERA),
                createItemBlock(LASIANDRA),
                createItemBlock(STOUT_DRAGON),
                createItemBlock(EPIPHYTE_FERN),
                createItemBlock(TROPICAL_FOLIAGE),
                createItemBlock(HORSETAILS),
                createItemBlock(FANLEAF),
                createItemBlock(UMBRELLA_LEAF),

                createItemBlock(JACKSONS_ENTBARK_SAPLING),

                createItemBlock(JACKSONS_ENTBARK_PLANKS),
                createItemBlock(JACKSONS_ENTBARK_LEAVES),
                createItemBlock(JACKSONS_ENTBARK_LOG),
                createItemBlock(FIG_TREE_PLANKS),
                createItemBlock(FIG_TREE_LEAVES),
                createItemBlock(FIG_TREE_LOG),
                createItemBlock(BANANA_TREE_LEAVES),
                createItemBlock(BANANA_TREE_LOG),
                createItemBlock(TOONA_CILIATA_PLANKS),
                createItemBlock(TOONA_CILIATA_LEAVES),
                createItemBlock(TOONA_CILIATA_LOG),
                createItemBlock(COCONUT_PALM_PLANKS),
                createItemBlock(COCONUT_PALM_LEAVES),
                createItemBlock(COCONUT_PALM_LOG),
                createItemBlock(SNAGGLEBRANCH_PLANKS),
                createItemBlock(SNAGGLEBRANCH_LEAVES),
                createItemBlock(SNAGGLEBRANCH_LOG),
                createItemBlock(SWAMPROOT_PLANKS),
                createItemBlock(SWAMPROOT_LEAVES),
                createItemBlock(SWAMPROOT_LOG),
                createItemBlock(UMBRELLA_PALM_PLANKS),
                createItemBlock(UMBRELLA_PALM_LEAVES),
                createItemBlock(UMBRELLA_PALM_LOG)
        );
    }

    private static Item createItemBlock(Block block)
    {
        ResourceLocation registryName = block.getRegistryName();
        if (registryName == null)
        {
            throw new IllegalArgumentException("cannot register ItemBlock for unregistered block!");
        }

        return new ItemBlock(block).setRegistryName(registryName);
    }

    private static <T extends Block> T prepare(T block, String name)
    {
        ResourceLocation identifier = GameData.checkPrefix(name);
        block.setRegistryName(identifier);
        block.setTranslationKey(identifier.getNamespace() + ":" + identifier.getPath());
        block.setCreativeTab(OutOfTheFog.TAB_OOTF);
        return block;
    }
}
