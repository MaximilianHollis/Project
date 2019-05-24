import java.util.Scanner; 

public class Tic_Tac_Toe {


	static String turn = "x";

	static String[] board = {"-","-","-","-","-","-","-","-","-"};
	
	
	
	 static void myMethod() {
		 
		    System.out.println("Player: "+ turn + ", enter move \n[0][1][2]\n[3][4][5]\n[6][7][8]");

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
			System.out.print("[" + board[8] +"]");	
			
			if (turn.equals("x")) {
				turn = "y";
			}
			else {
				turn = "x";
			}
		    
		    
		    
		  }
	
	 public static void main(String [] args) {
		
		 String turn = "x";
			
		 myMethod();
		 myMethod();
		 myMethod();
		
		
		
		
		
		
	}


	
	
	
	
}
