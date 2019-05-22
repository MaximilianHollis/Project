import java.util.Scanner;
public class math {

	public static void main(String [] args) {
		System.out.println("What type of shape (cube, sphere, prism.)");
		Scanner input = new Scanner(System.in);
		String shape = input.next();
		
		if (shape.equals("cube")) {
			
			System.out.println("length of sides?");
			Scanner input1 = new Scanner(System.in);
			Double length = input1.nextDouble();
			Double volume;
			volume = Math.pow(length, 3);
			System.out.println("volume: " + volume);
			
	
		}
		
		if(shape.equals("sphere")) {
			
			System.out.println("radius of sphere?");
			Scanner input1 = new Scanner(System.in);
			Double radius = input1.nextDouble();
			Double volume = (Math.PI * Math.pow(radius, 3)/3);
			System.out.println("volume: " + volume);
		
		}
		
		if(shape.equals("prism")) {
			
			System.out.println("length of prism?");
			Scanner input1 = new Scanner(System.in);
			Double length = input1.nextDouble();
			
			System.out.println("width of prism?");
			Scanner input2 = new Scanner(System.in);
			Double width = input1.nextDouble();
			
			System.out.println("hight of prism?");
			Scanner input3 = new Scanner(System.in);
			Double hight = input1.nextDouble();
			
			Double volume;
			volume = length * width * hight;
			System.out.println("volume: " + volume);
			
		}
		
		
		
		
	}
	
}
