package java8.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintDup {

    static void main() {
        int[] arr={1,5,2,1,4,5,3,5};
        printdupWithJava8(arr);
    }

    public static void printdupWithJava8(int[] arr){
        Set<Integer> set=new HashSet<>();
        Arrays.stream(arr).filter(x->!set.add(x)).distinct().forEach(System.out::println);

    }

    public static void printduplicate(int[] arr){

        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(!set.add(arr[i])){
                set1.add(arr[i]);
            }
        }
        System.out.println(set1);

    }
}
