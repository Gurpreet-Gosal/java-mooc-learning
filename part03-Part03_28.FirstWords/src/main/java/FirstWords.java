
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Create a loop that runs forever until broken
        while (true) {
            // 2. Read the user's input inside the loop
            String input = scanner.nextLine();

            // 3. Check for the exit condition
            if (input.isEmpty()) {
                break;
            }

            // 4. If not exiting, split the string into an array of words
            String[] words = input.split(" ");
            System.out.println(words[0]);
        }
    }
}
