package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeRoom {
    private int id;
    private String name;
    private int roomNumber;

    public static List<EmployeeRoom> list=List.of(
            new EmployeeRoom(1,"Vinayak",101),
            new EmployeeRoom(2,"Madhav",101),
            new EmployeeRoom(3,"Avinash",104),
            new EmployeeRoom(4,"Dhananjay",101),
            new EmployeeRoom(5,"Yuvraj",104),
            new EmployeeRoom(6,"Sharda",106)
    );

    public EmployeeRoom(int id,String name,int roomNumber){
        this.id=id;
        this.name=name;
        this.roomNumber=roomNumber;
    }

    @Override
    public boolean equals(Object o){
        if(o==null || getClass()!=o.getClass()) return false;
        EmployeeRoom that=(EmployeeRoom) o;
        return id==that.id && roomNumber==that.roomNumber && Objects.equals(name,that.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id,name,roomNumber);
    }

    @Override
    public String toString() {
        return "EmployeeRoom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }

    static void main() {
        getEmployeeByRoom();
    }


    public static void getEmployeeByRoom(){
         list.stream()
                .collect(
                        Collectors.groupingBy(
                                x -> x.roomNumber))
                 .forEach((x,y)->
                        System.out.println(x+" : "+y));
    }

}
