import java.util.Scanner;

public class Errors4 {

	public static void main(String [] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Enter two ints and we print out sum as an int.");

		System.out.print("Enter the first number: ");
		n1 = keyboard.nextInt();

		System.out.print("Enter the second number: ");
		n2 = keyboard.nextInt();

		System.out.println("The sum of the numbers is " + (int)(n1+n2));
	
		return;
	}
}