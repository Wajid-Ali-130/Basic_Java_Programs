class Box{
	int feet;
	int inch;
	Box(){
		//Constructor Without Parametres
	}
	Box(int a, int b){
		feet = a;
		inch = b;
	}

	Box add(Box ob){
		Box boxobj = new Box();
		boxobj.feet = feet + ob.feet;
		boxobj.inch = inch + ob.inch;

		return boxobj;
	}

	Box add(Box obj1, Box obj2){
		Box ob = new Box();
		ob.feet = feet + obj1.feet + obj2.feet;
		ob.inch = inch + obj1.inch + obj2.inch;
		return ob;
	}

	void show(){
		System.out.println("Feet :"+feet);
		System.out.println("Inch :"+inch);
	}
}

class OverloadingInMethodReturn{
	public static void main(String[] args) {
		Box obj1 = new Box(10,5);
		Box obj2 = new Box(100,50);
		Box obj3 = new Box(1000,500);

		Box obj4 = obj1.add(obj2);

		Box obj5 = obj1.add(obj1, obj2);

		Box obj6 = obj1.add(obj3, obj1);

		obj4.show();
		obj5.show();
		obj6.show();
	}
	
}