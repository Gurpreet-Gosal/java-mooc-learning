
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        //System.out.println("Hello World");when I use ln, it break the line
        //System.out.print(" from Gurpreet Singh");when I don't use ln, it continues in same line
        //System.out.println(" Gosal");
        //System.out.print("next line using " + "\n");
        //System.out.print("hello\n");
        //System.out.println("...and the universe");
        //System.out.println("hello\b");//\b is similar to backspace i.e. o/p is hell
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");

        try {
            // We "try" to run this dangerous code.
            int number = Integer.valueOf(scanner.nextLine());
            System.out.println("Good job! Your number is: " + number);

        } catch (Exception e) {
            // If the code in the 'try' block crashes, we land here.
            System.out.println("Error: That was not a valid number!");
        }

        // The program continues running instead of crashing.
        System.out.println("The program continues...");
        printHollowSquare(5);
        printInvertedNumberTriangle(5);
        printNumberTriangle(4);
        printFloydsTriangle(3);
        printAlphabetTriangle(3);
    }

    public static void printNumbers(int number) {
        int num = 1;
        while (num <= number) {
            System.out.print(num);
            num++;
        }
        System.out.println();
    }

    public static void printHollowSquare(int size) {
        // Outer loop for the rows (from 1 to size)
        for (int i = 1; i <= size; i++) {
            // Inner loop for the columns (from 1 to size)
            for (int j = 1; j <= size; j++) {
                // Check if we are on any of the four borders
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // After the inner loop finishes, print a new line to move to the next row
            System.out.println();
        }
    }

    public static void printInvertedNumberTriangle(int size) {
        for (int i = size; i > 0; i--) {
            printNumbers(i);
        }
    }

    public static void printNumberTriangle(int height) {
        int tri = 1;
        while (tri <= height) {
            printNumbers(tri);
            tri++;
        }
    }

    public static void printFloydsTriangle(int height) {
        int nextNumberForRow = 1; // This will be the first number of each row

        for (int i = 1; i <= height; i++) {
            // Call the helper method to print one row
            // Update 'nextNumberForRow' with the value returned by the method
            nextNumberForRow = printFloydsRow(i, nextNumberForRow);

            // Print a line break to move to the next row
            System.out.println();
        }
    }

    public static int printFloydsRow(int numberOfColumns, int startingNumber) {
        int counter = startingNumber;

        // This loop prints one row of the triangle
        for (int j = 0; j < numberOfColumns; j++) {
            System.out.print(counter + " ");
            counter++;
        }

        // Return the next number that should be printed
        return counter;
    }

    public static void printAlphabetTriangle(int size) {
        char letter = 'A'; // Initialize the character counter, saved in java as 65

        // Outer loop for the rows
        for (int i = 1; i <= size; i++) {
            // Inner loop for the columns
            for (int j = 1; j <= i; j++) {
                System.out.print(letter); // No space needed after
                letter++; // Increment to the next letter in the alphabet
            }
            // Move to the next line
            System.out.println("");
        }
    }
}
