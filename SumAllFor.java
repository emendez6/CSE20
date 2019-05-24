import java.util.Scanner;

public class SumAllFor {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter max number: ");
		int max = input.nextInt();
		int num = 0;
		int sum = 0;
		
		for (num = 0; num <= max; num++){
			sum += num;
			System.out.println("Number " + num);
		}
		System.out.println("Sum of all numbers is " + sum);
	}

}
