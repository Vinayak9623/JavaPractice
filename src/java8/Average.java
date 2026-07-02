package java8;

import java.util.Arrays;

public class Average {

    public static void main(String args[]) {
        int k=20;
        int[] arr={1,3,5,10,5,7,8};
//        sumWithForLoop(arr);
//        sumWithForeachLoop(arr);
//        sumWithJava8(arr);
        substraction(arr);
    }

//    public static int average(int[] arr,int k){
//
//        int result=0;
//        int count=0;
//        for(int i=0;i<arr.length-1;i++){
//            result=arr[i]+arr[i+1];
//            if(k==result) count++;
//        }
//        System.out.println(count);
//        return count;
//    }

    private static int sumWithForLoop(int[] arr){
        int result=0;
        for(int i=0;i<arr.length;i++){
            result+=arr[i];
        }
        System.out.println(result);
        return result;
    }

    private static int sumWithForeachLoop(int[] arr){
        int result=0;
        for(int n:arr){
            result+=n;
        }
        System.out.println(result);
        return result;
    }

    private static int sumWithJava8(int[] arr){
        int n=Arrays.stream(arr).sum();
        System.out.println(n);
        return n;
    }

    private static int substraction(int[] n){
        int result=0;
        for(int i=0;i<n.length-1;i++){
            result-=i-i+1;
        }
        System.out.println(result);

        return result;
    }
}
