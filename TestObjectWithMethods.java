class Box{
	int feet;       //Instance Variable
	int inch;       //Instance Variable

	void set(int a, int b){
		feet = a;
		inch = b;
	}
	void show(){
		System.out.println("Feet : "+feet);
		System.out.println("Inch : "+inch);
	}
}
class TestObjectWithMethods{
	public static void main(String[] args) {
		
		// Creating Objects Of A Class
		Box obj1 = new Box();
		Box obj2 = new Box();

		obj1.set(10, 20);
		obj2.set(100, 200);

		obj1.show();
		obj2.show();

		
	}
}
