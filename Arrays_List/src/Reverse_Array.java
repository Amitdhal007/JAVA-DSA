import java.util.Scanner;
import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        Reverse_Arr(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void Reverse_Arr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            Swap_Array(arr,start,end);
            start++;
            end--;
        }
    }

    static void Swap_Array(int[] arr,int index1,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
