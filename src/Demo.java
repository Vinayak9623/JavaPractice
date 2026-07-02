import java.util.stream.IntStream;

public class Demo {
    static void main() {

        long end=(long)Math.sqrt(16);
        System.out.println(end);

    }

    public static void primeNumber(int number){
        //number is divided by 1 or itself is prime number
            int count=0;
            for(int j=1;j<=number;j++){
                if(number%j==0) count++;
            }
            if(count==2) System.out.println(number+": is a prime number");
            else System.out.println(number+": is not a prime number");
        }

        private static void PrimeNumbers(int number){
            boolean b = IntStream.range(2, (int) Math.sqrt(number) + 1).noneMatch(x -> number % x == 0);
            if(b) System.out.println(number+": is a  prime number");
            else System.out.println(number+": is not a prime number");
        }


        public static boolean p(int number){
            boolean b = IntStream.range(2, (int) Math.sqrt(number) + 1).noneMatch(x -> number % x == 0);
            if(b) return true;
            return false;

        }

        public static boolean isPrime(int number){

        boolean isprime=true;

        for(int i=2;i<=Math.sqrt(number);i++){

            if(number%i==0) return false;

            break;
        }
        return isprime;
        }
}
