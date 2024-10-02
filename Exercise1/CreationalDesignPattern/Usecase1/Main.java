package Exercise1.CreationalDesignPattern.Usecase1;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            Vehicle vehicle = VehicleFactory.getVehicle("car");
            vehicle.rent();
            
            vehicle = VehicleFactory.getVehicle("bike");
            vehicle.rent();
            
            // Trying an invalid vehicle type
            vehicle = VehicleFactory.getVehicle("truck");
        } catch (IllegalArgumentException e) {
            logger.severe("Exception occurred: " + e.getMessage());
        }
    }
}

