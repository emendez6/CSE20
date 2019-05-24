import java.util.Scanner;

public class Interviewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner (System.in);
			
		int numQuest = 6;
		String name;
		System.out.println("What is your name?");
		name = scnr.next();
		
		String year;
		System.out.println("What year are you?");
		year = scnr.next();
		
		String age;
		System.out.println("How old are you?");
		age = scnr.next();
		
		String siblings;
		System.out.println("How many sibling(s) do you have?");
		siblings = scnr.next();
		
		String pets;
		System.out.println("How many pets?");
		pets = scnr.next();
		
		char charA = 'A';
		int weigh, kg;
		
		System.out.println("Please enter the number you weight in lbs: ");
		weigh = scnr.nextInt();
		
		kg = weigh / 2; //can't be 2.2lbs because it can't go from double to int.
		
		System.out.println("Your weight is " + (int) (kg) + "kg.");
		
		
		
		
		System.out.println("You just answered " + numQuest + " questions.");
		System.out.print("Thank You.");
		
		return;

	}

}
