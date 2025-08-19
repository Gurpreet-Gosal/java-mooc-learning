
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("");
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        try ( Scanner readFile = new Scanner(Paths.get(file))) {
            int count = 0;
            // we read all the lines of the file
            while (readFile.hasNextLine()) {
                list.add(Integer.valueOf(readFile.nextLine()));
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) >= lowerBound && list.get(i) <= upperBound) {
                    System.out.println(list.get(i));
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }

}
