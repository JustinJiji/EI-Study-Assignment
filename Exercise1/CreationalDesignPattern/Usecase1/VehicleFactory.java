package Exercise1.CreationalDesignPattern.Usecase1;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) throws IllegalArgumentException {
        switch (vehicleType.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
        }
    }
}

