package Lesson8_NonAccessModifiers;

public class StudentStatic {
    String name;
    int course;
    static int studentCount = 0;
    int a;

    public StudentStatic(String name1, int course1) {
        studentCount++;
        name = name1;
        course = course1;
        System.out.println("Student id is: " + studentCount);

    }

     void showCount() {
        System.out.println(studentCount);
    }

    public void showInfo(){
        System.out.println("Welcome");
    }




    public static void main(String[] args) {

    }
}

