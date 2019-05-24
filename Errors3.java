import java.util.Scanner;

public class Errors3 { //public class Errors3
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in); //Scanner kbd = new Scanner System.in;
		int numerator;
		int denominator;

		System.out.println("This program divides two numbers."); //System.println("This program divides two numbers.");
		System.out.print("Enter the numerator: "); //System.print("Enter the numerator: ");
		numerator = scnr.nextInt(); //numerator = kbd.nextInt();
		
		System.out.print("Enter the denominator: ");
		denominator = scnr.nextInt(); //denomintaor = kbd.nextInt();

		System.out.print(numerator); //system.out.print(numerator);
		System.out.print("/");
		System.out.print(denominator); //system.out.Print(denominator);
		System.out.print(" = ");
		System.out.println((double) numerator/denominator); //System.out.Println((double) numerator/denominator);
		
		return;
		}
	}
