
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 6);
        int fst = 1;
        int snd = 10;
        divisibleByThreeInRange(fst, snd);
        System.out.println("Enter first number");
        int one = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter second number");
        int two = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(one, two);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
