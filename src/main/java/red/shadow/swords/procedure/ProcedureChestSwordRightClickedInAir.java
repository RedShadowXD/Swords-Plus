package red.shadow.swords.procedure;

import red.shadow.swords.block.BlockChestblock;
import red.shadow.swords.ElementsSwordPlusMod;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

@ElementsSwordPlusMod.ModElement.Tag
public class ProcedureChestSwordRightClickedInAir extends ElementsSwordPlusMod.ModElement {
	public ProcedureChestSwordRightClickedInAir(ElementsSwordPlusMod instance) {
		super(instance, 64);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ChestSwordRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ChestSwordRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ChestSwordRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ChestSwordRightClickedInAir!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockChestblock.block.getDefaultState(), 3);
	}
}
