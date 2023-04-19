public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int ans = LinearSearch1(arr,15);
        System.out.println(ans);
    }

    // found target and return element
    static int LinearSearch1(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }

        // compare target with each element
        for(int ele: arr){
            if (ele == target){
                return ele;
            }
        }

        // if all the above condition will not execute then this will
        return Integer.MAX_VALUE;
    }

    // found target and return index
    static int LinearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }

        // compare target with each element
        for (int index = 0; index < arr.length; index++) {
            int ele = arr[index];
            if (ele == target){
                return index;
            }
        }

        // if all the above condition will not execute then this will
        return -1;
    }
}
