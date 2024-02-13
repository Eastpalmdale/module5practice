import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        //variables
        Scanner in = new Scanner(System.in);
        String firstName;
        String lastName;
        double trash;
        // outputs
        System.out.println("What is your first name?");
        firstName= in.nextLine();
        System.out.println("What is your last name?");
        lastName = in.nextLine();
        System.out.println("Your full name is "+firstName + " " + lastName);
    }
}
