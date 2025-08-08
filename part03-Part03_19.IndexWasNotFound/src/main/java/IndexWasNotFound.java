
import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.println("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        // 1. Create a boolean flag, initially down.
        boolean isFound = false;

        // 2. Loop through the array to search.
        for (int i = 0; i < array.length; i++) {
            if (searching == array[i]) {
                System.out.println(searching + " is at index " + i + ".");
                // Raise the flag if the number is found.
                isFound = true;
            }
        }

        // 3. After the loop, check the flag.
        // If the flag is still false, the number was never found.
        if (isFound == false) {
            System.out.println(searching + " was not found.");
        }
    }

}
