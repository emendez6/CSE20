import java.util.Scanner;

public class BooleanOp{
	public static void main(String[] args) {
		int a = 0, b = 0 , c = 0;

		System.out.println('A' + " is character");
		Scanner in = new Scanner(System.in);
		System.out.print("Input the first number: ");
		a = in.nextInt();
		System.out.print("Input the second number: ");
		b = in.nextInt();
		System.out.print("Input the third number: ");
		c = in.nextInt();
		
		System.out.println("a = " + a + " and b = " + b + " and c = " + c);
		System.out.println(a + " is greater than " + b + " : " + (a > b));
		System.out.println(a + " is less than " + b + " : " + (a < b));
		System.out.println(a + " is equal to " + b + " : " + (a == b));
		System.out.println(a + " is greater or equal to " + b + " : " + (a >= b));
		System.out.println(a + " is less than or equal to " + b + " : " + ( a <= b));
		System.out.println(a + " is not equal to " + b + " : " + (a != b));

		System.out.println(a + " is greater than " + b + " OR " + a + " is equal to " + c + " : " + (a > b || a == c));
		System.out.println(a + " is less than " + b + " OR " + a + " is equal to " + c + " : " + (a < b || a == c));
		System.out.println(a + " is equal to " + b + " OR " + a + " is equal to " + c + " : " + (a == b || a == c));
		System.out.println(a + " is greater or equal to " + b + " AND " + a + " is equal to " + c + " : " + (a >= b && a == c));
		System.out.println(a + " is less than or equal to " + b + " AND " + a + " is equal to " + c + " : " + (a <= b && a == c));
		System.out.println(a + " is not equal to " + b + " AND " + a + " is equal to " + c + " : " + (a != b && a == c));

		System.out.println(a + " is less than " + b + " OR " + a + " is greater than " + c + " : " + (a < b || a > c));
		System.out.println(a + " is less than " + b + " OR " + a + " is less than " + c + " : " + (a < b || a < c));
		System.out.println(a + " is less than " + b + " OR " + a + " is equal to " + c + " : " + (a < b || a == c));
		System.out.println(a + " is less than " + b + " AND " + a + " is greater or equal to " + c + " : " + (a < b && a >= c));
		System.out.println(a + " is less than " + b + " AND " + a + " is less than or equal to " + c + " : " + (a < b && a <= c));
		System.out.println(a + " is less than " + b + " AND " + a + " is not equal to " + c + " : " + (a < b && a != c));
		
		
		//4 + 5 * 6 + 7 / 8 
		/*4 + (5 * 6) + (7/8)because multiplication and division take priority and then you would add from left to 
		right and get 4 + 30 + 0 = 34. 34 is your final answer
		 */
		
		//4 + 5 * 6 < 7 / 8
		/* (5 * 6) and (7 / 8) prioritize to get 30 and zero
		then you add the left since adding is above < to get 34
		lastly you do 34 < 0 and since it is comparing your answer will be False
		 */
		
		//4 + 5 > 6 && 7 < 8
		/* add (4 + 5) to get 9 and it is > 6 then you just add the right side to get an answer of
		 9 > 6 and 7 < 8 and so your answer will be True and True
		 */
		//1 && 0
		/* 1 = true 0 = false
		*/
		return;
	}
} 