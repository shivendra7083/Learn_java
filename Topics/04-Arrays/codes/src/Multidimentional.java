import java.util.Arrays;
import java.util.Scanner;

public class Multidimentional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2d array

        //int [][] arr = new int [3][];
//        int[][] arr = {
//                {1,2,3 } ,
//                {4,5,6} ,
//                {7,8,9}
//        };
        int [][] arr = new int[4][3] ;

        // input
        System.out.println(arr.length); // Number of rows

        for (int row = 0 ; row < arr.length  ; row ++   ) {
            // for each col in every row
            for (int col = 0; col < arr[row].length ; col++) {
                arr [row][col] = sc.nextInt();
            }
        }
        // output
//         (int row = 0 ; row < arr.length  ; row ++   ) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();


//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for( int [] a : arr ){
            System.out.println(Arrays.toString(a));
        }
    }
}