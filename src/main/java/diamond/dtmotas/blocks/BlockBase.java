package diamond.dtmotas.blocks;

import diamond.dtmotas.ModBlocks;
import diamond.dtmotas.ModDtmotas;
import diamond.dtmotas.ModItems;
import diamond.dtmotas.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material materialIn) {
        super(materialIn);
        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        ModDtmotas.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
