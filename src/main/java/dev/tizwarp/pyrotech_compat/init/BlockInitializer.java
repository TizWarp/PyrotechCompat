package dev.tizwarp.pyrotech_compat.init;

import com.codetaylor.mc.athenaeum.util.ModelRegistrationHelper;
import com.codetaylor.mc.pyrotech.ModPyrotech;
import com.codetaylor.mc.pyrotech.modules.tech.basic.block.spi.BlockAnvilBase;
import dev.tizwarp.pyrotech_compat.block.rocks.*;
import dev.tizwarp.pyrotech_compat.tile.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import dev.tizwarp.pyrotech_compat.PyrotechCompat;
import dev.tizwarp.pyrotech_compat.block.BlockAnvilStones;
import dev.tizwarp.pyrotech_compat.item.ItemRockBase;
import dev.tizwarp.pyrotech_compat.item.ItemRockIgneous;
import dev.tizwarp.pyrotech_compat.item.ItemRockIgneousSand;
import dev.tizwarp.pyrotech_compat.item.ItemRockMetamorphic;
import dev.tizwarp.pyrotech_compat.item.ItemRockMetamorphicSand;
import dev.tizwarp.pyrotech_compat.item.ItemRockSedimentary;
import dev.tizwarp.pyrotech_compat.item.ItemRockSedimentarySand;

import java.util.LinkedHashMap;
import java.util.Map;

public class BlockInitializer {

    public static BlockInitializer instance = new BlockInitializer();
    static final Map<Item, Block> toRegister = new LinkedHashMap<>();
    public static final BlockAnvilStones blockAnvilScoria = new BlockAnvilStones("anvil_scoria");
    public static final BlockAnvilStones blockAnvilAndesite = new BlockAnvilStones("anvil_andesite");
    public static final BlockAnvilStones blockAnvilDiorite = new BlockAnvilStones("anvil_diorite");
    public static final BlockAnvilStones blockAnvilBasalt = new BlockAnvilStones("anvil_basalt");
    public static final BlockAnvilStones blockAnvilBlackGranite = new BlockAnvilStones("anvil_black_granite");
    public static final BlockAnvilStones blockAnvilBlueschist = new BlockAnvilStones("anvil_blue_schist");
    public static final BlockAnvilStones blockAnvilChalk = new BlockAnvilStones("anvil_chalk");
    public static final BlockAnvilStones blockAnvilChert = new BlockAnvilStones("anvil_chert");
    public static final BlockAnvilStones blockAnvilDacite = new BlockAnvilStones("anvil_dacite");
    public static final BlockAnvilStones blockAnvilDolomite = new BlockAnvilStones("anvil_dolomite");
    public static final BlockAnvilStones blockAnvilEclogite = new BlockAnvilStones("anvil_eclogite");
    public static final BlockAnvilStones blockAnvilGabbro = new BlockAnvilStones("anvil_gabbro");
    public static final BlockAnvilStones blockAnvilGneiss = new BlockAnvilStones("anvil_gneiss");
    public static final BlockAnvilStones blockAnvilGreenschist = new BlockAnvilStones("anvil_green_schist");
    public static final BlockAnvilStones blockAnvilGreyWacke = new BlockAnvilStones("anvil_greywacke");
    public static final BlockAnvilStones blockAnvilKomatite = new BlockAnvilStones("anvil_komatite");
    public static final BlockAnvilStones blockAnvilLignite = new BlockAnvilStones("anvil_lignite");
    public static final BlockAnvilStones blockAnvilLimestone = new BlockAnvilStones("anvil_limestone");
    public static final BlockAnvilStones blockAnvilMarble = new BlockAnvilStones("anvil_marble");
    public static final BlockAnvilStones blockAnvilMigmatite = new BlockAnvilStones("anvil_migmatite");
    public static final BlockAnvilStones blockAnvilQuartzite = new BlockAnvilStones("anvil_quartzite");
    public static final BlockAnvilStones blockAnvilRedGranite = new BlockAnvilStones("anvil_red_granite");
    public static final BlockAnvilStones blockAnvilRhyolite = new BlockAnvilStones("anvil_rhyolite");
    public static final BlockAnvilStones blockAnvilShale = new BlockAnvilStones("anvil_shale");
    public static final BlockAnvilStones blockAnvilSiltstone = new BlockAnvilStones("anvil_siltstone");
    public static final BlockAnvilStones blockAnvilSoapstone = new BlockAnvilStones("anvil_soapstone");
    public static final BlockRockIgneous blockRockIgneous = new BlockRockIgneous();
    public static final BlockRockIgneousSand blockRockIgneousSand = new BlockRockIgneousSand();
    public static final BlockRockMetamorphic blockRockMetamorphic = new BlockRockMetamorphic();
    public static final BlockRockMetamorphicSand blockRockMetamorphicSand = new BlockRockMetamorphicSand();
    public static final BlockRockSedimentary blockRockSedimentary = new BlockRockSedimentary();
    public static final BlockRockSedimentarySand blockRockSedimentarySand = new BlockRockSedimentarySand();
    public static final BlockRockBase blockRockNetherrack = new BlockRockBase("rock_netherrack", SoundType.STONE);
    public static final ItemRockIgneous itemRockIgneous = new ItemRockIgneous(blockRockIgneous);
    public static final ItemRockIgneousSand itemRockIgneousSand = new ItemRockIgneousSand(blockRockIgneousSand);
    public static final ItemRockMetamorphic itemRockMetamorphic = new ItemRockMetamorphic(blockRockMetamorphic);
    public static final ItemRockMetamorphicSand itemRockMetamorphicSand = new ItemRockMetamorphicSand(blockRockMetamorphicSand);
    public static final ItemRockSedimentary itemRockSedimentary = new ItemRockSedimentary(blockRockSedimentary);
    public static final ItemRockSedimentarySand itemRockSedimentarySand = new ItemRockSedimentarySand(blockRockSedimentarySand);
    public static final ItemRockBase itemRockNetherrack = new ItemRockBase(blockRockNetherrack);

