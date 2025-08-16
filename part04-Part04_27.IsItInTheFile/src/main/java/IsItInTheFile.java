
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        System.out.println("");

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        try ( Scanner readFile = new Scanner(Paths.get(file))) {

            // we read all the lines of the file
            while (readFile.hasNextLine()) {
                list.add(readFile.nextLine());
            }
            if (list.contains(searchedFor)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
