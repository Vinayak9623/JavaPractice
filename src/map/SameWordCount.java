package map;

import java.util.*;
import java.util.stream.Collectors;

public class SameWordCount {

    static void main() {
        String s="My name My Is Vinayak Is Vinayak my";
        sameWordCount(s);
        wordCountSame(s);
        countsameWord(s);
        countWordWithJava8(s);
        countWordWithCompute(s);
        countWordWithTreeMap(s);
        countWordWithLinkedHashMap(s);
    }

    public static void sameWordCount(String s){
        String[] split = s.toLowerCase().split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(String x:split){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else {
                map.put(x,1);
            }
        }

        System.out.println(map);

    }

    public static void wordCountSame(String s){
        Map<String, Integer> map=new HashMap<>();
        String[] split=s.toLowerCase().split(" ");//{My,name,My,Is Vinayak Is Vinayak my}
        for(String x:split){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
    }

    public static void countWordWithJava8(String s){
        String[] split=s.toLowerCase().split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(String x:split){
            map.merge(x,1,Integer::sum);
        }
        System.out.println(map);

    }

    public static void countsameWord(String s){
        Map<String, Long> collect = Arrays.stream(s.toLowerCase()
                .split(" "))
                .collect(Collectors.groupingBy(word -> word,
                        Collectors.counting()));
        System.out.println(collect);
    }

    public static void countWordWithCompute(String s){
        Map<String,Integer> map=new HashMap<>();
        for(String x:s.toLowerCase().split(" ")){
            map.compute(x,(a,b)->b==null?1:b+1);
        }
        System.out.println(map);
    }

    public static void countWordWithTreeMap(String s){
        TreeMap<String, Integer> map = new TreeMap<>();
        for(String x:s.toLowerCase().split(" ")){
            map.merge(x,1,Integer::sum);
        }
        System.out.println(map);
    }

    public static void countWordWithLinkedHashMap(String s){
        LinkedHashMap<String, Integer> map = Arrays.stream(s.toLowerCase().split(" ")).collect(Collectors.toMap(
                x -> x,
                x -> 1,
                Integer::sum,
                LinkedHashMap::new
        ));

        System.out.println(map);
    }
}
