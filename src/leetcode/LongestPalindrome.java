package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestPalindrome {

    public static void main(String args[]){
        int madam = palindromeWithJava8("abccccdd");
        System.out.println(madam);

    }


    public static void simplePalindrome(String s){
//        StringBuilder stringBuilder = new StringBuilder(s);
//        String reverse = stringBuilder.reverse().toString();
//
//        if(s.equals(reverse)){
//            System.out.println(s+": is a palindrome");
//        }
//        else {
//            System.out.println(s+": is not a palindrome");
//        }
//         String reverse="";
//        for(int i=0;i<s.length();i++){
//            char c=s.charAt(i);
//            reverse=c+reverse;
//        }
//
//        if(s.equals(reverse)){
//            System.out.println(s+": is a palindrome");
//        }
//        else {
//            System.out.println(s+": is not a palindrome");
//        }

        String reversed = IntStream.range(0, s.length()).map(i -> s.charAt(s.length() - i - 1))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        if(s.equals(reversed)){
            System.out.println(s+": is a palindrome");
        }
        else {
            System.out.println(s+": is not a palindrome");
        }


    }


    private static int palindrome(String s){
        char[] ch=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
       int length=0;
       boolean hasOdd=false;
        for(char c:ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int frequency: map.values()){

            if(frequency%2==0){
                length+=frequency;
            }
            else {
                length+=frequency-1;
                hasOdd=true;
            }
        }

        if(hasOdd){
            length=length+1;
        }

        return length;

    }


    public static int palindromeWithJava8(String s){

        //convert string into character
        //calculate frequency of each character
        //check if it is even or odd if it is even add in length
        //if it is odd then add in lenguth by substutein 1
        //make is odd true id any one odd value is there
        //add length +1 and return length


        char[] ch=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();

        for(char c:ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int length = map.values().stream().mapToInt(frequency -> frequency % 2 == 0 ? frequency : frequency - 1)
                .sum();

        boolean isOdd = map.values().stream().anyMatch(frequency -> frequency % 2 != 0);

        if(isOdd){
            length++;
        }

        return length;
    }
}

