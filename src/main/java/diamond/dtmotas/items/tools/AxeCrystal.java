package diamond.dtmotas.items.tools;

import diamond.dtmotas.ModDtmotas;


import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static diamond.dtmotas.ModItems.MATERIAL_CRYSTAL;

public class AxeCrystal extends ItemAxe {
    public AxeCrystal() {
        super(MATERIAL_CRYSTAL);
        setRegistryName("axecrystal");
        setUnlocalizedName(ModDtmotas.MODID + ".axecrystal");
        setCreativeTab(CreativeTabs.TOOLS);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
