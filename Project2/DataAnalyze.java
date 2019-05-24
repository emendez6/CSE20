import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter sample size: ");
		int Size = input.nextInt();
		int [] arr = new int[4*(Size+1)];
		int i = 0, j = 0;
		int enter = 0;
		int min = Integer.MAX_VALUE, minIndex = 0;
		int max = Integer.MIN_VALUE, maxIndex = 0;
		
		for (i = 0; i <= 3; i++){
			System.out.println("Enter number for Trial " + i);
			for (j = 0; j <= Size -1; ++j){
				System.out.print("Enter sample #" + j + ":");
				arr[(i*(Size+1))+j] = input.nextInt();
			arr[(i+1)*(Size+1)-1]+=((arr[i*(Size+1)+j]));
		}
	}
		System.out.println("\tSample#\tTrial 1\tTrial 2\tTrial3\tTrial 4");
		for(j = 0; j < Size; ++j){
			System.out.print("\t" + j);
			for (i = 0; i <= 3; ++i){
				System.out.print("\t" + arr[(i*(Size+1))+j]);
				enter++;
				if (enter == 4){
					enter = 0;
					System.out.println();
				}
			}
		}
		System.out.println("        ----------------------------------------");
		System.out.print("Average: ");
		for (i = 0; i < 4; i++){
			System.out.print("\t" + (arr[(i+1)*(Size+1)-1])/Size);
			if (((arr[(i+1)*(Size+1)-1])/Size) < min){
				min = ((arr[(i+1)*(Size+1)-1])/Size);
			}
			if(((arr[(i+1)*(Size+1)-1])/Size)> max){
				max = ((arr[(i+1)*(Size+1)-1])/Size);
			}
		}
		System.out.println();
		System.out.println("Min Average: " + min);
		System.out.println("Max Average: "+ max);
		System.out.println();
		if (min == max){
			System.out.print("The trials match Exactly!");
		}
		if ((min != max) && (max < (2*min))){
			System.out.print("The trials concur with each other!");
		}
		if (min != max){
			System.out.print("The trials do Not concur!");
		}	
	}
}
