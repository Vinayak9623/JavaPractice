package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static void main(String args[]){
        int[] arr={0,1,2,4,5,7};
        List<String> strings = summaryRange(arr);
        System.out.println(strings);
    }

    public static List<String> summaryRange(int[] arr){
        List<String> list=new ArrayList<>();
        int a=arr[0];
        for(int i=0;i<arr.length-1;i++){

            if(arr[i+1]!=arr[i]+1){

                if(a==arr[i]){
                    list.add(String.valueOf(a));
                }

                else {
                    list.add(a+"=>"+arr[i]);
                }

                a=arr[i+1];
            }
        }
        if(a== arr[arr.length-1]){
            list.add(String.valueOf(a));
        }
        else {
            list.add(a+"=>"+(arr[arr.length-1]));
        }

        return list;
    }
}
