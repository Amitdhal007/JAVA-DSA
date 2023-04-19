import java.util.Scanner;

public class reverse_number{
    public static void main(String[] args) {
        System.out.print("Enter a number ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int ans = 0;

        while (number > 0){
            int last_digit = number % 10;
            number = number / 10;
            ans = ans * 10 + last_digit;
        }

        System.out.print(ans);
        input.close();
    }
}