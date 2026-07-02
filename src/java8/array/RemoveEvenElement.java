package java8.array;

import java.util.ArrayList;
import java.util.List;

public class RemoveEvenElement {

    static void main() {

        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        List<Integer> integers = notEvenNumber(arr);
        System.out.println(integers);

    }

    public static List<Integer> notEvenNumber(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int n:arr){
            if(n%2!=0){
                list.add(n);
            }
        }
        return list;
    }
}
