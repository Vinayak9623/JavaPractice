package groupBy;

import java.util.HashSet;
import java.util.Objects;

public class Students {

    private int id;
    private String name;
    private String department;

    public Students(int id, String name,String department){
        this.id=id;
        this.name=name;
        this.department=department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return id == students.id && Objects.equals(name, students.name) && Objects.equals(department, students.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department);
    }

    static void main() {

        HashSet<Students> set = new HashSet<>();

        set.add(new Students(1,"vinayak","IT"));
         set.add(new Students(1,"vinayak","IT"));

        System.out.println(set.size());

//        boolean equals = s1.equals(s2);  //true ? false ?
//        System.out.println(equals);
//
//        int i = s1.hashCode();
//        int i1=s2.hashCode();
//
//        System.out.println(i);
//        System.out.println(i1);


    }


}
