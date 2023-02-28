
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        int sum = 0;
        int zero = 0;
        double average = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            } else {
                sum = num + sum;
                zero = zero + 1;
                average = sum / (zero * 1.0);
                continue;
            }

        }

        System.out.println("Average of the numbers: " + average);
    }
}
