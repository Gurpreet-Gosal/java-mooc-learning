
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int yr = Integer.valueOf(scan.nextLine());
        // A year is a leap year if it is divisible by 4,
        // unless it is divisible by 100 but not by 400.
        if ((yr % 4 == 0) && (yr % 100 != 0) || (yr % 400 == 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
