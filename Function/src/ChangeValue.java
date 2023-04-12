import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ChangeVal(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void ChangeVal(int[] num) {
        num[0] = 23;
        // here we are changing the object using copy of
        // reference variable so the result is also reflected to reference variable
    }
}
