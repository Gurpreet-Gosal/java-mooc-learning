
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int add = 0;
        while (true) {
            //task is to ask user for giving a number
            System.out.println("Give a number:");
            //task is to get input from user
            int num = Integer.valueOf(scanner.nextLine());
            //task is to exit loop if input is 0
            if (num == 0) {
                break;
            }
            //task is to add the numbers enterd by user
            add = add + num;
        }
        //task is to diplay the sum of numbers enterd by user
        System.out.println("Sum of the numbers: " + add);

    }
}
