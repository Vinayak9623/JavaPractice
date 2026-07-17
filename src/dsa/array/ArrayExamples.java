package dsa.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayExamples {

    static void main() {
        int[] arr={1,2,3,4,5};
        System.out.println(LargestArray(arr));
        reverseArray(arr);
        System.out.println(sumOfElementsInArray(arr));
        countOccurencesInArray(arr);

        System.out.println(secondLargestElement(arr));
        System.out.println(checkArrayIsSortedOrNot(arr)); //check arreay above reverse array method is there


        moveZeroToEnd();


    }

    public static int LargestArray(int[] arr){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large)large=arr[i];
        }
        return large;
    }

    public static void reverseArray(int[] arr){
//        for(int i=arr.length-1;i>=0;i--){
//            System.out.print(arr[i]);
//        }
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int sumOfElementsInArray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void countOccurencesInArray(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();

        //1st way
//        for(int n:arr){
//            map.put(n,map.getOrDefault(n,0)+1);
//        }

        //2nd way
//        for(int n:arr){
//            if(!map.containsKey(n)){
//                map.put(n,1);
//            }
//            else {
//                map.put(n,map.get(n)+1);
//            }
//        }
   //     System.out.println(map);


        for(int i=0;i<arr.length;i++){
            //if int j=i then only use
//            if(map.containsKey(arr[i])){
//                continue;
//            }
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])count++;
            }
            map.put(arr[i],count);
        }
        System.out.println(map);
    }

    public static int secondLargestElement(int[] arr){
        int max=arr[0];
        int secondMax=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
        }
        return secondMax;
    }

    public static boolean checkArrayIsSortedOrNot(int[] arr){

        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return isSorted;
    }

    public static void moveZeroToEnd(){
        int[] arr={1,0,3,0,4,5,6};
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]==0){
                int temp=arr[i];
                if(arr[i+1]!=0){
                arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                else {
                    arr[i]=arr[i+2];
                    arr[i+2]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
