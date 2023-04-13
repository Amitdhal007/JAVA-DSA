import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean ans = Prime(n);

        if (ans){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime Number");
        }
    }

    static boolean Prime(int n){
        if(n <= 1){
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }

        // only for odd number
        for (int i = 3; i <= Math.sqrt(n); i=i+2){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
