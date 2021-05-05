package ConstructorHomework;

public class Constructor {
    Test test;


    void info() {
        System.out.println("Car is " + test.color + " engine is " + test.engine);
    }

}

class Test {
    Test(String c, String e){
        color = c;
        engine = e;
    }
    String color;
    String engine;

}

class ConstructorTest {
    public static void main(String[] args) {
        Constructor cc = new Constructor();
        cc.test = new Test("red", "V6");
        cc.info();


    }
}
