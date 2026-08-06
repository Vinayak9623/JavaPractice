package interviewPrep;

public class ReverseString {

    public static void main(String[] args){

//        reverseString("I love India");
//        reverseStringUsingJava8("I love India");

    }


    public static void reverseString(String s){

        //first way
        char[] ch=s.toCharArray();
        String reverse="";
        for(int i= ch.length-1;i>=0;i--){
            reverse+=ch[i];
        }
        System.out.println(reverse);
    }

    public static void reverseStringUsingJava8(String s){
        String reduce = s.chars().mapToObj(c -> String
                .valueOf((char) c))
                .reduce("", (a, b) -> (b + a));
        System.out.println(reduce);
    }
}
