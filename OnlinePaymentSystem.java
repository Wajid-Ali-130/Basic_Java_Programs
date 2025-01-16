import java.util.Scanner;

interface Payment{
	void paymentProcessing();
	void getPaymentDetails();
}

class CreditCardPayment implements Payment{
	double amount;
	String creditCardNumber;
	@Override
	public void paymentProcessing(){
	Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Amount Here");
		 amount = sc.nextDouble();

		 sc.nextLine();

		System.out.println("Enter Your Credit Card Number Here");
        creditCardNumber = sc.nextLine();   
	}

	@Override
	public void getPaymentDetails(){
		System.out.println("Your Amount Is"+amount);
		System.out.println("Your Credit Card Number Is"+creditCardNumber);
	}
}
class PaypalPayment implements Payment{
	double amount;
	String email;
	@Override
	public void paymentProcessing(){
	Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Amount Here");
		 amount = sc.nextDouble();

		 // sc.nextLine();

		System.out.println("Enter Your Email Here");
        email =sc.nextLine();
	}

	@Override
	public void getPaymentDetails(){
		System.out.println("Your Amount Is"+amount);
		System.out.println("Your Credit Card Number Is"+email);
	}
}
class BitcoinPayment implements Payment{
	double amount;
	String walletaddress;
	@Override
	public void paymentProcessing(){
	Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Amount Here\nHow many coins you want to deposit/withdraw");
		 amount = sc.nextDouble();

		 // sc.nextLine();

		System.out.println("Enter Your Wallet Address Here");
        walletaddress =sc.nextLine();
	}

	@Override
	public void getPaymentDetails(){
		System.out.println("Your Amount Is"+amount);
		System.out.println("Your Credit Card Number Is"+walletaddress);
	}
}

class OnlinePaymentSystem{
	public static void main(String[] args) {
		Scanner scobj = new Scanner(System.in);
		CreditCardPayment creditcardpayment = new CreditCardPayment();
		PaypalPayment paypalpayment = new PaypalPayment();
		BitcoinPayment bitcoinpayment = new BitcoinPayment();
        
        System.out.println("How would you like to pay");
		System.out.println("We Offer Payments Methods");
		System.out.println("1.Credit Card");
		System.out.println("2.PayPal");
		System.out.println("3.Bitcoin");

		System.out.println("You can choose your option here");
		int option = scobj.nextInt();
		if (option==1) {
			creditcardpayment.paymentProcessing();
     		creditcardpayment.getPaymentDetails();
		}else
		if (option==2) {
			paypalpayment.paymentProcessing();
			paypalpayment.getPaymentDetails();	
		}else
		if (option==3) {
			bitcoinpayment.paymentProcessing();
		    bitcoinpayment.getPaymentDetails();
		}else{
			System.out.println(".....INVALID INPUT.....");
		}

		
		
	}
}