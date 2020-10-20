import java.util.*;

public class Buggy{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Bill-Splitter");

		System.out.print("Enter the total, pre-tax: ");
		double total = input.nextInt();

		System.out.print("How many people? ");
		int numPeople = input.nextInt();

		System.out.print("How much did you tip? ");
     double tip = input.nextInt();

    double perPersonWT = total + tip;
		double perPerson = perPersonWT / numPeople;


		System.out.println("Each person must pay $" + perPerson);
	}//end main method
}//end class
