package map;

import java.util.*;

public class HashMapOperation {

    static void main() {
        Employee employee = problemWithoutHashMap();
        System.out.println(employee);

        codeWithHashMap();

        printValueusingMap();

        printMap();

        minAndMaxValueWithMap();

    }

    public static Employee  problemWithoutHashMap(){
        List<Employee> list=new ArrayList<>(List
                .of(new Employee(1,"Vinayak"),new Employee(2,"Madhav")));

        for(Employee e:list){
            if(e.getId()==2){
                return e;  //o(n);
            }
        }
        return null;

    }

    public static void codeWithHashMap(){
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Vinayak");
        map.put(2,"Madhav");
        map.put(3,"Ravi");
        map.put(3,"xyz");

        Set<Integer> set=map.keySet();
        for(Map.Entry<Integer,String> entry: map.entrySet() ){
            System.out.println(entry.getKey()+"=>"+entry.getValue());
        }

        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("Vinayak"));

        System.out.println(map);
        System.out.println(map.get(2));

        map.forEach((id,name)->System.out.println(id+"=>"+name));
    }

    public static void printValueusingMap(){
        Map<String,Integer> map=new HashMap<>();
        map.put("java",5);
        map.put("Spring",4);
        map.put(".net",3);
        map.put("mysql",6);

        map.entrySet().stream().filter(x->x.getValue()>5)
                .forEach(entry->System.out.println(entry.getKey()));
    }

    public static void printMap(){
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Vinayak");
        map.put(2,"Madhav");
        map.put(3,"Afrid");

        Set<Integer> set = map.keySet();
        for(Integer n:set){
            System.out.println(n+"=>"+map.get(n));
        }
        System.out.println(map.values());

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"=>"+entry.getValue());
        }

        map.entrySet().stream().filter(x->x.getValue().length()>5)
                .forEach(entry->System.out.println(entry.getKey()+"=>"+entry.getValue()));
    }

    public static void minAndMaxValueWithMap(){
        Map<String,Integer> map=new HashMap<>();
        map.put("java",5);
        map.put("Spring",1);
        map.put(".net",2);
        map.put("js",4);

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> maps:map.entrySet()){
            if(maps.getValue()<min){
                min=maps.getValue();
            }
            if(maps.getValue()>max){
                max=maps.getValue();
            }
        }
        System.out.println("Min value:"+min);
        System.out.println("Max value:"+max);


        //using java8

        Map.Entry<String, Integer> stringIntegerEntry = map.entrySet().stream().min(Map.Entry.comparingByValue()).get();
        System.out.println("using java8 min:"+ stringIntegerEntry);
        Map.Entry<String, Integer> stringIntegerEntry1 = map.entrySet().stream().max(Map.Entry.comparingByKey()).get();
        System.out.println("using java8 max:"+stringIntegerEntry1);
    }
}
