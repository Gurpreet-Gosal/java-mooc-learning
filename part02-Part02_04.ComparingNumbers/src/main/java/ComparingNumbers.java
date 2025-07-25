
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fst = Integer.valueOf(scanner.nextLine());
        int snd = Integer.valueOf(scanner.nextLine());
        if (fst>snd){
            System.out.println(fst + " is greater than " + snd);
        }else if(fst<snd){
            System.out.println(fst + " is smaller than " + snd);
        }else {
            System.out.println(fst + " is equal to " + snd);
        }

    }
}
