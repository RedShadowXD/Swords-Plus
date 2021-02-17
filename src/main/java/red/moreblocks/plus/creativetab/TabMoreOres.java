
package red.moreblocks.plus.creativetab;

import red.moreblocks.plus.item.ItemObsidianIngot;
import red.moreblocks.plus.ElementsMbPlusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsMbPlusMod.ModElement.Tag
public class TabMoreOres extends ElementsMbPlusMod.ModElement {
	public TabMoreOres(ElementsMbPlusMod instance) {
		super(instance, 110);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmore_ores") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemObsidianIngot.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
