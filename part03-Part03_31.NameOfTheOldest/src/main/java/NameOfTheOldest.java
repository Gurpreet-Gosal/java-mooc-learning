
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldAgeCheck = 0;
        String oldestName = "changeToOldest";
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
                oldestName = words[0];
            }

        }
        System.out.println("Name of the oldest: " + oldestName);

    }
}
