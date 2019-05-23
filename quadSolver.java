import java.util.Scanner;


public class quadSolver {

	public static void main(String[] args) {
		System.out.println("Enter quadratic function");
		Scanner input = new Scanner(System.in);
		String quad = input.next();
		
		
		
		String s = quad;

		int i=s.indexOf("x^2");
		System.out.println(i);
		int j=s.indexOf("x", i + 1);
		System.out.println(j);
		int k= j + 1;
		
		int length = quad.length();
		
		String a = quad.substring(0, i);
		String b = quad.substring(i+4, j);
		String c = quad.substring(j+2, length);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		
		
		
		
		
		
		
		
	}
	
	
}
