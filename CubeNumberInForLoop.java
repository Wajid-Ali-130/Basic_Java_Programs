import java.util.Scanner;

class CubeNumberInForLoop{
    public static void main(String[] args) {
    	Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter Any No:");
    	int number = obj.nextInt();
    
	for(int a=1; a<=number; a++){
		int cube = a*a;
		System.out.println("Cube Of : "+a+" Is "+cube);
    }


    }
}