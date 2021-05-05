package Lesson12_HomeWork;

import Lesson11_Arguments.Student;

public class StudentTest {

    void method1(Student st1, Student st2){
        if (st1.name.equals(st2.name)) {
            System.out.println("Objects are equal");
        }
        else {
            System.out.println("Objects are not equal");
        }
    }

    public static void main(String[] args) {
        StudentTest a = new StudentTest();
        Student first = new Student("kek", 3, 5.3);
        Student second = new Student("kek", 3, 5.3);

        a.method1(first, second);
    }
}
