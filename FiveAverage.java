import java.util.Scanner;

public class FiveAverage {

	public static void main(String[] args) {
		System.out.println("This program will find the average of up to 10 numbers");

		Scanner input = new Scanner(System.in);

		int count = 0;
		int total = 0;
		int runningCount = 0;
		int num = 0;

		System.out.print("Please choose amount of numbers to average (0-10): ");
		count = input.nextInt();

		runningCount = count;
		if (runningCount == 10) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			num = input.nextInt();
			total += num;
			runningCount--;
		}

		if (runningCount == 9) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			num = input.nextInt();
			total += num;
			runningCount--;
		}

		if (runningCount == 8) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			num = input.nextInt();
			total += num;
			runningCount--;
		}

		if (runningCount == 7) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			num = input.nextInt();
			total += num;
			runningCount--;
		}

		if (runningCount == 6) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			num = input.nextInt();
			total += num;
			runningCount--;
		}

		if (runningCount == 5) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			num = input.nextInt();
			total += num;
			runningCount--;
		}

		if (runningCount == 4) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			num = input.nextInt();
			total += num;
			runningCount--;
		}

		if (runningCount == 3) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			num = input.nextInt();
			total += num;
			runningCount--;
		}

		if (runningCount == 2) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			num = input.nextInt();
			total += num;
			runningCount--;
		}

		if (runningCount == 1) {
			System.out.print("Please enter " + (count - runningCount) + " number: ");
			num = input.nextInt();
			total += num;
			runningCount--;
		}

		if (count > 0)
			System.out.println("Average is " + (total/count));
		else
			System.out.println("There are no numbers to average");
	
		/*System.out.println("Prefix and Postfix operator Code");
		int i = 10;
		i--;
		System.out.println(i);		
		--i;			   
		System.out.println(i);		
		System.out.println(++i);	
		System.out.println(i++);	
		System.out.println(i);	
		System.out.println(--i);	
		System.out.println(i--);	
		System.out.println(i);	

		if (i++ == 8)
			System.out.println("Eight");
		
		if (i++ == 9)
			System.out.println("Nine");
		
		System.out.println("Final value " + i);*/
	}
}