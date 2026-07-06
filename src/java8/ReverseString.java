package java8;

public class ReverseString {
    public static void main(String args[]){
        String s="Vinayak";
        reverseString(s);
    }

    public static void reverseString(String s){
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            System.out.print(c+"");
        }
    }
}
