package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SummaryRanges {

    public static void main(String args[]){
        int[] arr={0,1,2,4,5,7};
        List<String> strings = showsummaryrangeThroughJava8(arr);
        System.out.println(strings);
        sumUsingJava8Reduce(arr);
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


    public static List<String> showSummaryRange(int[] arr){
        List<String> list=new ArrayList<>();
        if(arr.length==0){
            return list;
        }

        //arr= {1,2,3,5,6,9,10,13};
        int a=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]!=arr[i]+1){

                if(a==arr[i]){
                    list.add(String.valueOf(a));
                }
                else {
                    list.add(a+"->"+arr[i]);
                }
                a=arr[i+1];
            }

        }

        if(a==arr[arr.length-1]){
            list.add(String.valueOf(a));
        }
        else {
            list.add(a+"->"+arr[arr.length-1]);
        }

        return list;
    }

    public static List<String> showsummaryrangeThroughJava8(int[] arr){

        List<String> list=new ArrayList<>();

        if(arr.length==0){
            return list;
        }

        int[] a={arr[0]};

        IntStream.range(0,arr.length-1)
                .forEach(x->{

                    if(arr[x+1]!=arr[x]+1){

                        if(a[0]==arr[x]){
                            list.add(String.valueOf(a[0]));
                        }
                        else {
                            list.add(a[0]+"->"+arr[x]);
                        }

                        a[0]=arr[x+1];
                    }
                });

        if(a[0]==arr[arr.length-1]){
            list.add(String.valueOf(a[0]));
        }
        else {
            list.add(a[0]+"->"+arr[arr.length-1]);
        }

        return list;
    }

    public static int sumUsingJava8Reduce(int[] arr){

        int reduce = IntStream.rangeClosed(0, arr.length-1).map(x->arr[x]).reduce(0, Integer::sum);

        //int reduce = Arrays.stream(arr).reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
        return reduce;
    }
}
