import java.util.Scanner;

public class SumAllDo {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter max number ");
		int max = input.nextInt();
		int num = 0;
		int sum = 0;
		
		do{
			sum += num;
			System.out.println("Number " + num);
			++num;
		}while (num <= max);
		System.out.println("Sum of all numbers is " + sum);
	}
}
