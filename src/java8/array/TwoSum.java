package java8.array;

import java.util.Arrays;

public class TwoSum {

    static void main() {
        int[] arr={1,3,5,7,8,10};
        int target=12;
        int[] ints = twoSumUsingTwoPointer(arr, target);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[] {i,j};
                }
            }
        }
         return new int[] {};
    }

    public static int[] twoSumUsingTwoPointer(int[] arr, int target){
        int left=0;
        int right=arr.length-1;

        while(left<right){

            if(arr[left]+arr[right]==target){
                return new int[] {left,right};
            } else if (arr[left]+arr[right]>target) {
                right--;
            }
            else left++;
        }

        return new int[] {};
    }
}
