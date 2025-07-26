
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            //task is to calculate the amount of positive numbers entered
            if (num >= 0) {
                count = count + 1;
            }
            if (num >= 0) {
                //task is to add the positive numberes entered
                add = add + num;
            }
        }
        if (count == 0 && add == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((1.0 * add / count));
        }

    }
}
