import java.util.Scanner;

public class Count_digit {
    public static void main(String[] args) {
        System.out.print("Enter number and key ");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int key = in.nextInt();
        int count = 0;

        while(n > 0){
            int last_digit = n % 10;
            if (key == last_digit){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
        in.close();
    }
}
