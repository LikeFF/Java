package Lesson16_String;

public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
    final static int a = 5;

    public Car abc(String color){
        Car c10 = new Car(color, "v6");
        return c10;
        //delete it
    }
}

