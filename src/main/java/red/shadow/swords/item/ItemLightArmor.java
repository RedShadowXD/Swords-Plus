
package red.shadow.swords.item;

import red.shadow.swords.creativetab.TabArmour;
import red.shadow.swords.ElementsSwordPlusMod;

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

@ElementsSwordPlusMod.ModElement.Tag
public class ItemLightArmor extends ElementsSwordPlusMod.ModElement {
	@GameRegistry.ObjectHolder("sword_plus:light_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("sword_plus:light_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("sword_plus:light_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("sword_plus:light_armorboots")
	public static final Item boots = null;
	public ItemLightArmor(ElementsSwordPlusMod instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("LIGHT_ARMOR", "sword_plus:light_", 38, new int[]{5, 15, 13, 5}, 21,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("sword_plus:armor_light")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("light_armorhelmet")
				.setRegistryName("light_armorhelmet").setCreativeTab(TabArmour.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("light_armorbody")
				.setRegistryName("light_armorbody").setCreativeTab(TabArmour.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("light_armorlegs")
				.setRegistryName("light_armorlegs").setCreativeTab(TabArmour.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("light_armorboots")
				.setRegistryName("light_armorboots").setCreativeTab(TabArmour.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("sword_plus:light_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("sword_plus:light_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("sword_plus:light_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("sword_plus:light_armorboots", "inventory"));
	}
}
