import java.util.Scanner;

// Custom Checked Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String m) {
        super(m);   //message
    }
}

// Using the Custom Exception
public class CustomCheckedException{
    public static void validate() 
      throws InvalidAgeException {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Your Age Here :");
        int age = obj.nextInt();
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            validate();
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
