package string;

public class SmallestAndLargestStringAlphabetically {

    public static void main(String args[]){

        String s="welcometojava";
        int k=3;

        System.out.println(smallestAndLargestSubString(s,k));

        //split this string in k substring
        //find smallest substring alphabetically
        //find largest substring alphabetically
    }

    public static String smallestAndLargestSubString(String s,int k){

        String currentSubString=s.substring(0,k);
        String smallestSubString=currentSubString;
        String largestSubString=currentSubString;

        for(int i=1;i<=s.length()-k;i++){
            currentSubString=s.substring(i,i+k);

            if(currentSubString.compareTo(smallestSubString)<0){
                smallestSubString=currentSubString;
            }
            if(currentSubString.compareTo(largestSubString)>0){
                largestSubString=currentSubString;
            }
        }

        return smallestSubString +"\n"+largestSubString;


    }
}
