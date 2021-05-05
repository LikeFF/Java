package Lesson9_HomeWork;

public class Class3 {
    int a=1;
    static int b = 2;
    void abc(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Class3.b);
    }

    public static void main(String[] args) {
        Class3 t = new Class3();
        t.abc(4);
    }
}
