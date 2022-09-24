package me.hasenzahn1.conduits;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Conduits implements ModInitializer {

    public static final String MOD_ID = "conduits";

    public static final Logger LOGGER = LoggerFactory.getLogger(Conduits.MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
    }

}
