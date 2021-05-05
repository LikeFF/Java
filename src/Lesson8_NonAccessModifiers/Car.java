package Lesson8_NonAccessModifiers;

public class Car {
    String color = "blue";
    String engine = "V6";

}

class Human{
    String name = "Verem";
    final Car c = new Car();


    public static void main(String[] args) {
        Human h1 = new Human();



//        h1.c = new Car();

    }
}
