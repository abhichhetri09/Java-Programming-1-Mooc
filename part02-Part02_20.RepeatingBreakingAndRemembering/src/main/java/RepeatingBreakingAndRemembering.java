
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int numbers = 0;
        double average = 0;
        String print = "";
        int odd = 0;
        int even = 0;
        while (true) {

            int num = scanner.nextInt();
            if (num == -1) {
                print = "Thx! Bye!";
                break;
            } else {
                sum = num + sum;
                numbers++;
                average = sum / (numbers * 1.0);
                if (num % 2 != 0) {
                    odd++;
                } else {
                    even++;
                }
            }
        }
        System.out.println(print);
        System.out.println("Sum " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
