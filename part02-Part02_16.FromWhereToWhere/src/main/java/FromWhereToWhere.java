
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int num = scanner.nextInt();
        System.out.println("Where from");
        int num1 = scanner.nextInt();
        for (int i = num1; i <= num; i++) {
            System.out.println(i);
        }
        if (num < num1) {
            System.out.println("");
        }

    }
}
