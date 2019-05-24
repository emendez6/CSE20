import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter max number to average: ");
		int max = input.nextInt();
		int average = 0;
		int num = 0;
		
		while (num <= max){
		System.out.println("Number " + num);
		average += num;
		num++;
		}
		System.out.print("The average is " + (average / max));
	}

}
