package Lesson9;

public class Car {

    String colour;
    String engine;
    static int count;

    Car(String colour, String engine) {
        count++;
        this.colour = colour;
        this.engine = engine;
    }

    public void showColor() {
        System.out.println("color is " + colour);
        this.changeColor("green");
    }

    public void changeColor(String colour) {
        this.colour = colour;
        System.out.println("color was changed to: " + this.colour);
        int cost = 5000;
        cost += 1000;
    }

    

}
