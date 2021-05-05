package Lesson6_HomeWork;

public class OverloadMethods {
    int sum(){
        return 0;
    }
    int sum(int a){
        return a;
    }
    int sum(int a, int b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
    int sum(int a, int b, int c, int d){
        return sum(a, b, c) + d;   // just training
    }

}

class MainClass {
    public static void main(String[] args) {

        OverloadMethods obj = new OverloadMethods();


        System.out.println(obj.sum());
        System.out.println(obj.sum(3));
        System.out.println(obj.sum(3,2));
        System.out.println(obj.sum(3,2,5));
        System.out.println(obj.sum(3,2,5,10));

    }



}
