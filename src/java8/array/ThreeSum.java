package java8.array;

import java.util.*;
import java.util.stream.IntStream;

public class ThreeSum {
    static void main(String args[]){
        int[] arr={-1,0,1,2,-1,-4};
        Set<List<Integer>> set = threeSum(arr);
        System.out.println(set);
        int number=15;
        boolean b = IntStream.range(2, (int) Math.sqrt(number) + 1).noneMatch(x->x%2!=0);
        System.out.println(b);
    }

    public static Set<List<Integer>> threeSum(int[] arr){
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> list = Arrays.asList(arr[i] + arr[j] + arr[k]);
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }
        return set;
    }
}
