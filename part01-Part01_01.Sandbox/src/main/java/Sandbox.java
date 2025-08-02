
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
