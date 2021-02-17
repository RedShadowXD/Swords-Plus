
package red.moreblocks.plus.item;

import red.moreblocks.plus.procedure.ProcedureBlindfoldon;
import red.moreblocks.plus.creativetab.TabMoreOres;
import red.moreblocks.plus.ElementsMbPlusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Map;
import java.util.HashMap;

@ElementsMbPlusMod.ModElement.Tag
public class ItemTeyArmor extends ElementsMbPlusMod.ModElement {
	@GameRegistry.ObjectHolder("mb_plus:tey_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("mb_plus:tey_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("mb_plus:tey_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("mb_plus:tey_armorboots")
	public static final Item boots = null;
	public ItemTeyArmor(ElementsMbPlusMod instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TEY_ARMOR", "mb_plus:tey", 4, new int[]{1, 1, 1, 1}, 0,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("mb_plus:armour2")), 0.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureBlindfoldon.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("tey_armorhelmet").setRegistryName("tey_armorhelmet").setCreativeTab(TabMoreOres.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("mb_plus:tey_armorhelmet", "inventory"));
	}
}
