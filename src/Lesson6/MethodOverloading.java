package Lesson6;

public class MethodOverloading {
    void show(int i1) {
        System.out.println(i1);
    }

    void show(String s1){
        System.out.println(s1);
    }

    void show(boolean b1) {
        System.out.println(b1);
    }

    void show(String s, int a) {
        System.out.println(s + a);
    }
    void show(int a, String s) {
        System.out.println(a + s);
    }
}




