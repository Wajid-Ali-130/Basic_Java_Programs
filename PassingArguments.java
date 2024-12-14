import java.util.Scanner;

// Calculator Class
class Calculator {
    Scanner sc = new Scanner(System.in);
   
    void addition(int num1,int num2){
       
       System.out.println("Result: " + (num1 + num2));
    }

    void subtraction(int num1,int num2){
        
        System.out.println("Result: " + (num1 - num2));
    }

    void multiplication(int num1,int num2){
       
        System.out.println("Result: " + (num1 * num2));
    }

    void division(int num1,int num2){
       
       if (num2 != 0) {
            System.out.println("Result: " + (num1 / num2));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    void reminder(int num1,int num2){
        
        System.out.println("Result: " + (num1 % num2));
    }           
}

// Unit Converter Class
class UnitConverter {
    Scanner sc = new Scanner(System.in);
   void kilometersToMiles(double km){
       
        System.out.println(km + " km = " + (km * 0.621371) + " miles");
    }       
   
   void kilogramsToPounds(double kg){
        
        System.out.println(kg + " kg = " + (kg * 2.20462) + " pounds");
   }
}

// Trolley Load Class
class TrolleyLoad {
    void calculateTrolleyLoad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Trolley Load");
        double totalWeight = 0;
        char choice;

        do {
            System.out.println("Enter weight to add to trolley: ");
            double weight = sc.nextDouble();
            totalWeight += weight;
            System.out.println("Total weight so far: " + totalWeight + " kg");
            System.out.println("Add more weight? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Final Trolley Load: " + totalWeight + " kg");
    }
}

// Marksheet Class
class Marksheet {
    void generateMarksheet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marksheet");
        System.out.println("Enter number of subjects: ");
        int subjects = sc.nextInt();
        double totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.println("Enter marks for subject " + i + ": ");
            totalMarks += sc.nextDouble();
        }

        double average = totalMarks / subjects;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F (Fail)");
        }
    }
}

// Exit Class
class ExitProgram {
    void exitApplication() {
        System.out.println("Exiting... Thank you!");
    }
}

// Main Class
class PassingArguments{
    public static void main(String[] args) {
        // Create objects for each class
        Calculator calculator = new Calculator();
        UnitConverter unitConverter = new UnitConverter();
        TrolleyLoad trolleyLoad = new TrolleyLoad();
        Marksheet marksheet = new Marksheet();
        ExitProgram exitProgram = new ExitProgram();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("===== Mini Project =====");
            System.out.println("1. Calculator");
            System.out.println("2. Unit Converter");
            System.out.println("3. Trolley Load");
            System.out.println("4. Marksheet");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            // Call the corresponding method using the created objects
            switch (choice) {
                case 1:
                
                    System.out.println("Calculator");
                    
                    System.out.println("Enter operator (+, -, *, /, %): ");
                    char operator = sc.next().charAt(0);

                    System.out.println("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter second number: ");
                    int b = sc.nextInt();


                     switch (operator) {
                        case '+':
                            calculator.addition(a, b);
                            break;
                        case '-':
                            calculator.subtraction(a, b);
                            break;
                        case '*':
                            calculator.multiplication(a, b);
                            break;
                        case '/':
                            calculator.division(a, b);
                            break;
                        case '%':
                            calculator.reminder(a, b);
                            break;   
                        default:
                            System.out.println("Invalid operator.");
                        }

                    
                    break;
                case 2:
                        System.out.println("Unit Converter");
                        System.out.println("Choose conversion:");
                        System.out.println("1. Kilometers to Miles");
                        System.out.println("2. Kilograms to Pounds");
                        choice = sc.nextInt();
                        if(choice==1){
                            System.out.println("Enter Kilometers: ");
                            double km = sc.nextDouble();
                            unitConverter.kilometersToMiles(km);
                        }
                        if(choice==2){
                            System.out.println("Enter Kilograms: ");
                            double kg = sc.nextDouble();
                            unitConverter.kilogramsToPounds(kg);
                        }
                    break;
                case 3:
                    trolleyLoad.calculateTrolleyLoad();
                    break;
                case 4:
                    marksheet.generateMarksheet();
                    break;
                case 5:
                    exitProgram.exitApplication();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println(); // Blank line for better output formatting
        } while (choice != 5);
    }
}
