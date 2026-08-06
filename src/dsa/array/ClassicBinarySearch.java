package dsa.array;

public class ClassicBinarySearch {

    static void main() {

        int[] arr={2,5,8,12,16,23,38,56,72,91};
        binarySearch(arr,56);

    }

    public static void binarySearch(int[] arr,int target){

        int left=0;
        int right=arr.length-1;
        int middle=left+(right-left)/2;

        while (left<right){
            if(arr[middle]==target || arr[left]==target || arr[right]==target){
                System.out.println("Target found at index: "+middle);
                return;
            }
            if(target>arr[middle]){
                left=middle;
                middle=left+(right-left)/2;
            }
            else  {
                right=middle;
                middle=left+(right-left)/2;
            }

        }

    }
}

//prat kal:
//