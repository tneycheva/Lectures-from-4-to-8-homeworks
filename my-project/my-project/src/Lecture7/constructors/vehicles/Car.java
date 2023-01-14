package Lecture7.constructors.vehicles;

public class Car extends Vehicle {
    private String brand;

    public Car(String regNo, String brand) {
        super(regNo);
        this.brand = brand;
    }
}
