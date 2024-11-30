import java.util.Scanner;

class MiniProjectInDoWhile{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
       
         int mainSelection;
		do{
			System.out.println("1.Calculator");
			System.out.println("2.Unit Converter");
			System.out.println("3.Counter Table Series");
			System.out.println("4.Prime Number Series");
			System.out.println("5.All Star Patterns");
			System.out.println("6.All Number Patterns");
			System.out.println("7.All ALphabetes ");

			System.out.println("8.Exit");
			System.out.println("\nEnter Your Selection Here :");
			 mainSelection = obj.nextInt();

			if (mainSelection==1) {
			    int calcMain;
			    do{
					System.out.println("...Welcome To Calculator... ");
				  	System.out.println("1.Calculator Menu ");
                    System.out.println("2.Operators ");
                    System.out.println("3.Back ");

                     calcMain = obj.nextInt();
                
                    switch(calcMain){
                  	case 1: System.out.println("...Welcome To Calculator... ");
                          System.out.println("1.Addition ");
                          System.out.println("2.Multiplication ");
                          System.out.println("3.Subtraction ");
                          System.out.println("4.Division ");
                          System.out.println("5.Reminder ");
                          System.out.println("\nEnter Your Selection Here");
                          int calcMenu = obj.nextInt();

                         System.out.println("Enter Two Values ");
                          int num1 = obj.nextInt();
                          int num2 = obj.nextInt();
                
                          switch(calcMenu){
                          case 1:System.out.println("Addition Is:"+(num1+num2));
                        	break;
                          case 2:System.out.println("Multiplication Is:"+(num1*num2));
                         	break;
                          case 3:System.out.println("Subtraction Is:"+(num1-num2));
                        	break;
                          case 4:System.out.println("Division Is:"+(num1/num2));
                        	break;
                          case 5:System.out.println("Reminder Is:"+(num1%num2));
                           	break;
                        	default:System.out.println("Invalid Operator");	
                    }

                    break;
                    case 2: System.out.println("...Welcome To Calculator... ");
                            System.out.println("+.Addition ");
                            System.out.println("*.Multiplication ");
                            System.out.println("-.Subtraction ");
                            System.out.println("/.Division ");
                            System.out.println("%.Reminder ");
                            System.out.println("\nEnter Operator Here");
                            String op = obj.next();

                            System.out.println("Enter Two Values ");
                            num1 = obj.nextInt();
                            num2 = obj.nextInt();
                
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
                    case 3:    int i=4;        
                    }
				}while(calcMain>=1 && calcMain<3);
				
			}


			if (mainSelection==2) {
				int selConverter;
				do{
					System.out.println(".....Welcome To Unit Converter Calculator.....");
					System.out.println("1.Feet To Inch");
                    System.out.println("2.Inch To Feet");
                    System.out.println("3.Kilo To Gram ");
                    System.out.println("4.Gram To Kilo ");
                    System.out.println("5.Back ");

                    System.out.println("Enter Selection Here ");
                    selConverter = obj.nextInt();

                    if (selConverter==1) {
                    	System.out.println("Enter Feet :");
		                   int feet =obj.nextInt();
                     	   int inch = feet * 12;

		                System.out.println("Feet = "+feet+"\n"+"Inch = "+inch);
                    }
                    if (selConverter==2) {
                    	System.out.println("Enter Inches :");
		                   int inches =obj.nextInt();
                     	   int feet = inches / 12;

                        System.out.println("Inches ="+inches+"\n"+"Feet = "+feet);
                    }
                    if (selConverter==3) {
                    	System.out.println("Enter Kilograms :");
                    	int kilo =obj.nextInt();
		                float gram = kilo * 1000;

		               System.out.println("Kilo = "+kilo+"\n"+"Grams = "+gram);
                    }
                    if (selConverter==4) {
                    	System.out.println("Enter Grams :");
                    	int grams =obj.nextInt();
		                float kilo = grams / 1000;
		               System.out.println("Grams = "+grams+"\n"+"Kilo = "+kilo);
                        
                    }
                    if (selConverter==5) {
                    	int a=6;
                    }

				}while(selConverter<5);
			}

			if (mainSelection==3) {
			   
                int counterTableSelection;
		        do{
	            	System.out.println(".....Welcome To Counter Table Series.....");

			        System.out.println("1.Counter Table Series:");
			        System.out.println("2.Exit:");

			         counterTableSelection=obj.nextInt();
                        
                    if (counterTableSelection==1) {
                       	System.out.println("Enter Table No:");
		                    int table = obj.nextInt();

		                System.out.println("Enter Counter No:");
		                    int counter = obj.nextInt();
		
		                for (int i=1;i<=table ;i++ ) {

		                System.out.println("Now Printing The Table Of :"+i);
			                for (int j=1;j<=counter;j++ ) {
			                    int result = i*j;
		                  	    System.out.println(i+" x "+j+" = "+result);
		                    }
		                System.out.println("\n");
		                }
                    }

                    if (counterTableSelection==2) {
                    	
                    }

		        }while(counterTableSelection==1);
		
			}

			if (mainSelection==4) {

	           	System.out.println(".....Welcome To Prime Number Series.....");
			    System.out.println("Enter Any Number");
		            int number = obj.nextInt();
				  	int num1=1;
		

		        while(num1<=number){                   
		            int prime=2;
			        int count=0;
               	
                    while(prime<=num1/2){        
           
                        if (num1%prime==0) {
            	            count++;
                            break;
                        }
            
                    prime++;
                    }
                    
                    if (count == 0) {
                       System.out.println(num1 + " is a prime number.");
                    }

           
		        num1++;
		        }
			}

			if (mainSelection==5) {
	            System.out.println(".....Welcome To Star Patterns Series.....");
                int starSelection;
                do{
                	System.out.println("1.Star Increment");
                	System.out.println("2.Star Decrement");
                	System.out.println("3.Star Square");
                	System.out.println("4.Star Diamond");
                	System.out.println("5.Star X Pattern");
                	System.out.println("6.Back");

                	starSelection = obj.nextInt();

                	if(starSelection==1){
                		System.out.println("Enter Any Number");
                		int num1= obj.nextInt();
                		for (int i=1;i<=num1 ;i++ ) {
                			for (int j=1;j<=i ;j++ ) {
                				System.out.print("*");
                			}
                			System.out.println();
                		}
                	}

                	if(starSelection==2){
                		System.out.println("Enter Any Number");
                		int num1= obj.nextInt();
                		for (int i=num1;i>=1 ;i-- ) {
                			for (int j=1;j<=i ;j++ ) {
                				System.out.print("*");
                			}
                			System.out.println();
                		}
                	}

                	if(starSelection==3){
                		System.out.println("Enter Any Number");
                		int num1= obj.nextInt();
                		for (int i=1;i<=num1 ;i++ ) {
                			for (int j=1;j<=num1 ;j++ ) {
                				System.out.print("*");
                			}
                			System.out.println();
                		}
                	}

                	if(starSelection==4){
                		System.out.println("Enter Value To Print Stars ");
    	                    int num1 = obj.nextInt();

                            for (int i=1;i<=num1;i++) {                              //  *
                                                                                    //  ***   
                                for (int j=num1;j>=i;j--) {                        //  *****
                                  System.out.print(" ");                          //  *******
                                }
                                for (int k=1;k<=i;k++) {
                                  System.out.print("*");
                                }
                                for (int l=2;l<=i;l++) {
                                  System.out.print("*");
                                }
                                System.out.println();
                            }


                            for(int i=num1; i>=1; i--){

                                for(int j=num1; j>=i; j--){
                                  System.out.print(" ");                             //  *******
                                }                                                    //   *****
                                for (int k=1;k<=i;k++) {                              //   ***
                                  System.out.print("*");                                //  *
                                }
                                for (int l=2;l<=i;l++) {
                                  System.out.print("*");
                                }
                                System.out.println();
                            }
                    }

                    if(starSelection==5){
                    	  System.out.println("Enter Value To Print Stars ");
    	                    int num1 = obj.nextInt();
      
                        for (int i=1;i<=num1 ;i++ ) {
         
                            for (int j=1;j<=i ;j++ ) {
                               System.out.print(" ");
                            }

                            for (int k=i;k<=i ;k++ ) {
                               System.out.print("*");
                            }

                            for (int l=num1;l>=i;l--) {                        //  *****
                               System.out.print(" ");                          //  *******
                            }
                            for (int l=num1;l>=i;l--) {                        //  *****
                               System.out.print(" ");                          //  *******
                            }
                            for (int m=i;m<=i;m++) {
                               System.out.print("*");
                            }

                            System.out.println();
                        }


                        for (int i=1;i<=num1 ;i++ ) {
         
                            for (int j=num1;j>=i ;j-- ) {
                               System.out.print(" ");
                            }

                            for (int k=i;k<=i ;k++ ) {
                               System.out.print("*");
                            }

                            for (int j=1;j<=i ;j++ ) {
                               System.out.print(" ");
                            }
                            for (int j=1;j<=i ;j++ ) {
                               System.out.print(" ");
                            }
 
                            for (int k=i;k<=i ;k++ ) {
                               System.out.print("*");
                            }
 
                            System.out.println();
                        }
                    }

                }while(starSelection<6);
				
			}

   
            if (mainSelection==6) {
	            System.out.println(".....Welcome To Number Patterns Series.....");
                int numberSelection;
                do{
                	System.out.println("1.Number Increment");
                	System.out.println("2.Number Decrement");
                	System.out.println("3.Number Square");
                	System.out.println("4.Number Diamond");
                	System.out.println("5.Number X Pattern");
                	System.out.println("6.Back");

                	numberSelection = obj.nextInt();


                	if(numberSelection==1){
                		System.out.println("Enter Any Number");
                		int number= obj.nextInt();
                		for (int i=1;i<=number ;i++ ) {
		                	                                                           // 1
		                	for (int j=1;j<=i ;j++ ) {                                 // 12
		                		System.out.print(j);                                   // 123.....To...Number
		                	}
		                	System.out.println();
		                }

                	}

                	if(numberSelection==2){
                		System.out.println("Enter Any Number");
                		int number= obj.nextInt();
                		for (int i=0;i<=number ;i++ ) {
			                                                                           // 12345
		                	for (int j=1;j<=number-i ;j++ ) {                          // 1234
				                System.out.print(j);                                   // 123...DECREMENT(OR)-I..To...1
			                }
			                System.out.println();
		                }
                	}

                	if(numberSelection==3){
                		System.out.println("Enter Any Number");
                		int num1= obj.nextInt();
                		for (int i=1;i<=num1 ;i++ ) {
                			for (int j=1;j<=num1 ;j++ ) {
                				System.out.print(j);
                			}
                			System.out.println();
                		}
                	}

                	if(numberSelection==4){
                		System.out.println("Enter Value To Print Stars ");
    	                    int num1 = obj.nextInt();

                            for (int i=1;i<=num1;i++) {                              //  *
                                                                                    //  ***   
                                for (int j=num1;j>=i;j--) {                        //  *****
                                  System.out.print(" ");                          //  *******
                                }
                                for (int k=1;k<=i;k++) {
                                  System.out.print(k);
                                }
                                for (int l=2;l<=i;l++) {
                                  System.out.print(l);
                                }
                                System.out.println();
                            }


                            for(int i=num1; i>=1; i--){

                                for(int j=num1; j>=i; j--){
                                  System.out.print(" ");                             //  *******
                                }                                                    //   *****
                                for (int k=1;k<=i;k++) {                              //   ***
                                  System.out.print(k);                                //    *
                                }
                                for (int l=2;l<=i;l++) {
                                  System.out.print(l);
                                }
                                System.out.println();
                            }
                    }

                    if(numberSelection==5){
                    	  System.out.println("Enter Value To Print Stars ");
    	                    int num1 = obj.nextInt();
      
                        for (int i=1;i<=num1 ;i++ ) {
         
                            for (int j=1;j<=i ;j++ ) {
                               System.out.print(" ");
                            }

                            for (int k=i;k<=i ;k++ ) {
                               System.out.print(k);
                            }

                            for (int l=num1;l>=i;l--) {                        //  *****
                               System.out.print(" ");                          //  *******
                            }
                            for (int l=num1;l>=i;l--) {                        //  *****
                               System.out.print(" ");                          //  *******
                            }
                            for (int m=i;m<=i;m++) {
                               System.out.print(m);
                            }

                            System.out.println();
                        }


                        for (int i=1;i<=num1 ;i++ ) {
         
                            for (int j=num1;j>=i ;j-- ) {
                               System.out.print(" ");
                            }

                            for (int k=i;k<=i ;k++ ) {
                               System.out.print(k);
                            }

                            for (int j=1;j<=i ;j++ ) {
                               System.out.print(" ");
                            }
                            for (int j=1;j<=i ;j++ ) {
                               System.out.print(" ");
                            }
 
                            for (int k=i;k<=i ;k++ ) {
                               System.out.print(k);
                            }
 
                            System.out.println();
                        }
                    }

                }while(numberSelection<6);
				
			}




			if (mainSelection==7) {
				int alphabeticSelection;
				do{
					System.out.println(".....Welcome To Alphabetic Play Land.....");
                    System.out.println("1.Alphabates ");
                    System.out.println("0.Exit");
                
                    alphabeticSelection = obj.nextInt();
                    if (alphabeticSelection==1) {
                         String operator;
                        // do{
                            // System.out.println("If Yoyu Want To Exit From This Program So Write (Cancel)");
                            System.out.println("Enter Any Letter :");
                              operator = obj.next();

                            if (operator.equals("A") || operator.equals("a")) {
                                System.out.println(operator+" For Apple");
                            }
                            if (operator.equals("B") || operator.equals("b")) {
                                System.out.println(operator+"For Bat");
                            }
                            if (operator.equals("C") || operator.equals("c")) {
                                System.out.println(operator+" For Cat");
                            }
                            if (operator.equals("D") || operator.equals("d")) {
                                System.out.println(operator+" For Dog");
                            }
                            if (operator.equals("E") || operator.equals("e")) {
                                System.out.println(operator+" For Elephant");
                            }
                            if (operator.equals("F") || operator.equals("f")) {
                                System.out.println(operator+" For Flag");
                            }
                            if (operator.equals("G") || operator.equals("g")) {
                                System.out.println(operator+" For Glass");
                            }
                            if (operator.equals("H") || operator.equals("h")) {
                                System.out.println(operator+" For Hen");
                            }
                            if (operator.equals("I") || operator.equals("i")) {
                                System.out.println(operator+" For Iron");
                            }
                            if (operator.equals("J") || operator.equals("j")) {
                                System.out.println(operator+" For Jug");
                            }
                            if (operator.equals("K") || operator.equals("k")) {
                                System.out.println(operator+" For Kilogram");
                            }
                            if (operator.equals("L") || operator.equals("l")) {
                                System.out.println(operator+" For Lemon");
                            }
                            if (operator.equals("M") || operator.equals("m")) {
                                System.out.println(operator+" For Mango");
                            }
                            if (operator.equals("N") || operator.equals("n")) {
                                System.out.println(operator+" For Nose");
                            }
                            if (operator.equals("O") || operator.equals("o")) {
                                System.out.println(operator+" For Orange");
                            }
                            if (operator.equals("P") || operator.equals("p")) {
                                System.out.println(operator+" For Peacock");
                            }
                            if (operator.equals("Q") || operator.equals("q")) {
                                System.out.println(operator+" For Queen");
                            }
                            if (operator.equals("R") || operator.equals("r")) {
                                System.out.println(operator+" For Rose");
                            }
                            if (operator.equals("S") || operator.equals("s")) {
                                System.out.println(operator+" For Snake");
                            }
                            if (operator.equals("T") || operator.equals("t")) {
                                System.out.println(operator+" For Telephone");
                            }
                            if (operator.equals("U") || operator.equals("u")) {
                                System.out.println(operator+" For Umbrella");
                            }
                            if (operator.equals("V") || operator.equals("v")) {
                                System.out.println(operator+" For Van");
                            }
                            if (operator.equals("W") || operator.equals("w")) {
                                System.out.println(operator+" For Walker");
                            }
                            if (operator.equals("X") || operator.equals("x")) {
                                System.out.println(operator+" For X-Ray");
                            }
                            if (operator.equals("Y") || operator.equals("y")) {
                                System.out.println(operator+" For Yalk");
                            }
                            if (operator.equals("Z") || operator.equals("z")) {
                                System.out.println(operator+" For Zoo");
                            }
                        // }while(operator.equals("Cencel"));
                    }
                    if (alphabeticSelection==0) {
                        System.out.println(".....Exiting!...Thank You.....");
                    }
				}while(alphabeticSelection==1);
			}


		}while(mainSelection>=1 && mainSelection<8);
	}
}
