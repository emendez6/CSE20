import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		int num;
		int sum = 0;
		
		do{
			System.out.print("Enter " + i + " number: ");
			num = input.nextInt();
			if( num > 0){
				sum += num;
				i++;
			}
			
		}while(num > 0);
		System.out.println("Average is " + (sum / i));
	}

}
