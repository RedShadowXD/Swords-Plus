
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
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@ElementsMbPlusMod.ModElement.Tag
public class ItemObsidianPickaxe extends ElementsMbPlusMod.ModElement {
	@GameRegistry.ObjectHolder("mb_plus:obsidian_pickaxe")
	public static final Item block = null;
	public ItemObsidianPickaxe(ElementsMbPlusMod instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("OBSIDIAN_PICKAXE", 4, 2400, 8f, 4f, 14)) {
			{
				this.attackSpeed = -2f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("obsidian_pickaxe").setRegistryName("obsidian_pickaxe").setCreativeTab(TabMoreOres.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("mb_plus:obsidian_pickaxe", "inventory"));
	}
}
