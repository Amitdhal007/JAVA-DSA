public class Max_Wealth {
    public static void main(String[] args) {
        int[][] nums = {
                {1,3,5},
                {6,4,9},
                {4,7,1},
                {2,9}
        };

        int ans = max_wealth(nums);
        System.out.println(ans);
    }

    static int max_wealth(int[][] nums){
        int max_sum = Integer.MIN_VALUE;

        for (int[] s_arr : nums) {
            int sum_row = 0;
            for (int ele: s_arr) {
                sum_row += ele;
            }
            if (max_sum < sum_row) {
                max_sum = sum_row;
            }
        }
        return max_sum;
    }
}
