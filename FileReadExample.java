// import java.util.Scanner;
import java.io.*;

class FileReadExample{
	public static void main(String[] arg) {
		// Scanner scobj = new Scanner(System.in);

		try{
			BufferedReader reader = new BufferedReader (new FileReader("nonexistent.txt"));
			String line = reader.readLine();
		    System.out.println("Read From File :"+line);
		    reader.close();
		}catch(FileNotFoundException e){
			System.out.println("File Not Found :"+e.getMessage());
		}catch(IOException e){
			System.out.println("Error reading the file :"+e.getMessage());
		}catch(Exception e){
			System.out.println("General Error :"+e);
			System.out.println("An unexpected error occured :"+e.getMessage());
		}
		System.out.println(".....Program Continues.....");
		System.out.println(".....Good Bye.....");
	}
}