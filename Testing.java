import java.util.Scanner; 


public class Testing {

	static void dowhileloop(){
		int i = 1;
		do {
			System.out.println("Hello World. This is what i currently is: " + i);
			i++;
			
		} while(i < 11);
		}
	
	static void forloop(){
		for(int i = 1; i < 11; i++) {
			System.out.println("Hello World. This is what i currently is: " + i);
			
		} 
		}
	
	static void whileloop(){
		int i = 1;
		 while(i < 11) {
			System.out.println("Hello World. This is what i currently is: " + i);
		    i++;

		}
		}

	
	
	
	public static void main(String[] args) {
		
		System.out.println("select your favorite type of loop (dowhileloop, forloop, or whileloop.");
		Scanner input = new Scanner(System.in);
		String selection = input.next();
		
		if (selection.equals("dowhileloop")) {
			dowhileloop();
		}else {
			
			if (selection.equals("forloop")) {
				forloop();
			}else {
				
				if (selection.equals("forloop")) {
					whileloop();
				}else {
					System.out.println("invalid selection");
						main(args);
				
					
				}
			
			}
			
	
			
		
		}
		
		
	}
}
