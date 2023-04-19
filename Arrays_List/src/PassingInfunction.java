import java.util.Arrays;

public class PassingInfunction {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums));
        Change(nums); // copy of reference variable is passed in func
        System.out.println(Arrays.toString(nums));
    }

    static void Change(int[] arr) {
        // both arr & nums pointing to the same object
        arr[0] = 99;
    }
}
