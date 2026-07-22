package test;

import java.util.Objects;

public class Employees {
    private int id;
    private String name;

    public Employees(int id, String name){
        this.id=id;
        this.name=name;
    }

    public boolean equals(Object o){
        //referance equality
        if(this==o)return true;
        //null check and class check
        if(o==null || getClass()!=o.getClass()) return false;
        //caste object and compare individual fields
        Employees employee=(Employees) o;
        return id==employee.id && Objects.equals(name,employee.name);
    }

    public int hasCode(){
        return Objects.hash(id,name);
    }
}
