package dev.tizwarp.pyrotech_compat.item;

import dev.tizwarp.pyrotech_compat.PyrotechCompat;
import dev.tizwarp.pyrotech_compat.block.rocks.BlockRockIgneous;
import dev.tizwarp.pyrotech_compat.entity.EntityRockIgneous;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class ItemRockIgneous extends ItemRockBase {

    public ItemRockIgneous(Block block) {
        super(block);
        this.setHasSubtypes(true);
    }

    @Override
    protected EntityThrowable createEntity(World world, EntityPlayer player, int meta){
        return new EntityRockIgneous(world, player, meta);
    }
    @Nonnull
    //@Override
    public String getUnlocalizedName(ItemStack stack) {

        return "tile." + PyrotechCompat.MODID + "." + BlockRockIgneous.EnumType.fromMeta(stack.getMetadata()).getName();
    }
}
