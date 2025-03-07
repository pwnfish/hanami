package fish.pwn.hanami;

import fish.pwn.hanami.datagen.HanamiBlockTagProvider;
import fish.pwn.hanami.datagen.HanamiLootTableProvider;
import fish.pwn.hanami.datagen.HanamiRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class HanamiDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(HanamiBlockTagProvider::new);
		pack.addProvider(HanamiLootTableProvider::new);
		pack.addProvider(HanamiRecipeProvider::new);
	}
}
