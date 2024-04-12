package dev.tizwarp.pyrotech_compat.block;

import com.codetaylor.mc.pyrotech.ModPyrotech;
import com.codetaylor.mc.pyrotech.modules.tech.basic.block.spi.BlockAnvilBase;
import dev.tizwarp.pyrotech_compat.PyrotechCompat;
import dev.tizwarp.pyrotech_compat.init.BlockInitializer;
import dev.tizwarp.pyrotech_compat.tile.TileAnvilBasalt;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import dev.tizwarp.pyrotech_compat.tile.TileAnvilAndesite;
import dev.tizwarp.pyrotech_compat.tile.TileAnvilDiorite;
import dev.tizwarp.pyrotech_compat.tile.TileAnvilScoria;

public class BlockAnvilStones extends BlockAnvilBase {

    public BlockAnvilStones(String name) {
        super(Material.ROCK);
        this.setRegistryName(name);
        this.setTranslationKey(PyrotechCompat.MODID + "." + name);
        this.setCreativeTab(ModPyrotech.CREATIVE_TAB);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 0);
    }
    //@Override
    protected Block getBlock() {
        return this;
    }


    @Override
    protected TileEntity createTileEntity() {
        if (this == BlockInitializer.blockAnvilAndesite){
            return new TileAnvilAndesite();
        }
        if (this == BlockInitializer.blockAnvilDiorite){
            return new TileAnvilDiorite();
        }
        if (this == BlockInitializer.blockAnvilBasalt){
            return new TileAnvilBasalt();
        }
        return new TileAnvilScoria();
    }
}
