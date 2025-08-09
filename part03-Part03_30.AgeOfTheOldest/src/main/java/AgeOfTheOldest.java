
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldAgeCheck = 0;
        while (true) {
            // 2. Read the user's input inside the loop
            String input = scanner.nextLine();

            // 3. Check for the exit condition
            if (input.isEmpty()) {
                break;
            }

            // 4. If not exiting, split the string into an array of words
            String[] words = input.split(",");
            //Finding age of the oldest
            int age = Integer.valueOf(words[1]);
            if (oldAgeCheck < age) {
                oldAgeCheck = age;
            }

        }
        System.out.println("Age of the oldest: " + oldAgeCheck);
    }
}
