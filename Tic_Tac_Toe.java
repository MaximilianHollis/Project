import java.util.Scanner; 

public class Tic_Tac_Toe {

	static String turn = "x";

	static String[] board = {"0","1","2","3","4","5","6","7","8"};
	
	static int i = 1;
	
	 static void myMethod() {
		 	
		 	System.out.println(turn + " select your move.");
			Scanner input = new Scanner(System.in);
			String move = input.next();
			int move1 = Integer.parseInt(move);
			board[move1] = turn;
			
			System.out.print("[" + board[0] +"]");
			System.out.print("[" + board[1] +"]");
			System.out.println("[" + board[2] +"]");
			
			System.out.print("[" + board[3] +"]");
			System.out.print("[" + board[4] +"]");
			System.out.println("[" + board[5] +"]");
			
			System.out.print("[" + board[6] +"]");
			System.out.print("[" + board[7] +"]");
			System.out.println("[" + board[8] +"]");	
			
			if (turn.equals("x")) {
				turn = "y";
			}
			else {
				turn = "x";
			}
			
			 if((board[0].equals(board[1]) &&  board[1].equals(board[2])) ||
				(board[3].equals(board[4]) &&  board[4].equals(board[5])) ||
				(board[6].equals(board[7]) &&  board[7].equals(board[8])) ||
				(board[0].equals(board[3]) &&  board[3].equals(board[6])) ||
				(board[1].equals(board[4]) &&  board[4].equals(board[7])) ||
				(board[2].equals(board[5]) &&  board[5].equals(board[8])) ||
				(board[0].equals(board[4]) &&  board[4].equals(board[8])) ||
				(board[6].equals(board[7]) &&  board[7].equals(board[2])) 
				) { 
						 
				 System.out.print("GAME OVER, " + turn + " LOSE."); 
					 }
					 else {
						 i = i + 1;	 
						 if(i == 10){				 
							 System.out.print("GAME OVER: TIE"); 
						 }
						 else {
							 myMethod();
						 }		 
					 }
		  }
	
	 public static void main(String [] args) {
		 	
		 	System.out.println("[0][1][2]");
		 	System.out.println("[3][4][5]");
		 	System.out.println("[6][7][8]");

		 	myMethod();
		 
	}
	
}