    public static void onRegister() {

        if (Loader.isModLoaded("primal")){
            instance.registerBlock(blockAnvilScoria, new BlockAnvilBase.ItemAnvil(blockAnvilScoria));
        }
        if (Loader.isModLoaded("undergroundbiomes")){
            instance.registerBlock(blockRockIgneous, itemRockIgneous);
            instance.registerBlock(blockRockMetamorphic, itemRockMetamorphic);
            instance.registerBlock(blockRockSedimentary, itemRockSedimentary);
            instance.registerBlock(blockRockIgneousSand, itemRockIgneousSand);
            instance.registerBlock(blockRockMetamorphicSand, itemRockMetamorphicSand);
            instance.registerBlock(blockRockSedimentarySand, itemRockSedimentarySand);

            instance.registerBlock(blockAnvilBasalt, new BlockAnvilBase.ItemAnvil(blockAnvilBasalt));
            instance.registerBlock(blockAnvilBlackGranite, new BlockAnvilBase.ItemAnvil(blockAnvilBlackGranite));
            instance.registerBlock(blockAnvilBlueschist, new BlockAnvilBase.ItemAnvil(blockAnvilBlueschist));
            instance.registerBlock(blockAnvilChalk, new BlockAnvilBase.ItemAnvil(blockAnvilChalk));
            instance.registerBlock(blockAnvilChert, new BlockAnvilBase.ItemAnvil(blockAnvilChert));
            instance.registerBlock(blockAnvilDacite, new BlockAnvilBase.ItemAnvil(blockAnvilDacite));
            instance.registerBlock(blockAnvilDolomite, new BlockAnvilBase.ItemAnvil(blockAnvilDolomite));
            instance.registerBlock(blockAnvilEclogite, new BlockAnvilBase.ItemAnvil(blockAnvilEclogite));
            instance.registerBlock(blockAnvilGabbro, new BlockAnvilBase.ItemAnvil(blockAnvilGabbro));
            instance.registerBlock(blockAnvilGneiss, new BlockAnvilBase.ItemAnvil(blockAnvilGneiss));
            instance.registerBlock(blockAnvilGreenschist, new BlockAnvilBase.ItemAnvil(blockAnvilGreenschist));
            instance.registerBlock(blockAnvilGreyWacke, new BlockAnvilBase.ItemAnvil(blockAnvilGreyWacke));
            instance.registerBlock(blockAnvilKomatite, new BlockAnvilBase.ItemAnvil(blockAnvilKomatite));
            instance.registerBlock(blockAnvilLignite, new BlockAnvilBase.ItemAnvil(blockAnvilLignite));
            instance.registerBlock(blockAnvilLimestone, new BlockAnvilBase.ItemAnvil(blockAnvilLimestone));
            instance.registerBlock(blockAnvilMarble, new BlockAnvilBase.ItemAnvil(blockAnvilMarble));
            instance.registerBlock(blockAnvilMigmatite, new BlockAnvilBase.ItemAnvil(blockAnvilMigmatite));
            instance.registerBlock(blockAnvilQuartzite, new BlockAnvilBase.ItemAnvil(blockAnvilQuartzite));
            instance.registerBlock(blockAnvilRedGranite, new BlockAnvilBase.ItemAnvil(blockAnvilRedGranite));
            instance.registerBlock(blockAnvilRhyolite, new BlockAnvilBase.ItemAnvil(blockAnvilRhyolite));
            instance.registerBlock(blockAnvilShale, new BlockAnvilBase.ItemAnvil(blockAnvilShale));
            instance.registerBlock(blockAnvilSiltstone, new BlockAnvilBase.ItemAnvil(blockAnvilSiltstone));
            instance.registerBlock(blockAnvilSoapstone, new BlockAnvilBase.ItemAnvil(blockAnvilSoapstone));

            GameRegistry.registerTileEntity(TileAnvilBasalt.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilBasalt.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilBlackGranite.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilBlackGranite.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilBlueschist.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilBlueschist.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilChalk.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilChalk.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilChert.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilChert.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilDacite.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilDacite.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilDolomite.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilDolomite.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilEclogite.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilEclogite.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilGabbro.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilGabbro.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilGneiss.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilGneiss.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilGreenschist.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilGreenschist.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilGreywacke.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilGreywacke.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilKomatiite.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilKomatiite.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilLignite.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilLignite.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilLimestone.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilLimestone.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilMarble.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilMarble.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilMigmatite.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilMigmatite.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilQuartzite.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilQuartzite.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilRedGranite.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilRedGranite.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilRhyolite.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilRhyolite.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilShale.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilShale.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilSiltstone.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilSiltstone.class.getSimpleName()));
            GameRegistry.registerTileEntity(TileAnvilSoapstone.class, new ResourceLocation(PyrotechCompat.MODID, "tile" + TileAnvilSoapstone.class.getSimpleName()));



        }

