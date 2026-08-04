package map;

import java.util.Objects;

public class Employee {
    private Integer id;
    private String name;

    public Employee(Integer id,String name){
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(){
        this.id=id;
    }
    public void setName(){
        this.name=name;
    }

    @Override
    public String toString(){
        return "Employee [id=" + id + ", name=" + name + "]";
    }

    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Employee employee=(Employee)o;
        return Objects.equals(id,employee.id) && Objects.equals(name,employee.name);
    }

    public int hashCode(){
        return Objects.hash(id,name);
    }
}
