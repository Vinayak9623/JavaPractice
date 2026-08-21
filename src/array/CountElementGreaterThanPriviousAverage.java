package array;

import java.util.List;

public class CountElementGreaterThanPriviousAverage {

    public static void main(String args[]){
        List<Integer> list=List.of(4,100, 200, 150,300);

        int count=countElementGreterThanPriviousAverage(list);
        System.out.println("Count of elements greater than previous average: " + count);
    }

    public static int countElementGreterThanPriviousAverage(List<Integer> list){

        //privious element check if not then skip this element
        // find average of privious element
        //check current elemet is greater than privious average or not
        //if yes then add this in count
        //return count

        if(list==null || list.size()<=1){
            return 0;
        }

        int count=0;
        int sum=list.get(0);
        for(int i=1;i<list.size();i++){
           long currentSum=list.get(i);
           if(currentSum*i>sum){
               count++;
           }
           sum+=currentSum;

        }

        return count;

    }
}
