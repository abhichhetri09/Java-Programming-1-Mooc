
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        String[] strings;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            strings = input.split(" ");

            System.out.println(strings[strings.length -1]);

        }
    }
}
