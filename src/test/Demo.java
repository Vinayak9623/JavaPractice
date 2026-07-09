package test;

class Person{}
class Employee extends Person{}

public class Demo extends Employee {

    static void main() {
        Employee employee = new Employee();
        System.out.println(employee.toString());
        System.out.println(employee.hashCode());
        System.out.println(employee.equals(new Employee()));
        System.out.println(employee.getClass());
    }
}
