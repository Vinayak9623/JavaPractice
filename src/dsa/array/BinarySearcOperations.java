package dsa.array;


public class BinarySearcOperations {
    static void main() {
        int[] arr={10,20,30,40,50,60,70,80,90,100};

        int indexWithLinearSearch = findIndexWithLinearSearch(arr, 60);
        System.out.println(indexWithLinearSearch);
        int index = findIndex(arr, 50);
        System.out.println(index);
    }

    public static int findIndexWithLinearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)return i;
        }
        return -1;
    }
    public static int findIndex(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int middle=left+(right-left)/2;

        while (left<right) {
            if (arr[middle] == target) return middle;
            if (arr[middle] > target) {
                right=middle-1;
                middle=left+right-left/2;
            }
            else {
                left=middle+1;
                middle=left+right-left/2;
            }
            }

        return middle;
        }


}
