package Exercise1.CreationalDesignPattern.Usecase1;

public class Car implements Vehicle {
    @Override
    public void rent() {
        System.out.println("Car has been rented.");
    }
}
