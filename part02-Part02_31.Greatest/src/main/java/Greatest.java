
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int greatest = 0;
        if (number1 > number2 && number1 > number3) {
            greatest = number1;
        } else if (number2 > number1 && number2 > number3) {
            greatest = number2;
        } else if (number3 > number1 && number3 > number2) {
            greatest = number3;
        } else if (number1 == number2 && number2 == number3) {
            greatest = number1;
        }
        return greatest;
        //write some code here
    }

    public static void main(String[] args) {
        int result = greatest(8, 8, 8);
        System.out.println("Greatest: " + result);
    }
}
