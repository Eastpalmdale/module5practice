import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // variables
        int userNumber;
        double userDouble;
        String trash;
        // outputs
        System.out.println("Please type in your number");
            if (in.hasNextInt()) {
                userNumber = in.nextInt();
                System.out.println("The number you inputted was an int.");


            } else if (in.hasNextDouble()) {
                    userDouble = in.nextDouble();
                    System.out.println("The number you inputted was a double.");
            }

            else {
                trash = in.nextLine();
            System.out.println("You have inputted something that is not an int or a double, please type in a valid number.");

            }
    }
}
