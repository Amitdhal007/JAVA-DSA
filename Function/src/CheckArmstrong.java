import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        System.out.print("Enter number ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean res = Check_Arm(n);

        if (res){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not armstrong");
        }
    }

    static boolean Check_Arm(int n) {
        int temp = n;
        int sum = 0;
        while(n > 0){
            int res = n % 10;
            sum += res * res * res;
            n = n / 10;
        }
        if(temp == sum){
            return true;
        }
        return false;
    }
}
