
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            //Task is to ask user to input a number
            System.out.println("Give a number:");
            //Task is to take input from user and convert it into integer
            int num = Integer.valueOf(scanner.nextLine());
            //task is to exit loop if user input 0
            if (num == 0) {
                break;
            }
            //task is to count negative numbers input by user
            if (num <= 0) {
                count = count + 1;
            }
        }
        System.out.println("Number of negative numbers: " + count);

    }
}
