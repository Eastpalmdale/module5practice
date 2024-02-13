import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        int userNumber;
        String trash;
        // outputs/inputs
        System.out.println("Please enter a number");
        if (in.hasNextInt()) {

            userNumber = in.nextInt();

            if (userNumber > 0) System.out.println("The number you entered is positive");
            else System.out.println("The number you entered is negative");
        }
    }
}
