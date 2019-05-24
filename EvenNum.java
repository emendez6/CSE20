import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter max number:");
		
		int max = input.nextInt();
		int num = 0;
		while (num <= max){
			 if ( num % 2 == 0){
                 System.out.println("Number " + num);
			 }
			 num++;
		}
	}
}
