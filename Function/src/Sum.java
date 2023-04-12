import java.util.Scanner;

public class Sum {

    static int Do_Sum(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 and num2: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int ans = Do_Sum(num1,num2);
        System.out.println("Sum is "+ans);
        input.close();
    }

}
