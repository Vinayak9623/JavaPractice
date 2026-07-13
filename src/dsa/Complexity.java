package dsa;

public class Complexity {
    static void main() {

        Integer x=10;//Integer.valueOf(10); AutoBoxing
         int y=x; // x.IntValue(); unBoxing

        //cache -128 to +127


        Integer a=127;
        Integer b=127;

        int c=128;
        int z=128;
        System.out.println(c==z);
        System.out.println(a==b);

//        worstCase();
//        bestCase();
//        commonComplexity();
    }

    //Big O
    public static void worstCase(){
        int[] arr={10,20,30,40,50,60,70,80,90};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==90) {
                System.out.println(arr[i]);
                break;
            }

        }
    }

    //Big Omegaa

    public static void bestCase(){
        int[] arr={10,20,30,40,50,60,70,80,90};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==10){
                System.out.println(arr[i]);
                break;
            }
        }
    }

    //Average case

    public static void averageCase(){
        int[] arr={10,20,30,40,50,60,70,80,90};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==40){
                System.out.println(arr[i]);
                break;
            }
        }
    }


    public static void commonComplexity(){
        int[] arr={10,20,30,40,50,60,70,80,90};

        //1. O(1)   constant time
        int first=arr[0];
        System.out.println(first);


        //2. O(log n)   Binary search if 1024 size = 1024/2= 512/2= ...

        //3. Linear O(n)  it normal loop

        //4. O(n log n)  merge sort

        //5. O(n2) nested loop

        //6. O(n3) triple loop
        //7. O(2n) recursion verry expensive
        //8. O(n!) worst among common algorithm


    }

//O(log n)
    public static void binaryExample(){
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target=15;
        int left=0;
        int right=arr.length-1;
        while (left<=right){

            int middle=(left+right)/2;

            if(target>arr[middle]){
                left=middle+1;
            }
            else if(target<arr[middle]){
                right=middle-1;
            }
            else {
                System.out.println("Target found:"+arr[middle]);
                break;
            }
        }

        System.out.println("Target not found");
    }


    public static void linearExample(){
     int[] arr={1,2,3,4,5,6,7,8,9,10};
     for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
     }
    }
}
