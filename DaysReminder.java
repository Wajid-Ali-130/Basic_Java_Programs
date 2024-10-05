import java.util.Scanner;

class DaysReminder{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter Days :");
		int days =obj.nextInt();
		int month = days / 30;
		int week = (days % 30)/7;
		int reminderdays = (days / 7) %7;

		System.out.println("Days = "+days+"\n"+"Months = "+month+"\nWeek = "+week+"\n Reminding Days :"+reminderdays);
	}
}