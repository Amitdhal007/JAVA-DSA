import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.print("Enter three number ");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
        int max = Math.max(c,Math.max(a,b));

        System.out.println("Max number among three is " + max);

        in.close();
    }
}
