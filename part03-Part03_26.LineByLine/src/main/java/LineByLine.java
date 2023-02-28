
import java.util.ArrayList;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings;
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            strings = input.split(" ");
            for(String word : strings){
                System.out.println(word);
            }
        }

    }
}
