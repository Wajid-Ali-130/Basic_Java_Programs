import java.util.Scanner;

class Doctor{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter Your Age Here :");
		int age = obj.nextInt();

		if (age >= 1 && age <= 12) {
			System.out.println("You Are Child, \nTake Lolypop.");
		}
		if (age >= 13 && age <= 35) {
			System.out.println("You Are Young, \nEat Chicken & Beef.");
		}
		if (age >= 36) {
			System.out.println("Sorry! You Lose Your Teeth Eat Jelly Now.");
		}
		
	}
}