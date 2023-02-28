
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int sum = 0, count = 0, nameLength = 0, temp = 0;
        double average = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            for (int i = 0; i < parts.length; i++) {
                sum = sum + Integer.valueOf(parts[1]);
                count++;
                nameLength = parts[0].length();
                if (temp < nameLength) {
                    temp = nameLength;
                    name = parts[0];
                }
            }
        }
            average = (sum * 1.0) / count;
            System.out.println("Longest name: " + name);
            System.out.println("Average of the birth years: " + average);
        
    }
}
