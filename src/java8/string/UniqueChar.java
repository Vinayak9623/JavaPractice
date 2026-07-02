package java8.string;

import java.util.ArrayList;
import java.util.List;

public class UniqueChar {

    public static void main(String args[]){
        String s="My name is vinayak";
        uniqueChar(s);
    }
    public static void uniqueChar(String s){
       List<Character> list =new ArrayList<>();
        for(int i=0;i<s.length();i++){
            int count=0;
            char c=s.charAt(i);
            for(int j=0;j<s.length();j++){
                char c1=s.charAt(j);
                 if(c==c1) count=1;
            }
            if(count<=1) list.add(c);
        }
        System.out.println(list);
    }
}
