package Lesson7_Packages;
import Lesson6.Test1;   //Можно не использовать Импорт, но тогда надо будет дополнительно указывать имя пакета при создании объекта

public class A {
    public static void main(String[] args) {
        B obj = new B();
        Test1 obj2 = new Test1();  // вот тут, если нет импорта, то надо бдует указать полное имя, т.е. добавить имя пакета. ВОт так: Lesson6.Test1 obj2 = new Lesson6.Test1();




    }
}
