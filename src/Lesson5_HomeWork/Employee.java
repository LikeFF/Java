package Lesson5_HomeWork;

public class Employee {
    int idClass;
    String surnameClass;
    int ageClass;
    int salaryClass;
    String departmentClass;

    Employee(int id, String surname, int age, int salary, String department){

        idClass = id;
        surnameClass = surname;
        ageClass = age;
        salaryClass = salary;
        departmentClass = department;

    }


    int multiplySalary(){
        salaryClass = salaryClass * 2;
        return salaryClass;
    }
}
