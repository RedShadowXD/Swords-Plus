
package red.shadow.swords.creativetab;

import red.shadow.swords.block.BlockLightOre;
import red.shadow.swords.ElementsSwordPlusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsSwordPlusMod.ModElement.Tag
public class TabBlocks extends ElementsSwordPlusMod.ModElement {
	public TabBlocks(ElementsSwordPlusMod instance) {
		super(instance, 74);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabblocks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockLightOre.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
