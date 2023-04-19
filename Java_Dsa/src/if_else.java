import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        System.out.print("Enter salary of employee ");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();

        // condition if salary > 10000 then add 2k else 1k
        if (salary > 10000){
            salary+=2000;
        }
        else{
            salary+=1000;
        }
        System.out.println("increased salary is "+salary);
        input.close();
    }
}
