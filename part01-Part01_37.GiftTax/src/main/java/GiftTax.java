
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int gft = Integer.valueOf(scan.nextLine());
        if(gft<5000){
            System.out.println("No tax!");
        }else if (gft>=5000 && gft<25000){
            System.out.println("Tax: " + (100 + (gft-5000) * 0.08));
        }else if (gft>=25000 && gft<55000){
            System.out.println("Tax: " + (1700 + (gft-25000) * 0.10));
        }else if (gft>=55000 && gft<200000){
            System.out.println("Tax: " + (4700 + (gft-55000) * 0.12));
        }else if (gft>=200000 && gft<1000000){
            System.out.println("Tax: " + (22100 + (gft-200000) * 0.15));
        }else if (gft>=1000000){
            System.out.println("Tax: " + (142100 + (gft-1000000) * 0.17));
        }

    }
}
