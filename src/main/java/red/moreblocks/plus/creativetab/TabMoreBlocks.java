
package red.moreblocks.plus.creativetab;

import red.moreblocks.plus.block.BlockEyespy;
import red.moreblocks.plus.ElementsMbPlusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsMbPlusMod.ModElement.Tag
public class TabMoreBlocks extends ElementsMbPlusMod.ModElement {
	public TabMoreBlocks(ElementsMbPlusMod instance) {
		super(instance, 109);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmore_blocks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockEyespy.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
