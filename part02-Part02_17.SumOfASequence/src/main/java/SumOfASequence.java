
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task is to ask user for input
        System.out.println("Last number? ");
        //task is to get input from user and convert it into Integer datatype
        int num = Integer.valueOf(scanner.nextLine());
        //task is to define a variable whose value will add in the sequence after each iteration
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i; // shorthand for sum = sum + i
        }
        System.out.println("The sum is " + sum);

    }
}
