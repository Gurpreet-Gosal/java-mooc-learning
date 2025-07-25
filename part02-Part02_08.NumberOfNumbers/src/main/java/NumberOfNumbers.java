
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task is to keep track of values from the user
        int totl = 0;
        // The task is to read an input from the user
        while (true) {
            System.out.println("Give a number: ");
            // The task is to read a user inputted number
            int number = Integer.valueOf(scanner.nextLine());

            // The task is to exit the loop if the user
            // has inputted zero
            if (number == 0) {
                break;
            } else {
                totl = totl + 1;
            }
        }

        // The task is to print out the total of vlaues entered by user
        System.out.println("Number of numbers: " + totl);

    }
}
