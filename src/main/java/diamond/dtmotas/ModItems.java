package diamond.dtmotas;

import diamond.dtmotas.items.*;
import diamond.dtmotas.items.tools.AxeCrystal;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ModItems {

    // MATERIALS

    public static final Item.ToolMaterial MATERIAL_CRYSTAL = EnumHelper.addToolMaterial("material_crystal", 4, 2000, 10.0F, 8.0F, 22);

    // ITEMS

    @ObjectHolder("dtmotas:itemcrystal")
    public static ItemCrystal itemCrystal;

    @ObjectHolder("dtmotas:axecrystal")
    public static AxeCrystal axeCrystal;

    // MODELS

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemCrystal.initModel();
        axeCrystal.initModel();
    }


}
