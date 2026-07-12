package dsa;

public class Complexity {
    static void main() {

        worstCase();
        bestCase();
        commonComplexity();
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
}
