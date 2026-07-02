package twoDarray;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoDArray {
    static void main() {

//       sumOfTwoDimensionArray();
//        maxValueInTwoDimensionArray();
//        sumOfEachRowin2dArray();

        leftToRightDiagonalSum();
        rightToLeftDiagonal();
        differnceOf2Diagonal();
    }

    private static void declareAndTraverseArray(){
        int[][] x=new int[3][3];
        x[0][0]=1;
        x[0][1]=2;
        x[0][2]=3;
        x[1][0]=4;
        x[1][1]=5;
        x[1][2]=6;
        x[2][0]=8;
        x[2][1]=9;
        x[2][2]=10;
        for(int i=0;i<x.length;i++){
            for(int j=0;j< x[i].length;j++){
                System.out.print(x[i][j]+",");
            }
            System.out.println();
        }
    }


    private static int sumOfTwoDimensionArray(){

        int[][] x={
                {1,2},
                {3,4}
        };
        int sum1 = Arrays.stream(x).flatMapToInt(Arrays::stream).sum();
        System.out.println("Addition of sum1 with java8 :"+sum1);
        int sum=0;
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                sum+=x[i][j];
            }
        }
        System.out.println("Sum of 2 dimensional Array Is :"+sum);
        return sum;
    }

    private static void maxValueInTwoDimensionArray(){

        int[][] x={
                {1,2,3},
                {7,5,10}
        };

        Arrays.stream(x).flatMapToInt(Arrays::stream).max()
                .ifPresent(m-> System.out.println("Max element with java8 is :"+ m));
        int max=0;
        for(int i=0;i< x.length;i++){
            for(int j=0;j<x[i].length;j++){
                if(x[i][j]>max){
                    max=x[i][j];
                }
            }
        }

        System.out.println("Max element in 2D array is: "+ max);
    }

    private static void sumOfEachRowin2dArray(){

        int[][] x={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        Arrays.stream(x).mapToInt(row->Arrays.stream(row).sum()).forEach(System.out::println);
        for(int i=0;i<x.length;i++){
            int sum=0;
            for(int j=0;j<x[i].length;j++){
                sum+=x[i][j];
            }
            System.out.println(sum);
        }
    }

    private static void leftToRightDiagonalSum(){

        int[][] x={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int sum1 = IntStream.range(0, x.length).map(i -> x[i][i]).sum();
        System.out.println("Diagonal sum of 2D Array  with java8 is: "+sum1);
        int sum=0;
        for(int i=0;i<x.length;i++){
            sum+=x[i][i];
        }

        System.out.println("Diagonal sum of 2D Array is: "+sum);
    }

    private static void rightToLeftDiagonal(){

        int[][] x={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };



        int sum1 = IntStream.range(0, x.length).map(i -> x[i][x.length - 1 - i]).sum();
        System.out.println("rightToLeftDiagonal sum of 2d Array with java8 is:"+ sum1);

        int sum=0;
            for(int j=x[0].length-1;j>=0;j--){
                sum+=x[j][j];
            }
        System.out.println("rightToLeftDiagonal sum of 2d Array is:"+ sum);
    }

    private static void differnceOf2Diagonal(){

        int[][] x={
                {6,7,8},
                {9,10,11},
                {44,66,78}
        };

        int leftToRightDiagonal = IntStream.range(0, x.length).map(i -> x[i][i]).sum();
        int RightToLeftDiagonals = IntStream.range(0, x.length).map(i -> x[i][x.length - 1 - i]).sum();

        int diff=Math.abs(leftToRightDiagonal-RightToLeftDiagonals);

        System.out.println("Difference in Diagonals are: "+diff);
    }
}
