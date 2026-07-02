package java8.array;

import java.util.*;

public class SingleOne {

    public static void main(String args[]){

        int[] arr={-1};
        int singleOne = exe(arr);
        System.out.println(singleOne);


    }

    public static int findSingleOne(int[] arr){

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count==1)return arr[i];
        }
        return -1;
    }



    public  static int exe(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for (int ele  : arr )
        {
            if(!map.containsKey(ele))
                map.put(ele,0);
            int val=map.get(ele)+1;
            map.put(ele,val);
            if(val==1)
                set.add(ele);
            else if(val==2)
                set.remove(ele);
        }
        return set.stream().findFirst().orElse(-1);
    }


    public  static int findSingleOnes(int[] arr){

        int ar[]=new int[3374592+2];
        int arm[]=new int[3374592+2];
        for (int ele : arr)
        {
            if(ele<0)
            {
                int ind=Math.abs(ele);
                arm[ind]=arm[ind]+1;
            }
            else ar[ele]=ar[ele]+1;
        }

        for (int ele : arr)
        {

            if(ele<0)
            {
                int ind=Math.abs(ele);
                if(arm[ind]==1) return
                    ele;
            }
            else if(ar[ele]==1)
                return ele;

        }
        return -1;
    }
}
