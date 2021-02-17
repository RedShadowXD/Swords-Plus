package red.moreblocks.plus.procedure;

import red.moreblocks.plus.ElementsMbPlusMod;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;

import java.util.Map;

@ElementsMbPlusMod.ModElement.Tag
public class ProcedureFireSwordSwings extends ElementsMbPlusMod.ModElement {
	public ProcedureFireSwordSwings(ElementsMbPlusMod instance) {
		super(instance, 179);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure FireSwordSwings!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure FireSwordSwings!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure FireSwordSwings!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure FireSwordSwings!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.FIRE.getDefaultState(), 3);
	}
}
