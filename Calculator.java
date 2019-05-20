import java.util.Scanner; 

public class Calculator {
	public static void main(String [] args){
		
	    Scanner obj1 = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter first number");
	    int num1 = obj1.nextInt();  // Procure user input
	    
	    
	    Scanner obj2 = new Scanner(System.in);
	    System.out.println("Enter second number");
	    int num2 = obj2.nextInt(); 
	    
	    Scanner obj3 = new Scanner(System.in);
	    System.out.println("Enter operator");
	    String operation = obj3.nextLine(); 
	    
	    if (operation.equals("+")){
		    System.out.println("your number is: ");  // Output user input 
		    System.out.println(num1 + num2);
	    }
	    if (operation.equals("-")){
		    System.out.println("your number is: ");  // Output user input 
		    System.out.println(num1 - num2);
	    }
	    if (operation.equals("*")){
		    System.out.println("your number is: ");  // Output user input 
		    System.out.println(num1 * num2);
	    }
	    if (operation.equals("/")){
		    System.out.println("your number is: ");  // Output user input 
		    System.out.println(num1 / num2);
		    
	    }
		 if (operation.equals("%")){
			  System.out.println("your number is: ");  // Output user input 
			  System.out.println(num1 % num2);
	    }
	}
}
