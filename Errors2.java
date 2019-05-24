import java.util.Scanner;

public class Errors2 {
	public static void main(String[] args) {
		Scanner scnr= new Scanner(System.in); //Scanner kbd = new Scanner(System.in);
		int number = 0; /* int number = 0;
							int theSquare = 0;*/

		System.out.print("Enter a number and I will ");
		System.out.println("square it for you:"); //System.out.print("square it for you:  );
		number =  scnr.nextInt();
		
		int theSquare = number* number; // theSquare = number * number;

		System.out.print(theSquare + " = "); //System.out.print(number + " squared = ";
		System.out.println( number + " squared"); //System.out.println("theSquare");
		
		return;
	}
}