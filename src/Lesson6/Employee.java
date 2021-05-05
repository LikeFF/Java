package Lesson6;

public class Employee {
    Employee(int id1, String surname1, int age1){
        this(id1, surname1, age1, 0.0,null);
    }

    Employee(String surname2, int age2){
        this(0, surname2, age2, 0.0, null);

    }

    Employee(int id3, String surname3, int age3, double salary3, String department3){
        id = id3;
        surname = surname3;
        age = age3;
        salary = salary3;
        department = department3;

    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "name1", 33);
        System.out.println(emp1.id + "  " + emp1.surname + emp1.age);

        Employee emp2 = new Employee("Ivanov", 33);
        System.out.println(emp2.surname + emp2.age);

        Employee emp3 = new Employee(11, "Verem", 27, 3500.54, "IT");

        System.out.println(emp3.id);
        System.out.println(emp3.surname);
        System.out.println(emp3.age);
        System.out.println(emp3.salary);




    }
}
