import java.util.Scanner;
public class codes {
	
	
	static String input;
	static String method;

	
	static void caesar() {
		System.out.println("Enter shift amount:");
		Scanner x = new Scanner(System.in);
		String value = x.next();
		int length = input.length();
		
		for(int i = 0; i < length; i++) {
			char letter = input(i);
			
			System.out.print(letter);

		}

		
	
		
		
		
		
	}
	
	
	private static char input(int i) {
		// TODO Auto-generated method stub
		return 0;
	}


	public static void main(String[] args) {
		
		System.out.println("Enter plaintext");
		Scanner x = new Scanner(System.in);
		input = x.next();
		
		System.out.println("Enter method (caesar,)");
		Scanner y = new Scanner(System.in);
		method = y.next();
		
		if(method.equals("caesar")) {
			caesar();
		}
		else {
			System.out.println("Syntax error");
		}
		
		
		
		
		
		
	}
	
	
	
}
