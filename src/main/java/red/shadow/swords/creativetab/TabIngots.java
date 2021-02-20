
package red.shadow.swords.creativetab;

import red.shadow.swords.item.ItemLightIngot;
import red.shadow.swords.ElementsSwordPlusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsSwordPlusMod.ModElement.Tag
public class TabIngots extends ElementsSwordPlusMod.ModElement {
	public TabIngots(ElementsSwordPlusMod instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabingots") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemLightIngot.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
