import java.util.Scanner;

public class SumAll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter max numbers: ");
		
		int max = input.nextInt();
		int num = 0;
		int sum = 0;
		
		while (num <= max){
		System.out.println("Number " + num);
		sum += num;
		num++;
		}
		System.out.print("Sum of All is " + sum);
		}
	}
