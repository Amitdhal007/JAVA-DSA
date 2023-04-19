import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        System.out.print("Enter char ");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        }

        in.close();
    }
}
