import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args){
        int[][] arr = new int[][]{
                {12,45,89},
                {23,65},
                {14,68,77,54}
        };

        int target = 65;
//        System.out.println(Search(arr,target));
        int[] ans = Search2d(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static boolean Search(int[][] arr, int target) {

        if (arr.length == 0){
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]){
                    return true;
                }
            }
        }

        return false;
    }

    // returning index which is stored in array
    static int[] Search2d(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
