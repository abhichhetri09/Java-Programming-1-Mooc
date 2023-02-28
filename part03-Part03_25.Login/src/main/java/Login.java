
import java.util.Scanner;
import java.util.*;
public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String inputUsername = scanner.nextLine();
        
        System.out.println("Enter password: ");
        String inputPassword = scanner.nextLine();
        
        if(inputUsername.equals("alex") && inputPassword.equals("sunshine")){
                System.out.println("You have successfully logged in!");
            }
        else if((inputUsername.equals("emma")) && inputPassword.equals("haskell")){
               System.out.println("You have successfully logged in!"); 
            }
        else{
            System.out.println("Incorrect username or password!");
        }
    }
}
