
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // 2. Read the user's input inside the loop
            String input = scanner.nextLine();

            // 3. Check for the exit condition
            if (input.isEmpty()) {
                break;
            }

            // 4. If not exiting, split the string into an array of words
            String[] words = input.split(" ");
            System.out.println(words[words.length - 1]);
        }

    }
}
