
package red.shadow.swords.creativetab;

import red.shadow.swords.item.ItemLightArmor;
import red.shadow.swords.ElementsSwordPlusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsSwordPlusMod.ModElement.Tag
public class TabArmour extends ElementsSwordPlusMod.ModElement {
	public TabArmour(ElementsSwordPlusMod instance) {
		super(instance, 75);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabarmour") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemLightArmor.helmet, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
