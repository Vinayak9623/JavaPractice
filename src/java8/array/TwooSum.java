package java8.array;

import java.util.Arrays;

public class TwooSum {

    static void main() {
     int[] arr={3,2,4};
     int target=6;
        int[] ints = twoSum(arr, target);
        int[] ints1 = twoPointerTechnique(arr, target);

        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints1));
    }

    public static int[] twoSum(int[] arr,int target){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target)return new int[] {i,j};
            }
        }
        return new int[] {};
    }

    public static int[] twoPointerTechnique(int[] arr, int target){
        int left=0;
        int right=arr.length-1;

        while(left<right){

            int sum=arr[left]+arr[right];
            if(sum==target)return new int[] {left,right};
            else if (sum<target) {
                left++;
            }
                 else right--;
        }
        return new int[] {};
    }
}
