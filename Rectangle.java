
class Rectangle{
	int waigth;
	int heigth;
	int width;
	void set(int a, int b, int c){
		waigth = a;
		heigth = b;
		width = c;
	}
	void show(){
		System.out.println("Waigth :"+waigth);
		System.out.println("Heigth :"+heigth);
		System.out.println("Width :"+width);
	}
	public static void main(String[] args) {
		
		// Creating Objects Of A Class
		Rectangle obj = new Rectangle();
	    obj.set(25,25,17);
	    obj.show();   
	}
}
