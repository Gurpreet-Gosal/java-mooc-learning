
import java.util.Scanner;

public class AverageOfNumbers {

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
        System.out.println("Average of the numbers: " + (1.0 * add / count));

    }
}
