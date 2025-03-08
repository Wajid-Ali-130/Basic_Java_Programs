class Box{
	int feet;
	int inch;

	Box(){

	}

	Box(int a, int b){
		feet = a;
		inch = b;
	}
	void show(){
		System.out.println("Feet ="+feet);
		System.out.println("Inch ="+inch);
	}
}

class Display{
	Box add(Box obj1, Box obj2){

		Box boxobj = new Box();

		boxobj.feet = obj1.feet + obj2.feet;
		boxobj.inch = obj1.inch + obj2.inch;

		return boxobj;
	}
}

class MethodReturnObject{
	public static void main(String[] args) {
		Box boxobj1 = new Box(10,5);
		Box boxobj2 = new Box(100,50);

		Display d = new Display();

		Box boxobj3 = d.add(boxobj1,boxobj2);
		Box boxobj4 = d.add(boxobj1,boxobj1);
		Box boxobj5 = d.add(boxobj2,boxobj2);

		boxobj3.show();
		boxobj4.show();
		boxobj5.show();
	}
}