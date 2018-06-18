package diamond.dtmotas;

import diamond.dtmotas.items.*;
import diamond.dtmotas.items.tools.AxeCrystal;
import diamond.dtmotas.items.tools.PickaxeCrystal;
import diamond.dtmotas.items.tools.ShovelCrystal;
import diamond.dtmotas.items.tools.SwordCrystal;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ModItems {

    // MATERIALS

    public static final Item.ToolMaterial MATERIAL_CRYSTAL = EnumHelper.addToolMaterial("material_crystal", 4, 2000, 10.0F, 4.5F, 22);

    // ITEMS

    @ObjectHolder("dtmotas:itemcrystal")
    public static ItemCrystal itemCrystal;

    @ObjectHolder("dtmotas:axecrystal")
    public static AxeCrystal axeCrystal;

    @ObjectHolder("dtmotas:pickaxecrystal")
    public static PickaxeCrystal pickaxeCrystal;

    @ObjectHolder("dtmotas:shovelcrystal")
    public static ShovelCrystal shovelCrystal;

    @ObjectHolder("dtmotas:swordcrystal")
    public static SwordCrystal swordCrystal;

    // MODELS

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        itemCrystal.initModel();
        axeCrystal.initModel();
        pickaxeCrystal.initModel();
        shovelCrystal.initModel();
        swordCrystal.initModel();
    }


}
