package Exercise1.CreationalDesignPattern.Usecase2;

import java.util.Properties;
import java.util.logging.Logger;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Properties config = new Properties();
    private static final Logger logger = Logger.getLogger(ConfigurationManager.class.getName());

    // Private constructor to prevent instantiation
    private ConfigurationManager() {
        config.setProperty("maxUsers", "100");
        config.setProperty("appVersion", "1.0.0");
        logger.info("Configuration Manager initialized.");
    }

    // Global access point for the single instance
    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getProperty(String key) {
        return config.getProperty(key);
    }
}
