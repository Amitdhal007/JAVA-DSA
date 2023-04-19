import java.util.Scanner;
import java.util.ArrayList;

public class Multidimensional_List {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // creating 2d array list
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // now create list at each index
        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }

        // taking input from user
        for(int i = 0;i < 3; i++){
            for (int j = 0; j < 3; j++) {
                list.get(i).add(input.nextInt());
            }
        }

        // print
        System.out.println(list);
    }
}
