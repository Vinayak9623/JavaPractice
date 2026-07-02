package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeprateEvenOdd {
    static void main() {

        frequencyOfEachCharacter("Vinayak");
        secondLargestElement();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //list.add(0,2);
//      list.stream().filter(x->x%2==0).forEach(System.out::println);
//      list.stream().filter(x->x%2!=0).forEach(System.out::println);

        Map<Boolean,List<Integer>> map =list.stream().collect(Collectors.partitioningBy(n->n%2==0));

//        System.out.print("Even Digit:"+map.get(true));
//        System.out.print("Odd Digit:"+map.get(false));
    }


    public static void frequencyOfEachCharacter(String s){
        Map<Character, Long> collect = s.chars().mapToObj(c ->(char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);
    }

    public static void secondLargestElement(){
        List<Integer> list = Arrays.asList(1, 4, 6, 10, 89, 30, 78);
        list.stream().sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

    }
}
