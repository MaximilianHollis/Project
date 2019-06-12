import java.util.Scanner;


public class array {

	/**This method allows the user to control and view the generations*/
		public static void method(int turn, String[][] board) {
			
			turn++;
			System.out.println("This is turn: " + turn);
			System.out.println("Enter y to start the next generation.");
			Scanner input = new Scanner(System.in);
			String move = input.next();
			if (move.equals("y")) {
			print(turn, board);
			};
			
		}
		
		/**This method prints and manages the board*/
		public static void print(int turn, String[][] board) {
			
			int[][] map = {{0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0}};	
			
		for(int i = 0; i < 5; i++) {		
				for(int j = 0; j < 5; j++) {
				System.out.print("[" + board[i][j] + "]");
						for(int q = -1; q < 2; q++) {
							for(int w = -1; w < 2; w++) {
								
						int e = i + q;
						int r = j + w;
						
						if (board[(i)][(j)].equals("x") && (e > -1) && (r > -1) && (e < 5) && (r < 5)){
							map[e][r]++;
						}
							}
						}
						if (board[(i)][(j)].equals("x")) {
							map[i][j]--;
						}
			}
				System.out.println();
			}
		
		System.out.println();
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {

			System.out.print("[" + map[i][j] + "]");
			if((map[i][j] != 3) && (map[i][j] != 2)) {
				board[i][j] = "0";
			}else {
				if(map[i][j]== 3) {
					board[i][j] = "x";
			}else {
				if(map[i][j]== 2) {
					if(board[i][j].equals("x")) {
						board[i][j] = "x";
					}else {
						board[i][j] = "0";
					}
			}
			}
			}
			}
			System.out.println("");

		}

     method(turn, board);
		}

		
		
		/**This main controls the two aforementioned methods*/

		public static void main(String [] args) {
			
			String[][] board = {
					{"0", "0", "0", "0", "0"},
					{"0", "0", "0", "0", "0"},
					{"0", "x", "x", "0", "0"},
					{"0", "x", "x", "0", "0"},
					{"0", "0", "0", "0", "0"}};

			int turn = 0;
			method(turn, board);
			
		}
	
}