import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
        System.out.print("Enter number ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int prev = 0;
        int curr = 1;
        int count = 2;

        while (count <= number){
            int temp = curr;
            curr = curr + prev;
            prev = temp;
            count++;
        }

        System.out.println(curr);

        in.close();
    }
}
