import java.util.Scanner; // started with public class Errors1 {
public class Errors1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in); //Scanner keyboard = new Scanner (System.in)
		int n1 = 4; // int n1, n2;
		int n2 = 5;
		
		System.out.println("Can you spot and fix the errors?"); // System.out.print("Can you spot and fix the errors?);
		System.out.print("Enter two numbers and I'll "); // System.out.println("Enter two numbers and I");
		System.out.println("add them for you.");
		
		
		n1 = scnr.nextInt();
		n2 = scnr.nextInt();

		System.out.println("The sum of the numbers is");
		System.out.println(n1 + n2); //System.out.print(n1- n2) would give he difference
		
		return;
	}
}