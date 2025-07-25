
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Shall we carry on?");
            String inpt = scanner.nextLine();
            //String inside equals is Case Sensitive
            if (inpt.equals("no") || inpt.equals("No") || inpt.equals("NO")){
                break;
            }
        }

    }
}
