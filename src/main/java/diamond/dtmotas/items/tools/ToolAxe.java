package diamond.dtmotas.items.tools;

import diamond.dtmotas.ModDtmotas;

import diamond.dtmotas.ModItems;
import diamond.dtmotas.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;


public class ToolAxe extends ItemAxe implements IHasModel {
    public ToolAxe(String name, ToolMaterial material) {
        super(material,6.0F, -3.2F);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ModItems.ITEMS.add(this);

    }

    @Override
    public void registerModels() {
        ModDtmotas.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
