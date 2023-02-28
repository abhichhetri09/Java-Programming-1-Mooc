
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of gift?");
        int value = Integer.valueOf(scan.nextLine());
        int taxLowerLimit = 0;
        double taxRate;
        double taxAmount;
        if (value >= 5000 && value <= 25000) {
            taxLowerLimit = 100;
            taxRate = 0.08;
            taxAmount = (taxLowerLimit + (value - 5000) * taxRate);
            System.out.println("Tax:" + taxAmount);
        } else if (value > 25000 && value <= 55000) {
            taxLowerLimit = 1700;
            taxRate = 0.1;
            taxAmount = (taxLowerLimit + (value - 25000) * taxRate);
            System.out.println("Tax:" + taxAmount);
        } else if (value > 55000 && value <= 200000) {
            taxLowerLimit = 4700;
            taxRate = 0.12;
            taxAmount = (taxLowerLimit + (value - 55000) * taxRate);
            System.out.println("Tax:" + taxAmount);

        } else if (value > 200000 && value <= 1000000) {
            taxLowerLimit = 22100;
            taxRate = 0.15;
            taxAmount = (taxLowerLimit + (value - 200000) * taxRate);
            System.out.println("Tax:" + taxAmount);
        } else if (value > 1000000) {
            taxLowerLimit = 142100;
            taxRate = 0.17;
            taxAmount = (taxLowerLimit + (value - 1000000) * taxRate);
            System.out.println("Tax:" + taxAmount);
        } else {
            System.out.println("No tax!");
        }
    }
}
