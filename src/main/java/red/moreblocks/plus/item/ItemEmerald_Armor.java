
package red.moreblocks.plus.item;

import red.moreblocks.plus.creativetab.TabMoreOres;
import red.moreblocks.plus.ElementsMbPlusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsMbPlusMod.ModElement.Tag
public class ItemEmerald_Armor extends ElementsMbPlusMod.ModElement {
	@GameRegistry.ObjectHolder("mb_plus:emerald_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("mb_plus:emerald_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("mb_plus:emerald_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("mb_plus:emerald_armorboots")
	public static final Item boots = null;
	public ItemEmerald_Armor(ElementsMbPlusMod instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("EMERALD_ARMOR", "mb_plus:emerald__", 45, new int[]{6, 7, 8, 6}, 27,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 1.4000000000000001f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("emerald_armorhelmet")
				.setRegistryName("emerald_armorhelmet").setCreativeTab(TabMoreOres.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("emerald_armorbody")
				.setRegistryName("emerald_armorbody").setCreativeTab(TabMoreOres.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("emerald_armorlegs")
				.setRegistryName("emerald_armorlegs").setCreativeTab(TabMoreOres.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("emerald_armorboots")
				.setRegistryName("emerald_armorboots").setCreativeTab(TabMoreOres.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("mb_plus:emerald_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("mb_plus:emerald_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("mb_plus:emerald_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("mb_plus:emerald_armorboots", "inventory"));
	}
}
