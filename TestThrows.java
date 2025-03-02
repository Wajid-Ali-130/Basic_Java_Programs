class TestThrows{
	private static void test()throws Exception{
		int a = 10;
		int b = 0;
		int c = a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		try{
			test();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Good Bye.....");
	}
}
