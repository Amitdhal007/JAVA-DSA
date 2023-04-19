import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][];

        for (int i = 0;i < arr.length;i++){
            System.out.print("Enter number of col for "+i+" row :");
            int col = input.nextInt();

            // create array for each row
            arr[i] = new int[col];

            // taking input
            for (int j = 0; j < col; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        for(int i = 0;i < arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

//        for (int[] ele:arr) {
//            System.out.println(Arrays.toString(ele));
//        }

    }
}
