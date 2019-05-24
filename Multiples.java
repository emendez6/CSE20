import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter max number ");
		int max = input.nextInt();
		
		System.out.print("Please enter base ");
		int base = input.nextInt();
		
		for (int num = base; num <= max; ++num) {
			if (num % base == 0){
			System.out.println("Number " + num);
			}
		}
	}

}
