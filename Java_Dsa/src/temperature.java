import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        System.out.print("Enter temp in celsius ");
        Scanner in = new Scanner(System.in);
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
    }
}
