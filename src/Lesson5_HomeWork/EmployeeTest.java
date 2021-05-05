package Lesson5_HomeWork;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee first = new Employee(1, "Ivanov", 24, 600, "QA");
        Employee second = new Employee(2, "Petrov", 25, 2400, "JAVA");


        System.out.println(first.salaryClass);
        System.out.println(second.salaryClass);

        first.multiplySalary();
        second.multiplySalary();

        System.out.println(first.salaryClass);
        System.out.println(second.salaryClass);

    }
}
