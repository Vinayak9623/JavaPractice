package string;

import java.util.HashMap;

public class CharacterCount {

    static void main() {
        countCharacter("Vinayak");
    }
    private static void countCharacter(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        char[] ch=str.toCharArray();

        for(char c:ch){
            map.put(c,map.getOrDefault(c,0)+1);

//           if(map.containsKey(c)){
//                map.put(c, map.get(c)+1);
//            }
//           else {
//               map.put(c,1);
//           }
        }

        System.out.println(map);
    }
}
