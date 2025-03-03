class CalcThrows{
	static int div(int a, int b)throws Exception{
		int c = a/b;
		return c;
	}
	static int div(int a, int b, int c)throws Exception{
		int d = div(a,b)/c;
		return d;
	}
	static int div(int a, int b, int c, int d)throws Exception{
		int e = div(a,b,c)/c;
		return e;
	}
	public static void main(String[] args) {
		try{
			int a = div(10,0,5,2);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Good Bye.....");
	}
}
