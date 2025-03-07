import javax.swing.JOptionPane;

class OurThrowOurCatch{
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(420, 420);
		frame.setVisible(true);
		int balance = 5000;
		int withdraw = 6000;
		try{
			if (balance < withdraw) {
				throw new ArithmeticException("Insifficient Balance");
			}
		}catch(ArithmeticException e){
			System.out.println("Exception :"+e.getMessage());
		}
			balance = balance - withdraw;
			System.out.println("Your Transaction Successfully Completed");
			System.out.println("Program Continues.....");
	}
}
