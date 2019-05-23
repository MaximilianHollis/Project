import java.util.Scanner;


public class quadSolver {

	public static void main(String[] args) {
		System.out.println("Enter quadratic function");
		System.out.println("Must be in ax^2+bx+c form");

		Scanner input = new Scanner(System.in);
		String quad = input.next();

		String s = quad;

		int i=s.indexOf("x^2");
		int j=s.indexOf("x", i + 1);
		int k= j + 1;
		
		int length = quad.length();
		
		String a1 = quad.substring(0, i);
		String b1 = quad.substring(i+3, j);
		String c1 = quad.substring(j+1, length);
		
		int a = Integer.parseInt(a1);
		int b = Integer.parseInt(b1);
		int c = Integer.parseInt(c1);

		double root1 = ((b * -1) + Math.sqrt(Math.pow(b, 2) -(4 * a * c)))/(2*a);
				
		double root2 = ((b * -1) - Math.sqrt(Math.pow(b, 2) -(4 * a * c)))/(2*a);
		
		System.out.println(root1);
		System.out.println(root2); 
	
	}
	
	
}
