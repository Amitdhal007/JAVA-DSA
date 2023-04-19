import java.util.ArrayList;
import java.util.Scanner;

public class UserInputArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // taking input using for loop
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // to print using for each loop
        for(int ele:list){
            System.out.println(ele);
        }

        System.out.println();

        // using simple for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

    }
}
