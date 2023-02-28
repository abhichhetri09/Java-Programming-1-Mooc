
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        int zero = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            } else {
                zero = zero + 1;
                continue;
            }
        }
        System.out.println("Number of numbers: " + zero);
    }
}
