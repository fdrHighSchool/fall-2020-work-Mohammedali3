import java.util.*;

public class Buggy{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Bill-Splitter");

		System.out.print("Enter the total, pre-tax: ");
		double total = input.nextDouble();

		System.out.print("How many people? ");
		int numPeople = input.nextInt();

		System.out.print("How much did you tip? ");
     double tip = input.nextDouble();

		 System.out.print("How much percentage tax did you pay? ");
		 	int percentage = input.nextInt();

		double Percentage1 = total*percentage/100;
    double perPersonWT = total + tip + Percentage1;
		double perPerson = perPersonWT / numPeople;


		System.out.println("Each person must pay $" + perPerson);
	}//end main method
}//end class
