package Lesson6_HomeWork.task_2;

public class Student {
     Student(int id1, String name1, double mathGrade1, double economicGrade1, double foreignLanguageGrade1){
        id = id1;
        name = name1;
        mathGrade = mathGrade1;
        economicGrade = economicGrade1;
        foreignLanguageGrade = foreignLanguageGrade1;
    }
     Student(int id2, String name2, double mathGrade2){
        this(id2, name2, mathGrade2, 0.0, 0.0 );
    }

    Student(){

    }


    int id;
    String name;
    double mathGrade;
    double economicGrade;
    double foreignLanguageGrade;
}
