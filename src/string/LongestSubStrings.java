package string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStrings {

    static void main() {

        int i = longestSubString("Vinayak");
        System.out.println(i);
        longestSubStringWithSlidingWindow("Vinayak");


    }
    public static int longestSubString(String s) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();

            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (!set.contains(c)) {
                    set.add(c);
                    if (max < set.size()) {
                        max = set.size();
                    }
                } else {
                    break;
                }
            }


        }
        return max;
    }

    public static void longestSubStringWithSlidingWindow(String s){

        int left=0;
        int right=0;
        int max=0;
        Set<Character> set=new HashSet<>();
        while (right<s.length()){
            char c=s.charAt(right);
            char c1=s.charAt(left);
            if(!set.contains(c)){
                set.add(c);
                if(max< set.size()){
                    max= set.size();
                }
                right++;
            }
            else {
                set.remove(c1);
                left++;

            }
        }

        System.out.println(max);
    }

}
