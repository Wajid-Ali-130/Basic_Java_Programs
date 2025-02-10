// import java.util.Scanner;

class TestExceptions{
	public static void main(String[] arg) {
		// Scanner scobj = new Scanner(System.in);

		try{
			String s1 = arg[0];
		    String s2 = arg[1];

		    int a = Integer.parseInt(s1);
		    int b = Integer.parseInt(s2);

		    int result = a/b;
		    System.out.println("Division :"+result);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please Pass Two CMD Line Argument");
		}catch(NumberFormatException e){
			System.out.println("Please Pass Two Integers");
		}catch(ArithmeticException e){
			System.out.println("2nd arg must not be zero :"+e);
		}catch(Exception e){
			System.out.println("General Error :"+e);
		}

		System.out.println(".....Good Bye.....");
	}
}