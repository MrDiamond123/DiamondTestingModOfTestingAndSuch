package diamond.dtmotas.items.tools;

import diamond.dtmotas.ModDtmotas;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static diamond.dtmotas.ModItems.MATERIAL_CRYSTAL;

public class PickaxeCrystal extends ItemPickaxe {

    public PickaxeCrystal() {
        super(MATERIAL_CRYSTAL);
        setRegistryName("pickaxecrystal");
        setUnlocalizedName(ModDtmotas.MODID + ".pickaxecrystal");
        setCreativeTab(CreativeTabs.TOOLS);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
