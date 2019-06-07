import java.util.Scanner;


public class array {

		static int turn = 0;
		static String[][] board = {{"0", "0", "0", "0", "0"},
								{"0", "0", "0", "0", "0"},
								{"0", "x", "x", "x", "0"},
								{"0", "0", "0", "0", "0"},
								{"0", "0", "0", "0", "0"}};
	
	
		static void method() {
			
			turn++;
			System.out.println("This is turn: " + turn);
			System.out.println("Enter y to start the next generation.");
			Scanner input = new Scanner(System.in);
			String move = input.next();
			if (move.equals("y")) {
			print();
			};
			
		}
		
		static void print() {
			
		for(int i = 0; i < 5; i++) {
				
				for(int j = 0; j < 5; j++) {

				System.out.print("[" + board[i][j] + "]");
				
				
				}	
				System.out.println();
			} 
						
			
			
			
			
		}
		
		
		

	
		public static void main(String [] args) {
			
			method();
			
		}
	
}
