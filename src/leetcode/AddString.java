package leetcode;

public class AddString {


//    Input: num1 = "11", num2 = "123"
//    Output: "134"

    // 11
    //123

    public static void main(String args[]){

        String s = addString("11", "123");
        System.out.println(s);


    }

    public static String addString(String num1,String num2){
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        StringBuffer result=new StringBuffer();

        while(i>=0 || j>=0||carry>0){

            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2= j>=0?num2.charAt(j)-'0':0;

            int sum=digit1+digit2+carry;

            int digits=sum%10;
            carry=sum/10;
            result.append(digits);

            i--;
            j--;
        }
        return result.reverse().toString();
    }
}
