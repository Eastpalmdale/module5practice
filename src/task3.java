import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // variables
        double userNumber1;
        double userNumber2;
        double userTotal;
        String trash;
        // outputs/inputs
        System.out.println("Please input your first number");
        if (in.hasNextDouble()) {
            userNumber1 = in.nextDouble();

            System.out.println("Please input your second number");
        if (in.hasNextDouble()) {
                userNumber2 = in.nextDouble();
                userTotal = userNumber1 * userNumber2;
            System.out.println("Your total after multiplying is "+userTotal);

            }
            else
                trash = in.nextLine();
            System.out.println("You have inputted something that isn't accepted, please try again.");
        }
    }
}
