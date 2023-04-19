public class Max_In2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,58,6},
                {7,8,9,10}
        };

        int ans = max(arr);
        System.out.println(ans);

    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] s_arr: arr){
            for(int ele: s_arr){
                if (ele > max){
                    max = ele;
                }
            }
        }
        return max;
    }
}
