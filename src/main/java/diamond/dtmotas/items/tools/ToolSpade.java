package diamond.dtmotas.items.tools;

import diamond.dtmotas.ModDtmotas;
import diamond.dtmotas.ModItems;
import diamond.dtmotas.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel {
    public ToolSpade(String name, ToolMaterial material) {
        super(material);
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
