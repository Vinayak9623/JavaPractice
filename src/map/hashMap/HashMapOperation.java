package map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperation {

    static void main() {

        addElement();

    }

    public static void addElement(){
        Map<String,Integer> marks=new HashMap<>();
        marks.put("Math",90);
        marks.put("Science",80);
        marks.put("History",70);
        marks.put("English",60);
        marks.put("Computer",50);
        marks.entrySet().stream().filter(x->x.getValue()>70).forEach(System.out::println);
        marks.entrySet().stream().filter(x->x.getValue()>70).map(Map.Entry::getKey).forEach(System.out::println);
    }
}
