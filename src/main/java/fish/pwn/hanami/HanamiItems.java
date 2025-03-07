package fish.pwn.hanami;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class HanamiItems {
	public static void initialize() {
		Registry.register(
			Registries.ITEM_GROUP,
			ITEM_GROUP_KEY,
			ITEM_GROUP
		);
	}

	public static final RegistryKey<ItemGroup> ITEM_GROUP_KEY = RegistryKey.of(
		Registries.ITEM_GROUP.getKey(),
		Identifier.of(Hanami.MOD_ID, "item_group")
	);
	public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(Items.PINK_PETALS))
		.displayName(Text.translatable("itemGroup.hanami"))
		.build();
}
