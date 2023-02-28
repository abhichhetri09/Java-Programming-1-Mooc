
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
       
        printSquare(4);
      
        printRectangle(5, 6);
   
        printTriangle(3);
      
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");// first part of the exercise
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.print("\n");// third part of the exercise
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            
            for (int j = size; j >= i; j--) {
                System.out.print("");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();  // fourth part of the exercise
        }
    }
}
