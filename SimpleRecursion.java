import java.util.Scanner;
public class SimpleRecursion {

        public static void takeInput() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter age:");
            // Reading an integer input from the user
            int a = scanner.nextInt();
            // You can add further logic that might throw an exception here
        } catch (Exception g) {
            // Handling the exception if input is not valid
            System.out.println(".....ERROR..... Invalid input. Please enter a valid integer.");
        } finally {
            // This will always be executed whether or not an exception occurs
            System.out.println("Hello Dear");
        }
    }
    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);  // Recursive call
            System.out.println(n); // Print the number
        }
    }

    public static void main(String[] args) {
        // printNumbers(5);  // Prints numbers from 1 to 5
        SimpleRecursion.takeInput();
    }
}
