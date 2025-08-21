
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int count = 0;
        int wins = 0;
        int loses = 0;
        try ( Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                String[] parts = line.split(",");
                String name1 = parts[0];
                String name2 = parts[1];
                int pts1 = Integer.valueOf(parts[2]);
                int pts2 = Integer.valueOf(parts[3]);
                if (name1.equals(team) || name2.equals(team)) {
                    count++;
                }
                if (name1.equals(team)) {
                    if (pts1 > pts2) {
                        wins++;
                    } else {
                        loses++;
                    }
                }
                if (name2.equals(team)) {
                    if (pts2 > pts1) {
                        wins++;
                    } else {
                        loses++;
                    }
                }
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + loses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
