package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoHashMap {

    static void main() {
//        Map<Character,Integer> map=new HashMap<>(16,7);

//        map.put(1,'A');
//        map.put(1,'B'); //16

        //key
        //value
        //bucket
        //hashFunction   100/16= index= 1

        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        countCharacter("vinayak");
        findFirstUniqueCharacterInString("success");

        int[] n={101,202,101,202,304};
        findDuplicateId(n);
    }

    public static void countCharacter(String s){

        HashMap<Character,Integer> map =new HashMap<>();

        char[] ch=s.toCharArray();

        for(char c:ch){

           map.put(c,map.getOrDefault(c,0)+1);
//            if(map.containsKey(c)){
//                map.put(c,map.get(c)+1);
//            }
//            else {
//                map.put(c,1);
//            }
        }
    for(Map.Entry<Character,Integer> x:map.entrySet()){
        System.out.println(x.getKey()+":"+x.getValue());
    }
        //System.out.println(map);
    }

    public static void findFirstUniqueCharacterInString(String s){
        Map<Character,Integer> map=new HashMap<>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c:s.toCharArray()){
            if(map.get(c)==1){
                System.out.println(c);
                break;

            }
        }

    }

    public static void findDuplicateId(int[] employeeId){

        Map<Integer,Integer> map=new HashMap<>();

        for(int n:employeeId){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> x:map.entrySet()){
            if(x.getValue()>1){
                System.out.println("Duplicate id are: "+x.getKey()+",");
            }
        }
    }
}
