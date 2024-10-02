package Exercise1.CreationalDesignPattern.Usecase1;

public class Bike implements Vehicle {
    @Override
    public void rent() {
        System.out.println("Bike has been rented.");
    }
}
