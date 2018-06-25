package diamond.dtmotas.items;

import diamond.dtmotas.ModDtmotas;
import diamond.dtmotas.ModItems;
import diamond.dtmotas.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }


    @Override
    public void registerModels() {
        ModDtmotas.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
