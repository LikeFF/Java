package Lesson8_NonAccessModifiers;

public class NonAccessModifiers {
    public final int a;

    NonAccessModifiers(){
        a = 22;
    }
    NonAccessModifiers(boolean www){
        a = 33;
    }

    public void abc(final short s){
        final byte b;
        b = 10;
        System.out.println(s + b);

    }

    public static void main(String[] args) {
        NonAccessModifiers t = new NonAccessModifiers();

        System.out.println(t.a);
    }
}
