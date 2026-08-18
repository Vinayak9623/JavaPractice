package hackerRank;

import java8.test.A;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StringOperation {

    static void main() {

        String s1 = "abcdd";
        String s2 = "abcd";

        List<Integer> diffChar = getIndexOfUniqueCharacterInTwoString(s1, s2);

        System.out.println(diffChar);

        List<Integer> indexOfUniqueCharacterInTwoStringUsingStringBuilder = getIndexOfUniqueCharacterInTwoStringUsingStringBuilder(s1, s2);
        System.out.println(indexOfUniqueCharacterInTwoStringUsingStringBuilder);

        List<Integer> indexOfUniqueCharacterInTwoStringUsingStringUsingJava8 = getIndexOfUniqueCharacterInTwoStringUsingStringUsingJava8(s1, s2);
        System.out.println(indexOfUniqueCharacterInTwoStringUsingStringUsingJava8);


    }

    public static List<Integer> getIndexOfUniqueCharacterInTwoString(String s1,String s2){

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            String newString=s1.substring(0,i)+s1.substring(i+1);
            if(newString.equals(s2)){
                list.add(i);
            }
        }

        return list;
    }


    public static List<Integer> getIndexOfUniqueCharacterInTwoStringUsingStringBuilder(String s1,String s2){

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            StringBuilder sb=new StringBuilder(s1);
            StringBuilder deleted = sb.deleteCharAt(i);
            if(deleted.toString().equals(s2)){
                list.add(i);
            }
        }
        return list;
    }

    public static List<Integer> getIndexOfUniqueCharacterInTwoStringUsingStringUsingJava8(String s1,String s2){
         return IntStream.range(0,s1.length()).filter(i->{
             String newString=s1.substring(0,i)+s1.substring(i+1);
             return newString.equals(s2);
         }).boxed().toList();
    }
}
