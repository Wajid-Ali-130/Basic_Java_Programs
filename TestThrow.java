class TestThrow{
	public static void main(String[] args) {
		try{
			int c = Calc.div(10, 2);
			System.out.println("Result :"+c);

			c = Calc.div(5, -2);
			System.out.println("Division :"+c);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
}
class Calc{
	static int div(int a, int b){
		if(a<0 || b<0){
			ArithmeticException e = new ArithmeticException("Negative Value Not Allowed!");
			throw e;
		}
		int c = a/b;
		return c;
	}
}