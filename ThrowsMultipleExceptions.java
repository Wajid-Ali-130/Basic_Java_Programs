import java.io.*;
class ThrowsMultipleExceptions{
	int div(int a, int b)throws ArithmeticException, IOException{
		return a/b;
	}
	public static void main(String[] args) {
		ThrowsMultipleExceptions obj = new ThrowsMultipleExceptions();
		try{
			int result = obj.div(10,2);
			System.out.println("Result :"+result);

			result = obj.div(10,0);
			System.out.println("Result :"+result);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}