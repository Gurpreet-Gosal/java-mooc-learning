
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Title: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pg = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int yr = Integer.valueOf(scanner.nextLine());
            Book newBook = new Book(name, pg, yr);
            books.add(newBook);
        }
        System.out.println("What information will be printed? ");
        String info = scanner.nextLine();
        for (Book book : books) {
            if (info.equals("everything")) {
                System.out.println(book.toString());
            } else if (info.equalsIgnoreCase("name")) {
                System.out.println(book.getTitle());
            }
        }

    }
}
