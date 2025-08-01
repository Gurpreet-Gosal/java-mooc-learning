
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int num = 1;
        while (num <= number) {
            System.out.print("*");
            num++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int space = 1;
        while (space <= number) {
            System.out.print(" ");
            space++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            // For each row 'i', first print the required number of spaces.
            // The number of spaces is (size - i).
            printSpaces(size - i);

            // Then, print the required number of stars, which is equal to the current row number 'i'.
            printStars(i);

            // The printStars method already includes a line break, so the next row will start correctly.
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        // 1. Print the treetop
        for (int i = 1; i <= height; i++) {
            // Spaces are correct: (height - i)
            printSpaces(height - i);

            // Stars follow the formula (i * 2) - 1
            printStars((i * 2) - 1);
        }

        // 2. Print the base (twice)
        for (int i = 0; i < 2; i++) {
            // Spaces to center the 3-star base
            printSpaces(height - 2);

            // The base is always 3 stars wide
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
