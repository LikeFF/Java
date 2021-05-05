package Lesson11_HomeWork;

public class Car {
    String color;
    String engine;
    int doors;

    Car(String color, String engine, int doors){
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}

class CarTest {

    void changeDoors(Car c, int doors) {
        c.doors = doors;
    }

    void changeColors(Car first, Car second) {
        String color1 = first.color;
        first.color = second.color;
        second.color = color1;

    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car bmw = new Car("white", "v8", 4);
        Car merc = new Car("black", "v8", 5);
        ct.changeDoors(bmw, 2);
        System.out.println(bmw.doors);
        System.out.println();

        ct.changeColors(bmw, merc);
        System.out.println(bmw.color);
        System.out.println(merc.color);


    }
}