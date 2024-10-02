package Exercise1.CreationalDesignPattern.Usecase2;

public class Main {
    public static void main(String[] args) {
        // Access configuration manager and get properties
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("Max Users: " + configManager.getProperty("maxUsers"));
        System.out.println("App Version: " + configManager.getProperty("appVersion"));

        // Attempt to access ConfigurationManager again (will return the same instance)
        ConfigurationManager anotherConfigManager = ConfigurationManager.getInstance();
        System.out.println("Max Users: " + anotherConfigManager.getProperty("maxUsers"));
    }
}
