
import java.util.ArrayList;
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();
       // Try your method here
       
      /* while (true) {
            String input = String.valueOf(scanner.nextLine());
            int number = Integer.valueOf(input);
            if(input == " "){
                break;
            }
            numbers.add(number);
        }*/
       numbers.add(3);
numbers.add(2);
numbers.add(6);
numbers.add(-1);
System.out.println(sum(numbers));

    }
    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            sum = sum + numbers.get(i);
        }
        return sum;
    }
}
