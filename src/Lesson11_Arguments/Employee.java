package Lesson11_Arguments;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public double addSalary(double a){
        salary = a * 2;
        return salary;
    }

    String addChartoName(String a){
        return a + "w";
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Yauheni", 3500.99);
        emp1.addChartoName(emp1.name);
        System.out.println(emp1.name);
        System.out.println(emp1.addChartoName(emp1.name));

    }
}
