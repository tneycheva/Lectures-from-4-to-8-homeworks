package Lecture8.inheritance;

public class Vehicle {
    String brand;
    String model;
    double length;
    double width;
    double weight;
    int horsePower;
    int maxSpeed;

    Vehicle(String brand, String model, double length, double width, double weight, int horsePower, int maxSpeed){
        this.brand = brand;
        this.model = model;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }

    protected void honk() {
        System.out.println("beep beep");
    }
}

