package diamond.dtmotas.items.tools;


import diamond.dtmotas.ModDtmotas;
import diamond.dtmotas.ModItems;
import diamond.dtmotas.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;



public class ToolSword extends ItemSword implements IHasModel {

    public ToolSword(String name, ToolMaterial material) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.COMBAT);

        ModItems.ITEMS.add(this);

    }

    @Override
    public void registerModels() {
        ModDtmotas.proxy.registerItemRenderer(this, 0, "inventory");

    }
}
