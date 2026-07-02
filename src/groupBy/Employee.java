package groupBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    private String department;

    public static List<Employee> list=new ArrayList<>();

    public Employee(int id, String name, String department){
        this.id=id;
        this.name=name;
        this.department=department;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    static void main() {
        List<Employee> employees = addEmployee();
        findEmployeeByDepartment(list);
    }


    public static List<Employee> addEmployee(){
        list.add(new Employee(1,"Vinayak","IT"));
        list.add(new Employee(2,"Madhav","IT"));
        list.add(new Employee(3,"Sachin","IT"));
        list.add(new Employee(4,"Avinash","Automobile"));
        list.add(new Employee(5,"Dhananjay","Management"));
        return list;
    }

    public static void findEmployeeByDepartment(List<Employee> list){
        //list.stream().filter(x -> x.department.equals("IT")).toList().forEach(System.out::println);

        Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(x -> x.department));
        collect.forEach((k,v)-> System.out.println(k+": "+v.stream().map(x->x.name).toList()));

    }
}
