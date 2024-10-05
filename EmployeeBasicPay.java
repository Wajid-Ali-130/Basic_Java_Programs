import java.util.Scanner;

class EmployeeBasicPay{
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);

		System.out.println("Enter Basic Pay :");
		int basicpay = obj.nextInt();

		int houserent = basicpay *45/100;                                                                    
		int medicalallowance = basicpay*15/100;
		int bonus = basicpay*5/100;
		int grosspay = basicpay+houserent+medicalallowance+bonus;

		System.out.println("House Rent :"+houserent);
		System.out.println("Medical Allowance :"+medicalallowance); 
		System.out.println("Bonus :"+bonus);
        System.out.println("Gross Pay = "+grosspay); 

        int convenceallowance = basicpay*8/100;
		System.out.println("Convence Allowance = "+convenceallowance); 

		int zakwat = basicpay*2/100;
		System.out.println("Zakwat = "+zakwat); 
        
        int incometax = basicpay*5/100;
		System.out.println("Income Tax = "+incometax); 

		int netincome = grosspay-(convenceallowance+zakwat+incometax);
		System.out.println("Net Income = "+netincome);




	}
}