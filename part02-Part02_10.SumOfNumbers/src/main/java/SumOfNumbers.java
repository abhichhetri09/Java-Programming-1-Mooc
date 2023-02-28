
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            } else {
                sum = num + sum;
                continue;
            }
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
