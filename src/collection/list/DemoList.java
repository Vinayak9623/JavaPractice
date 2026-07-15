package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {

    private static List<String> list=new ArrayList<>();
    static {
        list.add("java");
        list.add("spring");
        list.add("kafka");
        list.add("redis");
        list.add("docker");
    }
    static void main() {
        printListUsingIterator();
        removeElementFromList();
        printNumberUsingIterator();
    }

    public static void printListUsingIterator(){
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void removeElementFromList(){
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            String value = iterator.next();
            if(value.equals("spring"))iterator.remove();
        }
        System.out.println(list);

    }

    public static void printNumberUsingIterator(){
        ArrayList<Integer> x = new ArrayList<>();
        x.add(10);
        x.add(20);
        x.add(30);
        x.add(40);
        x.add(50);

        Iterator<Integer> iterator=x.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
