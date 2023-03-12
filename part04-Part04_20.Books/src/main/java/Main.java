
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year; ");
            int year = Integer.valueOf(scanner.nextLine());
            
            book.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed?");
        String input = scanner.nextLine();
        for(int i = 0; i < book.size();i++){
           
        if(input.contains("everything")){
            System.out.println(book.get(i));
        }
        else if(input.contains("name")){
            System.out.println(book.get(i).getTitle());
        }
        }
    }
}
