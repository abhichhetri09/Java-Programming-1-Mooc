
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int sum = 0;
        int count = 0;
        int num1 = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            num1 += 1;
            if (num == 0 && num1 == 1) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (num > 0) {
                sum = num + sum;
                count++;
                average = sum / (count * 1.0);
                continue;
            } else if (num == 0) {
                break;
            }
        }
        if (average > 0.0) {
            System.out.println(average);
        }
    }
}
