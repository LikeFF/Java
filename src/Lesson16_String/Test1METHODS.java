package Lesson16_String;

public class Test1METHODS {
    public static void main(String[] args) {
        String s1 = new String("vprivet");
        int a = s1.length();
        System.out.println(a);

        // indexOf() Это перегруженный метод, смотри разные его вариации.

        int i1 = s1.indexOf('t');
        System.out.println(i1);

        int i2 = s1.indexOf("t");
        System.out.println(i2);

        int i4 = s1.indexOf('v', 1);
        System.out.println(i4);

        System.out.println(s1.startsWith("v"));
    }
}
