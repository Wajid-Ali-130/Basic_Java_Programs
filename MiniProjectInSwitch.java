import java.util.Scanner;

class MiniProjectInSwitch{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		System.out.println("1.Calculator");
		System.out.println("2.Seasons");
		System.out.println("3.Alphabetic Play Land");
		System.out.println("4.Unit Converter");
		System.out.println("5.Marksheet");
		System.out.println("6.ATM");
		System.out.println("7.Trolly Load (Transport)");
		System.out.println("8.Employee Salary Calculator");
	

		System.out.println("\nEnter Your Selection Here");
		int selection = obj.nextInt();
		
		switch(selection){
		case 1: System.out.println("...Welcome To Calculator... ");
                System.out.println("+.Addition ");
                System.out.println("*.Multiplication ");
                System.out.println("-.Subtraction ");
                System.out.println("/.Division ");
                System.out.println("%.Reminder ");
                System.out.println("\nEnter Operator Here");
                String op = obj.next();
                

                System.out.println("Enter Two Values ");
                int num1 = obj.nextInt();
                int num2 = obj.nextInt();
                
                switch(op){
                case "+":System.out.println("Addition Is:"+(num1+num2));
                	break;
                case "*":System.out.println("Multiplication Is:"+(num1*num2));
                	break;
                case "-":System.out.println("Subtraction Is:"+(num1-num2));
                	break;
                case "/":System.out.println("Division Is:"+(num1/num2));
                	break;
                case "%":System.out.println("Reminder Is:"+(num1%num2));
                	break;
                	default:System.out.println("Invalid Operator");	
                }

			break;

		case 2: System.out.println("Enter Month No:");
		        int month = obj.nextInt();
		
		    switch(month){
		        case 11: System.out.println("Season Is Winter ");
			        break;
		        case 12: System.out.println("Season Is Winter ");
			        break;
		        case 1: System.out.println("Season Is Winter ");
			        break;
		        case 2: System.out.println("Season Is Spring ");
			        break;
		        case 3: System.out.println("Season Is Spring ");
			        break;
		        case 4: System.out.println("Season Is Spring ");
			        break;

		        case 5: System.out.println("Season Is Summer ");
			        break;
		        case 6: System.out.println("Season Is Summer ");
			        break;
		        case 7: System.out.println("Season Is Summer ");
			        break;
		        case 8: System.out.println("Season Is Automn ");
			        break;
		        case 9: System.out.println("Season Is Automn ");
			        break;
		        case 10: System.out.println("Season Is Automn ");
			        break;
		            default : System.out.println("Invalid Operator ");
		    }        	
			break;

		case 3: System.out.println("Enter Any Alphabetic Letter ");
		        char letter = obj.next().charAt(0);

		        switch(letter){
		        case 'A': System.out.println("A For Apple ");
			       break;
		        case 'B': System.out.println("B For Ball ");
			       break;
		        case 'C': System.out.println("C For Cat ");
			        break;
		        case 'D': System.out.println("D For Duck ");
			        break;
		        case 'E': System.out.println("E For Elephant ");
			        break;
		        case 'F': System.out.println("F For Flag ");
			        break;
		        case 'G': System.out.println("G For Girl ");
			        break;
		        case 'H': System.out.println("H For Hen ");
			        break;
		        case 'I': System.out.println("I For Idea ");
			        break;
		        case 'J': System.out.println("J For Jug ");
			        break;
		        case 'K': System.out.println("K For Kite ");
			        break;
		        case 'L': System.out.println("L For Lemon ");
			        break;
		        case 'M': System.out.println("M For Mango ");
			        break;
		        case 'N': System.out.println("N For Nose ");
			        break;
		        case 'O': System.out.println("O For Orange ");
			        break;
		        case 'P': System.out.println("P For Peacock ");
			        break;
		        case 'Q': System.out.println("Q For Queen ");
			        break;
		        case 'R': System.out.println("R For Rose ");
			        break;
		        case 'S': System.out.println("S For Seasaw ");
			        break;
		        case 'T': System.out.println("T For Triangle ");
			        break;
		        case 'U': System.out.println("U For Umbralla ");
			        break;
		        case 'V': System.out.println("V For Van ");
			        break;
		        case 'W': System.out.println("W For Watch ");
			        break;
		        case 'X': System.out.println("X For X-Ray ");
			        break;
		        case 'Y': System.out.println("Y For Yalk ");
			        break;
		        case 'Z': System.out.println("Z For Zoo ");
			        break;
		        default : System.out.println("Invalid Operator ");
		            break;               

		 //Lower Case Alphabetic Letters//
			
	        	case 'a': System.out.println("A For Apple ");
	        		break;
        		case 'b': System.out.println("B For Ball ");
		        	break;
	        	case 'c': System.out.println("C For Cat ");
			        break;
	        	case 'd': System.out.println("D For Duck ");
		        	break;
	        	case 'e': System.out.println("E For Elephant ");
			        break;
         		case 'f': System.out.println("F For Flag ");
		        	break;
         		case 'g': System.out.println("G For Girl ");
		        	break;
        		case 'h': System.out.println("H For Hen ");
		        	break;
        		case 'i': System.out.println("I For Idea ");
		        	break;
	        	case 'j': System.out.println("J For Jug ");
		        	break;
	        	case 'k': System.out.println("K For Kite ");
		        	break;
	        	case 'l': System.out.println("L For Lemon ");
		        	break;
		        case 'm': System.out.println("M For Mango ");
			        break;
		        case 'n': System.out.println("N For Nose ");
			        break;
		        case 'o': System.out.println("O For Orange ");
			        break;
		        case 'p': System.out.println("P For Peacock ");
			        break;
		        case 'q': System.out.println("Q For Queen ");
			        break;
	        	case 'r': System.out.println("R For Rose ");
			        break;
		        case 's': System.out.println("S For Seasaw ");
			        break;
		        case 't': System.out.println("T For Triangle ");
		        	break;
		        case 'u': System.out.println("U For Umbralla ");
			        break;
		        case 'v': System.out.println("V For Van ");
			        break;
		        case 'w': System.out.println("W For Watch ");
			        break;
		        case 'x': System.out.println("X For X-Ray ");
		        	break;
        		case 'y': System.out.println("Y For Yalk ");
			        break;
		        case 'z': System.out.println("Z For Zoo ");
			        break;	
		        }
			break;
		case 4:System.out.println("Enter Number In Meters :");
		int kilometer =obj.nextInt();
		int meter = kilometer * 1000;

		System.out.println("Kilometer = "+kilometer+"\n"+"Meter = "+meter);
			break;
		case 5: int java;
	        int php;
	        int cpp;
	        int vb;
	        int oracle;

		System.out.print("Enter Java Marks :");
		java=obj.nextInt();


		System.out.print("Enter PHP Marks :");
		php=obj.nextInt();


		System.out.print("Enter CPP Marks :");
		cpp=obj.nextInt();


		System.out.print("Enter VB Marks :");
		vb=obj.nextInt();         


		System.out.print("Enter Oracle Marks :");
		oracle=obj.nextInt();

		System.out.println("Java="+java);
		System.out.println("PHP="+php);
		System.out.println("CPP="+cpp);
		System.out.println("VB="+vb);
		System.out.println("Oracle="+oracle);


		System.out.println("Total Marks = 500");
		int obtainedMarks=(java+php+cpp+vb+oracle);
		System.out.println("Obtained Marks :"+obtainedMarks);

		float percentage = (obtainedMarks*100)/500;
		System.out.println("Total Percentage Is :"+ percentage);

			break;
		case 6: System.out.println("Enter Rupees :");
		int rupees = obj.nextInt();

		int fivethousand = rupees/5000;
		int remFiveThousand=rupees%5000;

		int thousand = remFiveThousand/1000;
		int remthousand = remFiveThousand%1000;

		int fivehundred = remthousand/500;
		int remfivehundred = remthousand%500;

		int hundred = remfivehundred/100;
		int remhundred = remfivehundred%100;

		int fifty = remhundred/50;
		int remfifty = remhundred%50;

		int twenty = remfifty/20;
		int remtwenty = remfifty%20;

		int ten = remtwenty/10;
		int remten = remtwenty%10;

		int five = remten/5;
		int remfive = remten%5;

		int two = remfive/2;
		int remtwo = remfive%2;

		int one = remtwo/1;

		System.out.println("Five Thousand ="+fivethousand);
		System.out.println("Thousand ="+thousand);
		System.out.println("Five Hundred ="+fivehundred);
		System.out.println("Hundred ="+hundred);
		System.out.println("Fifty ="+fifty);
		System.out.println("Twenty ="+twenty);
		System.out.println("Ten ="+ten);
		System.out.println("Five ="+five);
		System.out.println("Two ="+two);
		System.out.println("One ="+one);

			break;

		case 7: System.out.println("Enter TrollyLoad :");
		int load = obj.nextInt();

		int trollyload = load * 800;
		int driver = load*150;
		int tax = load * 80;
		int diesel = load*210;
		int profit = trollyload - (driver+tax+diesel);

		System.out.println("Total TrollyLoad ="+trollyload);
		System.out.println("Driver ="+driver);
		System.out.println("Tool Tax ="+tax);
		System.out.println("Diesel ="+diesel);
		System.out.println("Total Profit ="+profit);

			break;
		case 8: System.out.println("Enter Basic Pay :");
		int basicpay = obj.nextInt();

		int houserent = basicpay *45/100;                                                                    
		int medicalallowance = basicpay*15/100;
		int bonus = basicpay*5/100;
		int grosspay = basicpay+houserent+medicalallowance+bonus;

		System.out.println("House Rent :"+houserent);
		System.out.println("Medical Allowance :"+medicalallowance); 
		System.out.println("Bonus :"+bonus);
        System.out.println("Gross Pay = "+grosspay); 

        int convenceallowance = basicpay*8/100;
		System.out.println("Convence Allowance = "+convenceallowance); 

		int zakwat = basicpay*2/100;
		System.out.println("Zakwat = "+zakwat); 
        
        int incometax = basicpay*5/100;
		System.out.println("Income Tax = "+incometax); 

		int netincome = grosspay-(convenceallowance+zakwat+incometax);
		System.out.println("Net Income = "+netincome);

			break;
		default: System.out.println(".....Invalid Selection.....");
		
		}
	}
}