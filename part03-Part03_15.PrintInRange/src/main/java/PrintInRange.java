
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5); // Should print 3, 2, 5, 1

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10); // Should print 3, 6, 5
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        // Use a for-each loop to go through each number in the list
        for (int number : numbers) {
            // Use an if statement to check if the number is within the range
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
    
}
