
public class Errors9 {

	public static void main(String[] args) {
		double[] inp = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};// there needs to be a , after 2.0 not a period, get rid of the comma after 3, and need a semicolon at the end
		double sum = 0;// needs to be a double not integer
		double square = 0;//need a new variable to save the squared values in
		
		for (int i = 1; i <= inp.length-1; ++i ) {// i = 1 since we are not starting from 0 
			square = inp[i] * inp[i]; // need to multipy the numbers the array holds together not the i's
			sum += square;// add the squares and make it equal to the new sum
			System.out.println("Squared of index " + i + " is " + square);//print the index which is the variable inside [] and print out the value before it is squared and not the sum as it goes also thats when we put the square not the inp[i*i]
		}
		System.out.println("Sum of Squares is " + sum);
	}

}
