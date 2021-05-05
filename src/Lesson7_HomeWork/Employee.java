package Lesson7_HomeWork;

public class Employee {
    public Employee(int id1) {
        id = id1;
    }
    Employee(String surname1) {
        surname = surname1;
    }
    private Employee(double salary1) {
        salary = salary1;
    }



    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public void getSalary() {
        System.out.println(salary);
    }

    public void getSurname() {
        System.out.println(surname);
    }

    public void getId() {
        System.out.println(id);
    }
}
