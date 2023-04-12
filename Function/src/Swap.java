import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name 1 and 2 ");
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        SwapName(name1,name2);
        System.out.println(name1 +","+ name2);

        //primitives are actually call by value so the changes made by copy variable are not reflected
        //for complex data types sre also call by value but value of reference variable is passed
        //i.e both the reference variable are pointed to the same object so changes made by one are
        // reflected to other but in case of string we can't change bcz it is immutable(can't change)
    }

    static void SwapName(String naam1,String naam2) {
        String temp = naam1;
        naam1 = naam2;
        naam2 = temp;

    }
}
