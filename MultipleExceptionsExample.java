public class MultipleExceptionsExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            // This will cause ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);
            // This will cause ArithmeticException
            int result = 10 / 0;
        }  catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
            System.out.println(e);
        }  catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
            System.out.println(e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
