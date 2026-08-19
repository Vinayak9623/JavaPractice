package hackerRank;

public class StringIntro {

    static void main() {

        String A="hello";
        String B="java";
        sumOfStringLength(A,B);
        makeFirstLetterUpperCase(A,B);
        checkWhichStringComeFirst(A,B);
    }

    public static void sumOfStringLength(String A, String B){
        int sum = A.length() + B.length();
        System.out.println(sum);
    }

    public static void makeFirstLetterUpperCase(String A, String B){

        A=A.substring(0,1).toUpperCase() + A.substring(1);
        B=B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }

    public static void checkWhichStringComeFirst(String A,String B){
        if(A.compareTo(B) < 0){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
    }
}

