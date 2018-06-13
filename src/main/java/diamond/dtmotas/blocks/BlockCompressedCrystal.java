package diamond.dtmotas.blocks;

import diamond.dtmotas.ModDtmotas;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockCompressedCrystal extends Block {

    public BlockCompressedCrystal(){
        super(Material.ROCK);
        setUnlocalizedName(ModDtmotas.MODID + ".blockcompressedcrystal");
        setRegistryName("blockcompressedcrystal");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }


}
