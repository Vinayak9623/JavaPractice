package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperationOnArrayAndArrayList {

    static void main() {
        int[] arr={10,20,30,40,50,60};
        removeElement(arr);
        removeElementUsingArrayList();
        printList();
    }

    public static void removeElement(int[] arr){
        int[] n=new int[arr.length-1];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=30){
                n[j]=arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(n));

    }

    public static void removeElementUsingArrayList(){
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.remove((Integer) 30);
        System.out.println(list);
        System.out.println(list.size());
       // System.out.println(list.length);
    }

    public static void printList(){
        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("Spring");
        list.add("Kafka");
        list.add("redish");
        list.add("docker");

        //print using for loop
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("----------------");
        //print using enhance for loop
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("----------------");
        //print using forEach()
        list.forEach(s-> System.out.println(s));
    }
}
