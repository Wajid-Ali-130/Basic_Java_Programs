class Box{
	int feet;       //Instance Variable
	int inch;       //Instance Variable
}
class TestObject{
	public static void main(String[] args) {
		
		// Creating Objects Of A Class
		Box obj1 = new Box();
		Box obj2 = new Box();
		Box obj3 = new Box();

		obj1.feet = 10;
		obj1.inch = 5;

		obj2.feet = 100;
		obj2.inch = 50;

		obj3.feet = 1000;
		obj3.inch = 500;

		System.out.println(obj1.feet+obj2.feet+obj3.feet);
		System.out.println(obj1.inch+obj2.inch+obj3.inch);
	}
}