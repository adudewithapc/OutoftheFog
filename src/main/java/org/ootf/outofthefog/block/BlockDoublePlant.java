package org.ootf.outofthefog.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockDoublePlant extends BlockOOTF
{
    public static final PropertyBool TOP = PropertyBool.create("top");

    public BlockDoublePlant()
    {
        super(Material.PLANTS);
        setDefaultState(blockState.getBaseState().withProperty(TOP, false));
        setSoundType(SoundType.PLANT);
        setHardness(0);
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        checkBlockAndDrop(worldIn, pos, state);
    }

    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
    {
        checkBlockAndDrop(worldIn, pos, state);
    }

    private void checkBlockAndDrop(World world, BlockPos pos, IBlockState state)
    {
        if(!canStay(world, pos, state))
        {
            boolean top = state.getValue(TOP);
            BlockPos topPos = top ? pos : pos.up();
            BlockPos bottomPos = top ? pos.down() : pos;
            Block topBlock = top ? this : world.getBlockState(topPos).getBlock();
            Block bottomBlock = top ? world.getBlockState(bottomPos).getBlock() : this;

            if(!top)
                this.dropBlockAsItem(world, pos, state, 0);

            if(topBlock == this)
                world.setBlockState(pos, Blocks.AIR.getDefaultState(), 2);
            if(bottomBlock == this)
                world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
        }
    }

    private boolean canStay(World world, BlockPos pos, IBlockState state)
    {
        if(state.getBlock() != this)
            return false;

        if(state.getValue(TOP))
            return world.getBlockState(pos.down()).getBlock() == this;
        else
            return world.getBlockState(pos.up()).getBlock() == this;
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, TOP);
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return state.getValue(TOP) ? 1 : 0;
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return getDefaultState().withProperty(TOP, meta == 0);
    }

    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        return super.canPlaceBlockAt(worldIn, pos) && worldIn.getBlockState(pos.up()).getBlock().isReplaceable(worldIn, pos.up());
    }

    @Override
    public EnumPushReaction getPushReaction(IBlockState state)
    {
        return EnumPushReaction.DESTROY;
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player)
    {
        if(state.getValue(TOP) && worldIn.getBlockState(pos.down()).getBlock() == this)
            worldIn.setBlockToAir(pos.down());
        else if(worldIn.getBlockState(pos.up()).getBlock() == this)
            worldIn.setBlockToAir(pos.up());
    }

    @Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

    @Nullable
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
    {
        return null;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isFullBlock(IBlockState state)
    {
        return false;
    }

    @Override
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
    {
        return BlockFaceShape.UNDEFINED;
    }
}
