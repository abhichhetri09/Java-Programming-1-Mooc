
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        int sum = 0;
        int zero = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            } else {
                sum = num + sum;
                zero = zero + 1;
                continue;
            }
        }
        System.out.println("Number of numbers: " + zero);
        System.out.println("Sum of the numbers: " + sum);
    }
}
