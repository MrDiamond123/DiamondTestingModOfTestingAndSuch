package diamond.dtmotas;

import diamond.dtmotas.items.*;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ModItems {
    @ObjectHolder("dtmotas:itemcrystal")
    public static ItemCrystal itemCrystal;

    @SideOnly(Side.CLIENT)
    public static void initModels() {

        itemCrystal.initModel();

    }


}
