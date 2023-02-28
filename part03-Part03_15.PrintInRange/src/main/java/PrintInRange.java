
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        ArrayList<Integer> numbers = new ArrayList<>();
         while (true) {
            String input = String.valueOf(scanner.nextLine());
            int number = Integer.valueOf(input);
            if(input == " "){
                break;
            }
            numbers.add(number);
        }
        // Try your method here
        
        printNumbersInRange(numbers, 3, 10);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (Integer value : numbers) {
            if (value >= lowerLimit && value <= upperLimit) {
                System.out.println(value);
            }
        }
    }
}