public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {11,12,32,14,58,6,17};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }

        return min;
    }
}
