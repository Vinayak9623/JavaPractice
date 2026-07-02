package java8.string;

public class OperationOnString {

    static void main() {

        String s="gfjhd siofcu dcfuhf duh fhfhhf duh";
        String s1="duh";
        int i = nouberOfOccureString(s, s1);
        System.out.println(i);
    }

    public static int nouberOfOccureString(String s, String s1){
        int count=0;
        for(int i=0;i<=s.length()-s1.length();i++){
            if(s.substring(i,i+s1.length()).equals(s1)) count ++;
        }
        return count;
    }
}
