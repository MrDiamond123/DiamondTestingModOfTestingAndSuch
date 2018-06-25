package diamond.dtmotas;

import diamond.dtmotas.items.*;
import diamond.dtmotas.items.tools.ToolAxe;
import diamond.dtmotas.items.tools.ToolPickaxe;
import diamond.dtmotas.items.tools.ToolSpade;
import diamond.dtmotas.items.tools.ToolSword;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;


import java.util.ArrayList;
import java.util.List;


public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();


    // MATERIALS

    public static final Item.ToolMaterial MATERIAL_CRYSTAL = EnumHelper.addToolMaterial("material_crystal", 4, 2000, 10.0F, 4.5F, 22);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_CRYSTAL = EnumHelper.addArmorMaterial("armor_material_crystal",ModDtmotas.MODID + "crystal",15, new int[] {4, 9, 7, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 10F);
    // ITEMS



    public static final Item CRYSTAL = new ItemBase("itemcrystal");

    public static final ToolAxe CRYSTAL_AXE = new ToolAxe("axecrystal", MATERIAL_CRYSTAL);

    public static final ToolSword CRYSTAL_SWORD = new ToolSword("swordcrystal", MATERIAL_CRYSTAL);

    public static final ToolPickaxe CRYSTAL_PICKAXE = new ToolPickaxe("pickaxecrystal", MATERIAL_CRYSTAL);

    public static final ToolSpade CRYSTAL_SPADE = new ToolSpade("shovelcrystal", MATERIAL_CRYSTAL);



}
