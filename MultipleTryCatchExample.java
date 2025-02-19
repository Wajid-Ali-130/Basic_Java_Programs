class MultipleTryCatchExample{
	public static void main(String[] args) {
		try{
			int numbers[] = {1,2,3};
			System.out.println(numbers[5]);   //this will cause an ArrayIndexOutOfBoundException
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Caught ArrayIndexOutOfBoundsException :"+e.getMessage());
		}

		try{
			int result = 10/0;
		}catch(ArithmeticException a){
			System.out.println("Caught ArithmeticException :"+a.getMessage());
		}

		try{
			String text = null;
			System.out.println(text.length());
		}catch(NullPointerException n){
			System.out.println("Caught NullPointerException :"+n.getMessage());
		}
		System.out.println("Program Continues.....");
	}
}