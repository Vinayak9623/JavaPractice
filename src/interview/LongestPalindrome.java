package interview;

public class LongestPalindrome {


    public static void main(String args[]){
//        longestPalindrome("babal");
//        reverseString("Vinayak");

        longPalindromeInString("babal");
        reverseStrings("Vinayak");

    }


    public static String longestPalindrome(String s){
        String sub="";
        String max="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                 sub = s.substring(i, j);
                if(isPalindrome(sub)){
                    System.out.println(sub);
                    if(sub.length()>max.length())max=sub;
                }
            }

        }
        System.out.println("Longest Palindrome of this string is:"+max);
        return max;
    }

    public static boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;

        while (left<right){
            if(s.charAt(left)!=s.charAt(right))return false;
            left++;
            right--;
        }

        return true;
    }


    public static String reverseString(String s){
        int left=0;
        int right=s.length()-1;

        String reverse="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            reverse=c+reverse;
        }
        System.out.println(reverse);
        return reverse;
    }



    public static void longPalindromeInString(String s){
        String max="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String substring = s.substring(i, j);
                if(ifPalindrome(substring)){
                    if(max.length()<substring.length())max=substring;
                }
            }
        }

        System.out.println(max);

    }

    private static boolean ifPalindrome(String s){
        int left=0;
        int right=s.length()-1;

        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }


    public static String reverseStrings(String s){

        int left=0;
        int right=s.length()-1;
        char[] ch=s.toCharArray();

        while (left<right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        System.out.println(ch);

        return s;
    }

}
