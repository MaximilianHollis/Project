import java.util.Scanner;

public class Main{

public static void main(String args[]) {
	
	Scanner input = new Scanner(System.in);
  System.out.println("Enter plain text:");
  String origin = input.nextLine();
	char[] charlist = origin.toCharArray();
  System.out.println("Enter shift:");
  int shift = input.nextInt();
	
  System.out.println("Cipher text:");
	 for (int i = 0; (i < charlist.length); i++) {
        char letter = charlist[i];
	      int ascii = letter;
        if (ascii == 32) {
System.out.print(" ");
        } else {
int crypt = ascii + shift;
        int shiftedcrypt = crypt - 97;
        int shiftedcryptmod = shiftedcrypt % 26;
        int finalcrypt = shiftedcryptmod + 97;
        System.out.print((char)finalcrypt);
        }
	 }
	}
}
//Thanks to @YangJeffrey for the help
