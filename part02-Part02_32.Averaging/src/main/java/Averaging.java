
public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2 + number3 + number4;// write some code here
        return sum;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        double average = (number1 + number2 + number4 + number3) / 4.0;//write some code here
        return average;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
