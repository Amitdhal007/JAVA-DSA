import java.util.Arrays;
import java.util.Scanner;

public class Array_1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // in arrays objects are stored in sequential/continuous order bcz objects are stored in heap
        // and in heap objects are stored in random position depend on (jvm)
        // non-primitive can be null but primitive can't be null
        // by default int arr contains 0 whereas string arr is null even after memory for objects is reserved

        // array of primitives
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 13;
        arr[2] = 15;
//        System.out.println(Arrays.toString(arr));

        // array of objects
        String[] array = new String[5];
//        System.out.println(Arrays.toString(array));

        // taking input using for loop
        for (int i = 0; i < array.length; i++) {
                array[i] =  input.next();
        }

        // printing element using for each loop
        for(String ele: array){
            System.out.print(ele+" ");
        }

        // another method of printing
        System.out.println(Arrays.toString(array));
    }
}
