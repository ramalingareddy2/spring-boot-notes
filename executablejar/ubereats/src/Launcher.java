package com.ubereats.application;
import org.apache.log4j.*;

class Launcher {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger logger = Logger.getLogger(Launcher.class);
        logger.info("hurray! running with log4j jar as a dependency");
    }
}
