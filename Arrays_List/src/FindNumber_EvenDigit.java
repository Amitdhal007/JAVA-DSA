public class FindNumber_EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12,2,356,47,51};
        int total_count = FindNumber(nums);
        System.out.println(total_count);
    }

    // returning count of numbers that have even no of digits
    static int FindNumber(int[] nums){
        int count = 0;
        for(int ele: nums){
            if(even(ele)){
                count++;
            }
        }
        return count;
    }


    // returning true if even no of digits else false
    static boolean even(int ele){
        int Numberofdigit = digit3(ele);

        return (Numberofdigit % 2 == 0);
    }

    // counting no of digits
    static int digit(int ele){
        if(ele < 0){
            ele = ele * -1;
        }
        return (int)(Math.log10(ele)) + 1;
    }

    static int digit2(int ele){
        if(ele < 0){
            ele = ele * -1;
        }

        String word = Integer.toString(ele);
        int count = word.length();
        return count;
    }

    static int digit3(int ele){
        if(ele < 0){
            ele = ele * -1;
        }

        if(ele == 0){
            return  1;
        }

        int count = 0;
        while(ele > 0){
            count = count + 1;
            ele /= 10;
        }
        return count;
    }
}
