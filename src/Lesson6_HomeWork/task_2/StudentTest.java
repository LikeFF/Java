package Lesson6_HomeWork.task_2;

public class StudentTest {
    public static void main(String[] args) {
        Student obj1 = new Student(1, "Verem", 3.9, 4.1, 5.1);
        Student obj2 = new Student(2, "Veremchuk", 9.9);
        obj2.economicGrade = 9;
        obj2.mathGrade = 9;
        System.out.println(obj2.economicGrade);
        System.out.println(obj2.mathGrade);
        System.out.println(obj2.id);
        System.out.println(obj2.name);

        Student obj3 = new Student();



    }
}
