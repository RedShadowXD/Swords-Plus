
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
public class ItemBlindFoldArmor extends ElementsMbPlusMod.ModElement {
	@GameRegistry.ObjectHolder("mb_plus:blind_fold_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("mb_plus:blind_fold_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("mb_plus:blind_fold_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("mb_plus:blind_fold_armorboots")
	public static final Item boots = null;
	public ItemBlindFoldArmor(ElementsMbPlusMod instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("BLIND_FOLD_ARMOR", "mb_plus:tey", 10, new int[]{0, 0, 0, 4}, 5,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 1f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("blind_fold_armorhelmet")
				.setRegistryName("blind_fold_armorhelmet").setCreativeTab(TabMoreOres.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("mb_plus:blind_fold_armorhelmet", "inventory"));
	}
}
