import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        System.out.print("Enter fruit name ");
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch (fruit){
            case "mango" :
                System.out.println("Very delicious!!");
                break;
            case "apple" :
                System.out.println("delicious red fruit");
                break;
            case "grapes" :
                System.out.println("small fruit");
                break;
            default:
                System.out.println("please enter valid fruit");
        }
    }
}
