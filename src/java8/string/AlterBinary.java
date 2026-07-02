package java8.string;

public class AlterBinary {


    public static void main(String args[]){

        int i = minOperations("1111");
        System.out.println(i);
    }
    public static int minOperations(String s) {

        int count=0;
        int counts=0;

        for(int i=0;i<s.length();i++){

            char c1=(i%2==0)?'0':'1';
            char c2=(i%2==0)?'1':'0';

            if(s.charAt(i)!=c1){
                count++;
            }
            if(s.charAt(i)!=c2){
                counts++;
            }
        }

return Math.min(count,counts);
    }
}
