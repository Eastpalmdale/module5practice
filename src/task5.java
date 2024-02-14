import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        double waterTemp;
        String trash;
        //outputs/inputs

        System.out.println("Please input your water temp");
        if (in.hasNextDouble()) {
            waterTemp = in.nextDouble();
            if (waterTemp >= 212)
                System.out.println("The water temp you have put in is a gas state.");

            else if (waterTemp <= 33){
                System.out.println("Water at this temperature is solid.");
        }
            else {System.out.println("The water at this temp is liquid.");
            }


        }

        else {
            trash = in.nextLine();
            System.out.println("Please type in a valid number, not a letter, only numbers.");
        }
    }
}
