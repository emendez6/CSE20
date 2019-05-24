import java.util.Scanner;
public class Bobcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner imput = new Scanner(System.in);
		int typCar, numDays, clubMem, premMem, disCount;

		System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard");
		System.out.print("Please choose the rental car: ");
		typCar = imput.nextInt();

		if(typCar == 1)
			typCar = 25;
		if(typCar == 2)
			typCar = 55;
		if(typCar == 3)
			typCar = 100;

		System.out.print("Please enter the number of rental days: ");
		numDays = imput.nextInt();

		double perCent, basePrice, estimTotal, pepCost;
		perCent = .2;
		basePrice = typCar * numDays;

		System.out.print("Club Member?: 1 for yes, 0 for no: ");
		clubMem = imput.nextInt();
		if (clubMem == 1){
			disCount = (numDays / 5) * typCar;
			System.out.print("Platinum Executive Package?: 1 for yes, 0 for no:");
			premMem = imput.nextInt();
			if (premMem == 1){
				pepCost = basePrice * perCent;}
			else{ pepCost = 0;}
		}
		else{ disCount = 0;
		pepCost = 0;
		premMem = 0;}
		
		System.out.println("");
		System.out.println("Base Price for the rental:                $" + (int)(basePrice));

		if (clubMem == 1){
			System.out.println("Club Member Discount:                   - $" + disCount);
		}
		if (premMem == 1){
			System.out.println("Platinum Executive Package Cost:        + $" + (int)(pepCost));
		}
		
		estimTotal = (basePrice - disCount + pepCost);
		System.out.println("");
		System.out.println("Total Estimate for Rental:                $" + (int)(estimTotal));
	}
}