        instance.registerBlock(blockAnvilAndesite, new BlockAnvilBase.ItemAnvil(blockAnvilAndesite));
        instance.registerBlock(blockAnvilDiorite, new BlockAnvilBase.ItemAnvil(blockAnvilDiorite));
        instance.registerBlock(blockRockNetherrack, itemRockNetherrack);
        GameRegistry.registerTileEntity(TileAnvilAndesite.class, new ResourceLocation(PyrotechCompat.MODID, "tile." + TileAnvilAndesite.class.getSimpleName()));
        GameRegistry.registerTileEntity(TileAnvilDiorite.class, new ResourceLocation(PyrotechCompat.MODID, "tile." + TileAnvilDiorite.class.getSimpleName()));
        GameRegistry.registerTileEntity(TileAnvilScoria.class, new ResourceLocation(PyrotechCompat.MODID, "tile." + TileAnvilScoria.class.getSimpleName()));


    }

    static <T extends Block, I extends Item> T registerBlock(T block, I item) {
        toRegister.put(item, block);
        return block;
    }

    public <B extends Block> B registerBlock(B block) {
        ForgeRegistries.BLOCKS.register(block);
        return block;
    }

    public <B extends Block, I extends ItemBlock> B registerBlock(B block, I itemBlock) {
        this.registerBlock(block);
        this.registerItemBlock(itemBlock, block);
        return block;
    }

    public Item registerItemBlock(Item item, Block block) {
        item.setRegistryName(block.getRegistryName());
        item.setCreativeTab(ModPyrotech.CREATIVE_TAB);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }

    @SideOnly(Side.CLIENT)
    public static void onClientRegister() {

        if (Loader.isModLoaded("primal")){
            ModelRegistrationHelper.registerVariantBlockItemModels(
                    blockAnvilScoria.getDefaultState(),
                    BlockAnvilBase.DAMAGE,
                    value -> value
            );
        }
        if (Loader.isModLoaded("undergroundbiomes")){
            ModelLoader.setCustomStateMapper(
                    blockRockIgneous,
                    (new StateMap.Builder()).withName(BlockRockIgneous.VARIANT).build()
            );

            ModelLoader.setCustomStateMapper(
                    blockRockIgneousSand,
                    (new StateMap.Builder()).withName(BlockRockIgneousSand.VARIANT).build()
            );

            ModelLoader.setCustomStateMapper(
                    blockRockMetamorphic,
                    (new StateMap.Builder()).withName(BlockRockMetamorphic.VARIANT).build()
            );

            ModelLoader.setCustomStateMapper(
                    blockRockMetamorphicSand,
                    (new StateMap.Builder()).withName(BlockRockMetamorphicSand.VARIANT).build()
            );

            ModelLoader.setCustomStateMapper(
                    blockRockSedimentary,
                    (new StateMap.Builder()).withName(BlockRockSedimentary.VARIANT).build()
            );

            ModelLoader.setCustomStateMapper(
                    blockRockSedimentarySand,
                    (new StateMap.Builder()).withName(BlockRockSedimentarySand.VARIANT).build()
            );

            ModelRegistrationHelper.registerVariantBlockItemModelsSeparately(
                    PyrotechCompat.MODID,
                    blockRockIgneous,
                    BlockRockIgneous.VARIANT
            );

            ModelRegistrationHelper.registerVariantBlockItemModelsSeparately(
                    PyrotechCompat.MODID,
                    blockRockIgneousSand,
                    BlockRockIgneousSand.VARIANT
            );

            ModelRegistrationHelper.registerVariantBlockItemModelsSeparately(
                    PyrotechCompat.MODID,
                    blockRockMetamorphic,
                    BlockRockMetamorphic.VARIANT
            );

            ModelRegistrationHelper.registerVariantBlockItemModelsSeparately(
                    PyrotechCompat.MODID,
                    blockRockMetamorphicSand,
                    BlockRockMetamorphicSand.VARIANT
            );

            ModelRegistrationHelper.registerVariantBlockItemModelsSeparately(
                    PyrotechCompat.MODID,
                    blockRockSedimentary,
                    BlockRockSedimentary.VARIANT
            );

            ModelRegistrationHelper.registerVariantBlockItemModelsSeparately(
                    PyrotechCompat.MODID,
                    blockRockSedimentarySand,
                    BlockRockSedimentarySand.VARIANT
            );
        }
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilAndesite.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilDiorite.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );

        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilBasalt.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilBlackGranite.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilBlueschist.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilChalk.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilChert.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilDacite.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilDolomite.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilEclogite.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilGabbro.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilGneiss.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilGreenschist.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilGreyWacke.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilKomatite.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilLignite.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilLimestone.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilMarble.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilMigmatite.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilQuartzite.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilRedGranite.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilRhyolite.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilShale.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilSiltstone.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );
        ModelRegistrationHelper.registerVariantBlockItemModels(
                blockAnvilSoapstone.getDefaultState(),
                BlockAnvilBase.DAMAGE,
                value -> value
        );






        ModelRegistrationHelper.registerItemModels(itemRockNetherrack);
    }
}
