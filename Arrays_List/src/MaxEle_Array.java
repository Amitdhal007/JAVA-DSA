import java.util.Arrays;
import java.util.Scanner;

public class MaxEle_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int ans = Find_max(arr);
        System.out.println("Max number among the elements in array is: "+" "+ans);
    }

    static int Find_max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
