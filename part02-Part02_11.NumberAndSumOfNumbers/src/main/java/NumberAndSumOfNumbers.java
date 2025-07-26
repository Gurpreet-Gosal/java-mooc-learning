
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int add = 0;
        while (true) {
            //task is to ask the user for inout
            System.out.println("Give a number:");
            //taks is to read inout from user and convert it to integer type
            int num = Integer.valueOf(scanner.nextLine());
            //task is to exit loop if entered 0
            if (num == 0) {
                break;
            }
            //task is to count the calculate the amount of numbers entered
            count = count + 1;
            //task is to add the numberes entered
            add = add + num;
        }
        //task is to display count and addition
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + add);

    }
}
