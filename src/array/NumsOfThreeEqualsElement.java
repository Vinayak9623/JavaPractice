package array;

public class NumsOfThreeEqualsElement {

    static void main() {
        int[] nums={1,2,1,1,3};
        numsOfThreeEqualsElement(nums);
    }

    public static int numsOfThreeEqualsElement(int[] nums){

        int min=Integer.MAX_VALUE;
        //abs(i - j) + abs(j - k) + abs(k - i)
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]==nums[j]&& nums[i]==nums[k]){
                        int i1 = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                        if(min>i1){min=i1;}
                    }
                }
            }

        }
        System.out.println(min);
        return (min==Integer.MAX_VALUE)?-1:min;
    }
}
