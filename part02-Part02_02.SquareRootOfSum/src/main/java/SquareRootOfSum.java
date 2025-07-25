
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fst = Double.valueOf(scanner.nextLine());
        double snd = Double.valueOf(scanner.nextLine());
        double sqt = fst+snd;
        System.out.println(Math.sqrt(sqt));

    }
}
