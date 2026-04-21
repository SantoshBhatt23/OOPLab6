package ques4;
abstract class Car{
    String brand;
    String model;
    String color;
    int horsepower;

    abstract double  avg(double distance,double fuel);
    abstract void mode();
    void printInfo(){
        System.out.println("Car Brand: "+brand);
        System.out.println("Car Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("HorsePower: "+horsepower);
    }
}

class Maruti extends Car{
    Maruti(String brand, String model, String color, int horsepower){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }
    double avg(double distance, double fuel){
        return distance/fuel;
    }
    void mode(){
        System.out.println("Car is driving mode!");
    }
}

