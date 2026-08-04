package set;

import java.util.*;
import java.util.stream.Collectors;

public class SetOperations {

    public static void main(String[] args){

        needOfSet();
    }

    public static void needOfSet(){
        List<Integer> list = new ArrayList<>(List.of(1,2,3,1,4,2,5,3,6,7));
//       System.out.println(list);
//
//        Set<Integer> set=new HashSet<>(list);
//        System.out.println(set);

        Set<Integer> set = list.stream().distinct().collect(Collectors.toSet());
        System.out.println(set);


    }

    void uniqueElement(){
        List<String> list=new ArrayList<>(List.of("Aman","Vinayak","Aman"));

    }




}
