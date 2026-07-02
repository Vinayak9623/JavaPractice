package multiThread;

import java.util.stream.IntStream;

public class World{
    //converInto char
    //check position
    // condition if even then capital or else small
    //add character in string
    //print string
    static void main() {

        operationOnString("vinayak");
        String s="vinayak";
        char[] charArray = s.toCharArray();

        StringBuilder sb  =new StringBuilder();

        for(int i=0;i<charArray.length;i++){

            if(i%2==0){
                char upperCase = Character.toUpperCase(charArray[i]);
                sb.append(upperCase);
            }
            else {
                char lowerCase = Character.toLowerCase(charArray[i]);
                sb.append(lowerCase);
            }

        }

        System.out.println(sb);

    }

    public static void operationOnString(String s){

        String result =IntStream.range(0,s.length()).
                mapToObj(x->{
                    char c=s.charAt(x);
                    return (x%2==0) ?Character.toUpperCase(c):Character.toLowerCase(c);
                }).map(String::valueOf).reduce("",String::concat);
        System.out.println(result);
    }

}
