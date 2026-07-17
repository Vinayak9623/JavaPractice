package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperations {

    static void main() {
        //removeDuplicateElement();
        removeAllNullValues();

    }

    public static void removeDuplicateElement(){
        List<String> list=new ArrayList<>();
        List<String> uniqueList=new ArrayList<>();

        list.add("Java");
        list.add("python");
        list.add("C++");
        list.add("Java");


        for(String name:list){
            if(!uniqueList.contains(name)){
                uniqueList.add(name);
            }
        }

        System.out.println(uniqueList);
    }

    public static void removeAllNullValues(){
        List<String> list=new ArrayList<>();
        list.add("vinayak");
        list.add(null);
        list.add("java");
        list.add(null);
        list.add("c++");
        list.removeIf(x->x==null);
        System.out.println(list);
    }
}
