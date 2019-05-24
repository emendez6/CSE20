import java.util.Scanner;

public class AnyAverageArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will find the average of any numbers.");
		System.out.print("Please choose amount of numbers to average: ");
		int max = input.nextInt();

		int[]arr1 = new int[max+1];
		int i = 0;
		int enter = 0;
		
		for (i = 0; i < max; i++){
		System.out.print("Please enter " + i + " number: ");
		arr1[i] = input.nextInt();
		}
		i= 0;	
		System.out.println("The numbers being averaged are: ");
		
		for (i= 0; i < max; i++){
			System.out.print(arr1[i] + " ");
			arr1[max]+=arr1[i];
			enter++;
	         if (enter == 5) {
	            enter = 0;
	            System.out.println();
	         }
		}	
		System.out.println("");
		System.out.println("The average is " + (arr1[max])/max);
	}
}
