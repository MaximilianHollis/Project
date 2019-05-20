import java.util.Scanner;

public class Tempconvert {

		public static void main(String [] args) {
			
			Scanner obj = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Enter converting to f or c");
			String type = obj.nextLine();  // Procure user input
			
			
			
			if (type.equals("c")) {
				Scanner obj1 = new Scanner(System.in);  // Create a Scanner object
				System.out.println("Enter temp");
				int num1 = obj1.nextInt();  // Procure user input
				double temp = (num1-32) *.5556;
				System.out.println("temp in "+type+" is: "+temp);

			}
			
			if (type.equals("f")) {
				Scanner obj2 = new Scanner(System.in);  // Create a Scanner object
				System.out.println("Enter temp");
				int num1 = obj2.nextInt();  // Procure user input
				double temp = (num1 * 1.8) +32;
				System.out.println("temp in "+type+" is: "+temp);
			}
			
			
			
		}
}
