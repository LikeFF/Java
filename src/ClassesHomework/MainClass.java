package ClassesHomework;

public class MainClass {
    public static void main(String[] args) {
        Student first = new Student();
        Student second = new Student();
        Student third = new Student();

        first.id = 1;
        first.name = "Alex";
        first.economicGrade = 4;
        first.mathGrade = 3;
        first.foreignLanguageGrade = 7;

        second.id = 2;
        second.name = "Andrey";
        second.economicGrade = 7;
        second.mathGrade = 10;
        second.foreignLanguageGrade = 5;

        third.id = 3;
        third.name = "Nisha";
        third.economicGrade = 10;
        third.mathGrade = 8;
        third.foreignLanguageGrade = 9;


        StudentMethod justname = new StudentMethod();
        justname.averageMark(first);
        justname.averageMark(second);
        justname.averageMark(third);
    }
}
