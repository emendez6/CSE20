import java.util.Scanner;

public class Manipulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int n1, n2;
		
		System.out.println("Please enter the first number:");
		n1 = input.nextInt();
		
		System.out.println("Please enter the second number:");
		n2 = input.nextInt();
		
		int add, sub, div, mult, rem;
		add = n1 + n2;
		sub = n1 - n2;
		div = n1 / n2;
		mult = n1 * n2;
		rem = n1 % n2;
		
		char charA = 'A';
		
		System.out.println("Add of the numbers is: " + (int)  (add));
		System.out.println("sub of the numbers is: " + (int) (sub));
		System.out.println("Div of the numbers is: " + (int) (div));
		System.out.println("Mult. of the numbers is:" + (int) (mult));
		System.out.println("Rem of the numbers is: " + (int) (rem));
		
		int numShort1, numShort2;
		
		System.out.println("Please enter the first short: ");
		numShort1 = input.nextInt();
		
		System.out.println("Please enter the second short: ");
		numShort2 = input.nextInt();
		
		add = numShort1 + numShort2;
		sub = numShort1 - numShort2;
		div = numShort1 / numShort2;
		mult = numShort1 * numShort2;
		rem = numShort1 % numShort2;
		
		System.out.println("Add of the two shorts is: " + (short)  (add));
		System.out.println("sub of the two shorts is: " + (short) (sub));
		System.out.println("Div of the two shorts is: " + (short) (div));
		System.out.println("Mult of the two shorts is:" + (short) (mult));
		System.out.println("Rem of the two shorts is: " + (short) (rem));
		
		int numFloat1, numFloat2;
		
		System.out.println("Please enter the first float: ");
		numFloat1 = input.nextInt();
		
		System.out.println("Please enter the second float: ");
		numFloat2 = input.nextInt();
		
		add = numFloat1 + numFloat2;
		sub = numFloat1 - numFloat2;
		div = numFloat1 / numFloat2;
		mult = numFloat1 * numFloat2;
		rem = numFloat1 % numFloat2;
		
		System.out.println("Add of the two floats is: " + (float) (add));
		System.out.println("Sub of the two floats is: " + (float) (sub));
		System.out.println("Div of the two floats is: " + (float) (div));
		System.out.println("Mult of the two floats is: " + (float) (mult));
		System.out.println("Rem of the two floats is: " + (float) (rem));
		
		int numDouble1, numDouble2;
		
		System.out.println("Please enter the first double: ");
		numDouble1 = input.nextInt();
		
		System.out.println("Please enter the second double: ");
		numDouble2 = input.nextInt();
		
		add = numDouble1 + numDouble2;
		sub = numDouble1 - numDouble2;
		div = numDouble1 / numDouble2;
		mult = numDouble1 * numDouble2;
		rem = numDouble1 % numDouble2;
		
		System.out.println("Add of the two doubles is: " + (double) (add));
		System.out.println("Sub of the two doubles is: " + (double) (sub));
		System.out.println("Div of the two doubles is: " + (double) (div));
		System.out.println("Mult of the two doubles is: " + (double) (mult));
		System.out.println("Rem of the two doubles is: " + (double) (rem));
		
		return;
		
	}

}
