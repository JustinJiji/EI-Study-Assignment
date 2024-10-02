# Use Case: Vehicle Rental Service
## Description
This project simulates a vehicle rental service where users can rent different types of vehicles (car, bike, etc.) based on their choice.

## Structure
- `Vehicle`: An interface for vehicles, with methods like `rent()`.
- `Car` and `Bike`: Concrete implementations of the `Vehicle` interface.
- `VehicleFactory`: A class that generates specific vehicle instances based on the user's input.