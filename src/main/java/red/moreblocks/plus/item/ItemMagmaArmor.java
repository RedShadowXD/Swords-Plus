
package red.moreblocks.plus.item;

import red.moreblocks.plus.procedure.ProcedureMagmaArmorBodyTickEvent;
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
public class ItemMagmaArmor extends ElementsMbPlusMod.ModElement {
	@GameRegistry.ObjectHolder("mb_plus:magma_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("mb_plus:magma_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("mb_plus:magma_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("mb_plus:magma_armorboots")
	public static final Item boots = null;
	public ItemMagmaArmor(ElementsMbPlusMod instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("MAGMA_ARMOR", "mb_plus:magma__texture_", 25, new int[]{4, 6, 6, 5}, 10,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.metal.hit")), 2.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("magma_armorhelmet")
				.setRegistryName("magma_armorhelmet").setCreativeTab(TabMoreOres.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureMagmaArmorBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("magma_armorbody").setRegistryName("magma_armorbody").setCreativeTab(TabMoreOres.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("magma_armorlegs")
				.setRegistryName("magma_armorlegs").setCreativeTab(TabMoreOres.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("magma_armorboots")
				.setRegistryName("magma_armorboots").setCreativeTab(TabMoreOres.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("mb_plus:magma_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("mb_plus:magma_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("mb_plus:magma_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("mb_plus:magma_armorboots", "inventory"));
	}
}
