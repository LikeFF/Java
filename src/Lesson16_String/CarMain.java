package Lesson16_String;

public class CarMain {

    public static void main(String[] args) {
        Car c = new Car("red", "v6");
        Car c2 = c.abc("black");
        System.out.println(c.color);
        System.out.println(c2.color);
    }
}
