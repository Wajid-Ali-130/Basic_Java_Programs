// import java.util.Scanner;
import java.io.*;

class IOExceptions{
	public static void main(String[] arg) {
		// Scanner scobj = new Scanner(System.in);
		DataInputStream in = new DataInputStream(System.in);
        
        try{
           System.out.println("Enter Your Name");
		   String name = in.readLine();
		   System.out.println("Your Name Is :"+name);	
        }catch(Exception e){
        	e.printStackTrace();
        }
		
	}
}