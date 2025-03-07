package fish.pwn.hanami;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hanami implements ModInitializer {
	public static final String MOD_ID = "hanami";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		HanamiItems.initialize();
		HanamiBlocks.initialize();
	}
}