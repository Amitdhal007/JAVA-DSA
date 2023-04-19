import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // array list syntax
        ArrayList<Integer> list = new ArrayList<>(); // () means we can declare size
        // to add items in it
        // in arraylist we can add as many as element we want
        list.add(12);
        list.add(19);
        list.add(17);
        list.add(14);

        // to print list
        System.out.println(list);

        // to update something use set method
        list.set(1,89); // index,element

        System.out.println(list);

        // to update something
        list.remove(2);

        System.out.println(list);
    }
}

