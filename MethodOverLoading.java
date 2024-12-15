import java.util.Scanner;

class MethodOverLoading{
	
	void add(int a, int b){
	  System.out.println(a+b);
	}
	void add(int a, double b){
	  System.out.println(a+b);
	}
	void add(double a, int b){
	  System.out.println(a+b);
	}
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
        MethodOverLoading obj = new MethodOverLoading();
        
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        double b = sc.nextDouble();

        obj.add(a,a);
        obj.add(a,b);
        obj.add(b,a);
	}
}