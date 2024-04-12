package dev.tizwarp.pyrotech_compat.item;

import dev.tizwarp.pyrotech_compat.PyrotechCompat;
import dev.tizwarp.pyrotech_compat.block.rocks.BlockRockMetamorphicSand;
import dev.tizwarp.pyrotech_compat.entity.EntityRockMetamorphicSand;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class ItemRockMetamorphicSand extends ItemRockBase {
    public ItemRockMetamorphicSand(Block block) {
        super(block);
        this.setHasSubtypes(true);
    }

    @Override
    protected EntityThrowable createEntity(World world, EntityPlayer player, int meta){
        return new EntityRockMetamorphicSand(world, player, meta);
    }
    @Nonnull
    @Override
    public String getUnlocalizedName(ItemStack stack) {

        return "tile." + PyrotechCompat.MODID + "." + BlockRockMetamorphicSand.EnumType.fromMeta(stack.getMetadata()).getName();
    }
}
