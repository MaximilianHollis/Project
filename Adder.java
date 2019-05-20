import java.util.Scanner; 

public class Adder {

	public static void main(String [] args) {
		
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("Enter number");
		 int num = obj.nextInt();  // Procure user input
		 int sum = 0;
		 
		 for (int i = 1; i < num + 1; i++) {
			  System.out.println(i);
			   sum = sum + i;
			}
		 System.out.println(sum);


	}
	

	
}
