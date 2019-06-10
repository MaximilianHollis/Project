import java.util.Scanner;


public class array {

	/**This method allows the user to control and view the generations*/
		public static void method(int turn) {
			
			turn++;
			System.out.println("This is turn: " + turn);
			System.out.println("Enter y to start the next generation.");
			Scanner input = new Scanner(System.in);
			String move = input.next();
			if (move.equals("y")) {
			print();
			};
			
		}
		
		/**This method prints and manages the board*/
		public static void print() {
			
			String[][] board = {{"0", "0", "0", "0", "0"},
					{"0", "0", "0", "0", "0"},
					{"0", "x", "x", "x", "0"},
					{"0", "0", "0", "0", "0"},
					{"0", "0", "0", "0", "0"}};

int[][] map = {{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0}};
			
		for(int i = 0; i < 5; i++) {
				
				for(int j = 0; j < 5; j++) {

				System.out.print("[" + board[i][j] + "]");
				
						for(int q = -1; q < 1; q++) {
							for(int w = -1; w < 1; w++) {

								
						int e = i + q;
						int r = j + w;
						if(e < 0) {
							e = 0;
						}
						if(r < 0) {
							r = 0;
						}

						if (board[(e)][(r)].equals("x")) {
	
							map[i][j]++;
						}
							}
						}
					
							
						
					
					
			}
				
				System.out.println();
			}
		
		System.out.println();
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {

			System.out.print("[" + map[i][j] + "]");
			}
			System.out.println("");

		}
	
		}

		
		
		/**This main controls the two aforementioned methods*/

		public static void main(String [] args) {
			
			int turn = 0;
			method(turn);
			
		}
	
}
