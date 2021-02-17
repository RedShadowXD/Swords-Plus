package red.moreblocks.plus.procedure;

import red.moreblocks.plus.item.ItemToad;
import red.moreblocks.plus.ElementsMbPlusMod;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

@ElementsMbPlusMod.ModElement.Tag
public class ProcedureBreadItemIsCraftedsmelted extends ElementsMbPlusMod.ModElement {
	public ProcedureBreadItemIsCraftedsmelted(ElementsMbPlusMod instance) {
		super(instance, 250);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BreadItemIsCraftedsmelted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayerMP) {
			Container _current = ((EntityPlayerMP) entity).openContainer;
			if (_current instanceof Supplier) {
				Object invobj = ((Supplier) _current).get();
				if (invobj instanceof Map) {
					ItemStack _setstack = new ItemStack(ItemToad.block, (int) (1));
					_setstack.setCount(1);
					((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
					_current.detectAndSendChanges();
				}
			}
		}
	}
}
