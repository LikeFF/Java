package Lesson8_HomeWork;

public class firstClass {

    static final double pi = 3.14;

    double circleArea(double radius){
        double circleArea = radius * radius * pi;
        System.out.println(circleArea);
        return circleArea;
    }


    static double circleLong(double r){
        double circleLong = 2 * r * pi;
        return circleLong;
    }



    void sout(double r){
        System.out.println("radius is: " + r);
        System.out.println("circleArea is " + circleArea(r));
        System.out.println("long is: " + circleLong(r));

    }






    static int multiply(int a, int b, int c){
        System.out.println(pi);
        return a * b * c;
    }

    static void division(float x, float z){
        float result = x/z;
        System.out.println(result);
    }
}
