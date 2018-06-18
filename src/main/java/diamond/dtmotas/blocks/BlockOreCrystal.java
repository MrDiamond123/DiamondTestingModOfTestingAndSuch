package diamond.dtmotas.blocks;

import diamond.dtmotas.ModDtmotas;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOreCrystal extends Block {

    public BlockOreCrystal() {
        super(Material.ROCK);
        setHardness(20);
        setResistance(30);
        setHarvestLevel("pickaxe", 3);
        setSoundType(SoundType.STONE);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setRegistryName("blockorecrystal");
        setUnlocalizedName(ModDtmotas.MODID + ".blockorecrystal");
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
