import java.util.Scanner;

public class Basic_cal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        int ans = 0;

        if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            if (ch == '+'){
                ans = num1 + num2;
            }
            else if (ch == '-'){
                ans = num1 - num2;
            }
            else if (ch == '*'){
                ans = num1 * num2;
            }
            else if (ch == '/'){
                if (num2 != 0) {
                    ans = num1 / num2;
                }
            }
        }

        System.out.println(ans);
        in.close();
    }
}

