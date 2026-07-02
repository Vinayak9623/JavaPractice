package java8;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    static void main() {
        String s="abcdbcabnmbb";
        longestSubString(s);
    }

    public static int longestSubString(String s){
      Set<Character> set=new HashSet<>();

      int left=0;
      int right=0;
      int max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
         while (set.contains(c)){
             set.remove(s.charAt(left));
             left++;
         }
         set.add(c);
         int n= set.size();
         if(n>max){
             max=n;
         }

        }
        System.out.println(max);
        return max;
    }
}
