import java.util.Scanner;

interface Discount{
	void calculateDiscount();
	void printDiscountDetails();
}
class RegularCustomer implements Discount{
	//5% discount
	int amount;
	public void calculateDiscount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Welcome Welcome");
        System.out.println("You Are Our Regular Customer");
        System.out.println("Enter Your Amount Here");
        amount = sc.nextInt();
	}
	public void printDiscountDetails(){
		int discount = (amount * 5) / 100;
		int total = amount - discount;
		System.out.println("Customer Type : Regular Customer");
		System.out.println("Total Discount : 5%"); 
		System.out.println("Entered Amount Is :"+amount); 
		System.out.println("Amount After Discount :"+total); 
		System.out.println("Thank You For Using Our Service"); 
		System.out.println(); 
	}

}
class VipCustomer implements Discount{
	//15% discount
	int amount;
	public void calculateDiscount(){
		Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Welcome Welcome");
        System.out.println("You Are Our VIP Customer");
        System.out.println("Enter Your Amount Here");
        amount = sc.nextInt();

	}
	public void printDiscountDetails(){
		int discount = (amount * 15) / 100;
		int total = amount - discount;
		System.out.println("Customer Type : Regular Customer");
		System.out.println("Total Discount : 15%"); 
		System.out.println("Entered Amount Is :"+amount); 
		System.out.println("Amount After Discount :"+total); 
		System.out.println("Thank You For Using Our Service"); 
		System.out.println(); 
		
	}
}
class SeasonalCustomer implements Discount{
	//20% discount
	int amount;
	public void calculateDiscount(){
		Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Welcome Welcome");
        System.out.println("You Are Our Seasonal Customer");
        System.out.println("Enter Your Amount Here");
        amount = sc.nextInt();


	}
	public void printDiscountDetails(){
		int discount = (amount * 20) / 100;
		int total = amount - discount;
		System.out.println("Customer Type : Regular Customer");
		System.out.println("Total Discount : 20%"); 
		System.out.println("Entered Amount Is :"+amount); 
		System.out.println("Amount After Discount :"+total); 
		System.out.println("Thank You For Using Our Service"); 
		System.out.println(); 
		
	}	
}

class CustomerDiscountSystem{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(".....What Type Of Our Customer You Are!.....");
		System.out.println("1.Regular Customer");
		System.out.println("2.VIP Customer");
		System.out.println("3.Seasonal Customer");
		System.out.println(".....Enter Your Selection Here.....");
		int selection = sc.nextInt();
		if (selection==1) {
			RegularCustomer regularCustomer = new RegularCustomer();
			regularCustomer.calculateDiscount();
			regularCustomer.printDiscountDetails();
		}else
		if (selection==2) {
			VipCustomer vipCustomer = new VipCustomer();
			vipCustomer.calculateDiscount();
			vipCustomer.printDiscountDetails();
		}else
		if (selection==3) {
			SeasonalCustomer seasonalCustomer = new SeasonalCustomer();
			seasonalCustomer.calculateDiscount();
			seasonalCustomer.printDiscountDetails();
		}else{
			System.out.println(".....INVALID INPUT.....");
			System.out.println("YOU HAVE ENTERED WRONG INPUT");
		}

	}
}