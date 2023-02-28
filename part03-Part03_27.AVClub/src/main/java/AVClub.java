
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            strings = input.split(" ");
            for(int i = 0; i < strings.length;i++){
                if(strings[i].contains("av")){
                    System.out.println(strings[i]);
                }
            }
        }
    }
}