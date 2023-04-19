public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int ans = SearchInRange(arr,3,2,5);
        System.out.println(ans);
    }

    static int SearchInRange(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }

        // compare target with each element
        for (int index = start; index <= end; index++) {
            int ele = arr[index];
            if (ele == target){
                return index;
            }
        }

        // if all the above condition will not execute then this will
        return -1;
    }
}
