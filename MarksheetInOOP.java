import java.util.Scanner;

class MarksheetInOOP{

	int java;
	int dbs;
	int python;
	int cpp;
	int ds;

	float percentage;
	
	void setMarks(int a, int b, int c, int d, int e){
		java = a;
		dbs = b;
		python = c;
		cpp = d;
		ds = e;
	}
	void obtainedMarks(){
		System.out.println("Java :"+java);
		System.out.println("Database :"+dbs);
		System.out.println("Width :"+python);
		System.out.println("C++ :"+cpp);
		System.out.println("Data Science :"+ds);
	}
	void showPercentage(){
        int obtainedMarks = (java+dbs+python+cpp+ds);
        System.out.println("Total Marks = 500");
        if (obtainedMarks<=500) {
            System.out.println("Obtained Marks :"+obtainedMarks);
	    }
	    else{
	    	System.out.println(obtainedMarks+" Is Incorrect Input");
	    }
		
		percentage = (obtainedMarks*100)/500;
		System.out.println("Total Percentage Is :"+ percentage);
	}
	void grade(){
	    if (percentage>=80 && percentage<90) {
	    	System.out.println("Your Grade Is A");
	    }
	    else if(percentage>= 70 && percentage<80) {
	    	System.out.println("Your Grade Is B");
	    }
	    else if(percentage>=60 && percentage<70){
	    	System.out.println("Your Grade Is C");
	    }
	    else if(percentage>=50 && percentage<60){
	    	System.out.println("Your Grade Is D");
	    }else {
	    	System.out.println("Your Grade Is F");
	    	System.out.println("You Are Fail\nBetter Luck Next Time");
	    }

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int java;
		int dbs;
		int python;
		int cpp;
		int ds;

		System.out.println("Enter Java Marks :");
		java = sc.nextInt();
		System.out.println("Enter Data Base Marks :");
		dbs = sc.nextInt();
		System.out.println("Enter Python Marks :");
		python = sc.nextInt();
		System.out.println("Enter C++ Marks :");
		cpp = sc.nextInt();
		System.out.println("Enter Data Science Marks :");
		ds = sc.nextInt();

		if (java>100 || dbs>100 || python>100 || cpp>100 || ds>100) {
			System.out.println("Invalid Input");
		}
		else{

		MarksheetInOOP marksheet = new MarksheetInOOP();

		marksheet.setMarks(java, dbs, python, cpp, ds);

		marksheet.obtainedMarks();
		marksheet.showPercentage();
		marksheet.grade();
	    }
	}
}
