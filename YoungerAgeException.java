import java.util.Scanner;

class YoungerAgeException extends RuntimeException{
	YoungerAgeException(String message){
		super(message);
	}

	public static void main(String[] args) {
		try{
			int age = 16;
			if (age < 15) {
				throw new YoungerAgeException("You Are Not Eligible To Vote");
			}else{
				System.out.println("Vote Success");
			}
		}catch(YoungerAgeException e){
			e.printStackTrace();
		}
		System.out.println("Program Continues.....");
	}
}
