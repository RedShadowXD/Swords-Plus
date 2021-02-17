
package red.moreblocks.plus.item;

import red.moreblocks.plus.creativetab.TabMoreOres;
import red.moreblocks.plus.ElementsMbPlusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@ElementsMbPlusMod.ModElement.Tag
public class ItemDirtHoe extends ElementsMbPlusMod.ModElement {
	@GameRegistry.ObjectHolder("mb_plus:dirt_hoe")
	public static final Item block = null;
	public ItemDirtHoe(ElementsMbPlusMod instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("DIRT_HOE", 1, 122, 4f, 0f, 8)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 1);
				return ret.keySet();
			}
		}.setUnlocalizedName("dirt_hoe").setRegistryName("dirt_hoe").setCreativeTab(TabMoreOres.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("mb_plus:dirt_hoe", "inventory"));
	}
}
