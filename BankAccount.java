import java.util.Scanner;

class BankAccount{
	private static int balance;
	private static String accountHolderName;
	private static String gender;
	private static String pin;

	static void setBalance(int balance1){
		balance = balance1;
	}
	static void getBalance(){
		System.out.println("This Is Your Bank Balance :"+balance);
	}
	static void setAccountHolderName(String accountHolderName1){
		accountHolderName = accountHolderName1;
	}
	static void getAccountHolderName(){
		System.out.println("Account Holder Name Is :"+accountHolderName);
	}
	static void setGender(String gender1){
		gender = gender1;
	}
	static void getGender(){
		System.out.println("Your Gender Is :"+gender);
	}
	static void setPin(String pin1){
		pin = pin1;
	}
	static void getPin(){
		System.out.println("Your Accound Pin Code Is :"+pin);
	}
	public static void main(String[] args) {
		Scanner scobj = new Scanner(System.in);

		System.out.println("Enter Account Holder Name Here :");
		String accountHolderName = scobj.nextLine();
		System.out.println("Enter Your Balance You Want To Deposit/Withdraw :");
		int balance = scobj.nextInt();
		System.out.println("Enter Your Gender Here Like(Male/Female) :");
		String gender = scobj.next();
		System.out.println("Enter Your (Pin/Password) Here :");
		String pin = scobj.next();


		try{
			setAccountHolderName(accountHolderName);
			getAccountHolderName();

            setBalance(balance);
			getBalance();

			setGender(gender);
			getGender();

			setPin(pin);
			getPin();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}