public class OrderAgnosticBS {
    public static void main(String[] args){
//        int[] arr = {12,34,56,78,90,122,567};
        int[] arr = {100,90,78,65,50,45,33,21,10,5};
        int target = 78;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end]; // if cond true's then it will store true otherwise it stores false

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }
            }else{
                if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
