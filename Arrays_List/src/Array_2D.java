import java.util.Arrays;
import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        // number of columns in 2d array can be varied
        // 2d array is array of arrays
        //  each element itself is a array and size of particular array can be varied
        // syntax
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number of rows and columns ");
//        int row = input.nextInt();
//        int col = input.nextInt();
//        int[][] arr = new int[row][col];

        // for every row
//        for (int i = 0; i < arr.length; i++) {
//            // for each column in every row
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = input.nextInt();
//            }
//        }

        int[][] arr = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        // for each loop
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }

        //simple for loop
        for(int i = 0;i < arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        for(int i = 0;i < arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
