
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int pts = Integer.valueOf(scan.nextLine());
        if(pts<0){
            System.out.println("impossible!");
        }else if(pts>=0&&pts<=49){
            System.out.println("failed");
        }else if (pts>=50&&pts<=59){
            System.out.println("1");
        }else if (pts>=60&&pts<=69){
            System.out.println("2");
        }else if (pts>=70&&pts<=79){
            System.out.println("3");
        }else if (pts>=80&&pts<=89){
            System.out.println("4");
        }else if (pts>=90&&pts<=100){
            System.out.println("5");
        }else if (pts>100){
            System.out.println("incredible!");
        }

    }
}
