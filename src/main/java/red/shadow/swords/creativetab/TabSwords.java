
package red.shadow.swords.creativetab;

import red.shadow.swords.item.ItemIntersword;
import red.shadow.swords.ElementsSwordPlusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsSwordPlusMod.ModElement.Tag
public class TabSwords extends ElementsSwordPlusMod.ModElement {
	public TabSwords(ElementsSwordPlusMod instance) {
		super(instance, 56);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabswords") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemIntersword.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
