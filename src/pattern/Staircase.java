package pattern;

public class Staircase {

    static void main() {

        //printStaircase(5);
        reverseStairCase(5);
    }

    public static void printStaircase(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
        //------------------------------------------------

        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void reverseStairCase(int n){

        for(int i=0;i<=4;i++){
            System.out.print(" ");
        }
        for(int j=0;j<n;j++){
            System.out.println("#");

        }
    }

}
