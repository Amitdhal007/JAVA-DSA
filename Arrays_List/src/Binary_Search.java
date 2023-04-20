public class Binary_Search {
    public static void main(String[] args){
        int[] arr = {2,4,5,7,8,9,10,13,67,89};
        int key = 13;

        int ans = BinarySearch(arr,key);
        System.out.println(ans);
    }

    static int BinarySearch(int[] arr,int key){
        int start = 0;
        int end = arr.length - 1;

        // this thing we have to do until the arr contains only one ele
        while(start <= end){
            // int mid = (start + end) / 2; might be possible that (start + end) will exceed the range of int in java
            // and give error if numbers are too big
            int mid = start + (end - start)/2;
            if(arr[mid] == key){
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            }
        }
        return -1;
    }
}