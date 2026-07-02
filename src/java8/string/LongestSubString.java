package java8.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    static void main() {

        System.out.println(longestSubStringWithTwoPointer("abcdb"));

    }

    public static int laongestSubString(String s){

        int currentLength;
        int priviousLength=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            currentLength=0;
            for(int j=i;j<s.length();j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    currentLength++;
                }
                else {
                    if(currentLength>priviousLength){
                        priviousLength=currentLength;
                    }
                    set.clear();
                    break;
                }
            }
        }
        return priviousLength;
    }

    public static int longestSubStringWithTwoPointer(String s){
        //abcdb
        Set<Character> set=new HashSet<>();
        int left=0;
        int right;
        int maxLength=0;
        for(right=0;right<s.length();right++){
            char currentletter=s.charAt(right);
            while(set.contains(currentletter)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentletter);
            int currentLength=right-left+1;
            if(currentLength>maxLength){
                maxLength=currentLength;

            }
        }
        return maxLength;
    }
}
