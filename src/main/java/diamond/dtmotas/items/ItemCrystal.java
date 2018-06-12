package diamond.dtmotas.items;


import diamond.dtmotas.ModDtmotas;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCrystal extends Item {
    public ItemCrystal(){
        setRegistryName("itemcrystal");
        setUnlocalizedName(ModDtmotas.MODID + ".itemcrystal");

    }

    @SideOnly(Side.CLIENT)
    public void initModel() {

        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));

    }
}
