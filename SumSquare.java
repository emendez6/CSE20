import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter max number ");
		int max = input.nextInt();
		int sum = 0;
		int sqr = 0;
		
		for (int num = 1; num <= max; ++num){
			sqr = num * num;
			sum += sqr;
			System.out.println("Number " + num + " squared is " + sqr);
		}
		System.out.println("The sum of the squares is " + sum);
	}

}
