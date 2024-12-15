import java.util.Scanner;

class SwapingInTwoVariables{
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
        
      System.out.println("Enter First Number:");
    	int a = obj.nextInt();

      System.out.println("Enter Second Number:");
      int b = obj.nextInt();

      
      a = a+b;
      b = a-b;
      a = a-b;
      
      
      System.out.println("Value Of A Is "+a);
      System.out.println("Value Of B Is "+b); 



  }
}