package java8.practice;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Even {

    static void main() {

        int n=100;
        String s = String.valueOf(n);
        System.out.println(s);

        //understandGroupingByConcept();

       // firstNonRepeatingCharacter();
       // numberStartWithOne();
        //findDuplicateNumber();

        //List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //list.stream().filter(x->x%2==0).forEach(x->System.out.print(x+" "));
    }

    public static void numberStartWithOne(){

        List<Integer> list =Arrays.asList(10, 15, 8, 49, 25, 98, 32);

       // list.stream().filter(x->Integer.toString(x).startsWith("1")).forEach(x->System.out.println(x+" "));
    list.stream().filter(x->String.valueOf(x).startsWith("1")).forEach(System.out::println);

    }


    public static void findDuplicateNumber(){
        List<Integer> list=Arrays.asList(10, 15, 8, 49, 25, 98, 32, 15, 8);
        Set<Integer> set=new HashSet<>();

        list.stream().filter(x->!set.add(x)).forEach(System.out::println);
//        for(int n:list){
//            if(set.contains(n)){
//                System.out.println(n);
//            }
//            else {
//                set.add(n);
//            }

        //}
    }

    public static void firstNonRepeatingCharacter(){

        String s="JaJvaStream";

        s.chars().mapToObj(c->(char) c)
                .collect(Collectors
                                .groupingBy(x->x,LinkedHashMap::new,Collectors
                                        .counting()))
                .entrySet()
                .stream().filter(x->x.getValue()==1)
                .findFirst()
                .ifPresent(x->System.out.println(x.getKey()));





//        HashMap<Character,Integer> map  =new LinkedHashMap<>();

//        for(int i=0;i<s.length();i++){
//
//            int count=0;
//
//            for(int j=0;j<s.length();j++){
//
//                if(s.charAt(i)==s.charAt(j)){
//                    count++;
//                }
//            }
//            if(count==1){
//                System.out.println(s.charAt(i)+"");
//                break;
//            }
//
//        }

//        LinkedHashMap<Character, Long> collect = s.chars().mapToObj(c -> (char) c)
//                .collect(Collectors
//                        .groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()));
//        System.out.println(collect);
//
//        collect
//                .entrySet()
//                .stream()
//                .filter(x -> x.getValue() == 1).findFirst()
//                .ifPresent(x->System.out.println(x.getKey()));


    }


    public static void understandGroupingByConcept(){

        String s="Vinayak Deshmukh";

        s.chars().mapToObj(x->(char)x)
                .collect(Collectors
                        .groupingBy(x->x,LinkedHashMap::new,Collectors.counting()))
                .entrySet().forEach(System.out::println);


        List<Integer> list =Arrays.asList(1,2,3,2,1,4,1);
        list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet().forEach(System.out::println);


        List<Integer> list1=Arrays.asList(1,2,3,4,5,6);

        list1.stream().collect(Collectors.groupingBy(x->x%2==0))
                .entrySet().forEach(System.out::println);

        List<String> list2=Arrays.asList("java","is","fun","code");

        list2.stream().collect(Collectors.groupingBy(x->x.length()))
                .entrySet().forEach(System.out::println);

        List<Integer> list3 =Arrays.asList(10, 20, 10, 30, 20, 40);

        list3.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()>1)
                .map(x->x.getKey())
                .forEach(System.out::println);


        List<Integer> list4=Arrays.asList(10, 20, 30, 20, 10, 40);

        list4.stream().collect(Collectors
                .groupingBy(x->x,LinkedHashMap::new,Collectors
                        .counting())).entrySet().stream().filter(x->x.getValue()>1).findFirst()
                .ifPresent(x->System.out.println(x.getKey()));
    }
}
