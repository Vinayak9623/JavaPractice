package twoPointer;

import java.util.Arrays;

public class TwoSum {
    static void main() {
        int[] arr={1,2,5,7,9};
        int target=14;
        System.out.println(Arrays.toString(twoSumUsingTwoPointer(arr,target)));
    }

    public static int[] twoSumUsingTradditonal(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++ ){
                if(target==arr[i]+arr[j])return new int[] {i, j};
            }
        }
        return new int[] {};
    }

    public static int[] twoSumUsingTwoPointer(int[] arr, int target){
        int left=0;
        int right=arr.length-1;

        while (left<right){

            if(target==arr[left]+arr[right]){
                return new int[] {left, right};
            } else if (target>arr[left]+arr[right]) {
                left++;
            }
            else right--;
        }
        return new int[] {};
    }
}
