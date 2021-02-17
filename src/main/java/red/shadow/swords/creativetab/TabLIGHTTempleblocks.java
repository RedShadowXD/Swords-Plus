
package red.shadow.swords.creativetab;

import red.shadow.swords.ElementsSwordPlusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

@ElementsSwordPlusMod.ModElement.Tag
public class TabLIGHTTempleblocks extends ElementsSwordPlusMod.ModElement {
	public TabLIGHTTempleblocks(ElementsSwordPlusMod instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tablight_templeblocks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.STONE, (int) (1), 0);
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
