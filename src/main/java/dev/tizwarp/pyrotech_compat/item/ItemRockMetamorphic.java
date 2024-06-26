package dev.tizwarp.pyrotech_compat.item;

import dev.tizwarp.pyrotech_compat.PyrotechCompat;
import dev.tizwarp.pyrotech_compat.block.rocks.BlockRockMetamorphic;
import dev.tizwarp.pyrotech_compat.entity.EntityRockMetamorphic;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class ItemRockMetamorphic extends ItemRockBase {
    public ItemRockMetamorphic(Block block) {
        super(block);
        this.setHasSubtypes(true);
    }

    @Override
    protected EntityThrowable createEntity(World world, EntityPlayer player, int meta){
        return new EntityRockMetamorphic(world, player, meta);
    }

    @Nonnull
    @Override
    public String getUnlocalizedName(ItemStack stack) {

        return "tile." + PyrotechCompat.MODID + "." + BlockRockMetamorphic.EnumType.fromMeta(stack.getMetadata()).getName();
    }
}
