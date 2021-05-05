package Lesson6;

public class MethodOverloading2 {
    public int sum(int i1, int i2){
        return i1 + i2;
    }


    protected String sum(String s1, String s2) {
        return s1 + s2;
    }
}

class MethodOverloadingTest2{
    public static void main(String[] args) {
        MethodOverloading2 obj = new MethodOverloading2();

        int a = obj.sum(5,7);
        System.out.println(a);
        String s = obj.sum("privet", "Medved");
        System.out.println(s);
    }
}
