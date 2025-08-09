
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfAges = 0;
        int countForAvg = 0;
        String longestName = "";
        while (true) {
            // 2. Read the user's input inside the loop
            String input = scanner.nextLine();

            // 3. Check for the exit condition
            if (input.isEmpty()) {
                break;
            }

            // 4. If not exiting, split the string into an array of words
            String[] words = input.split(",");
            String word = words[0];
            //Finding age of the oldest
            int age = Integer.valueOf(words[1]);
            sumOfAges = sumOfAges + age;
            if (longestName.length() < word.length()) {
                longestName = word;
            }
            countForAvg++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * sumOfAges / countForAvg);

    }
}
