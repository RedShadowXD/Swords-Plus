
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
public class ItemHardened_ObsidianArmor extends ElementsMbPlusMod.ModElement {
	@GameRegistry.ObjectHolder("mb_plus:hardened_obsidian_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("mb_plus:hardened_obsidian_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("mb_plus:hardened_obsidian_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("mb_plus:hardened_obsidian_armorboots")
	public static final Item boots = null;
	public ItemHardened_ObsidianArmor(ElementsMbPlusMod instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("HARDENED_OBSIDIAN_ARMOR", "mb_plus:obsidian__", 35, new int[]{5, 7, 8, 5}, 10,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("mb_plus:armour2")), 3.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("hardened_obsidian_armorhelmet")
				.setRegistryName("hardened_obsidian_armorhelmet").setCreativeTab(TabMoreOres.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("hardened_obsidian_armorbody")
				.setRegistryName("hardened_obsidian_armorbody").setCreativeTab(TabMoreOres.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("hardened_obsidian_armorlegs")
				.setRegistryName("hardened_obsidian_armorlegs").setCreativeTab(TabMoreOres.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("hardened_obsidian_armorboots")
				.setRegistryName("hardened_obsidian_armorboots").setCreativeTab(TabMoreOres.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("mb_plus:hardened_obsidian_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("mb_plus:hardened_obsidian_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("mb_plus:hardened_obsidian_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("mb_plus:hardened_obsidian_armorboots", "inventory"));
	}
}
