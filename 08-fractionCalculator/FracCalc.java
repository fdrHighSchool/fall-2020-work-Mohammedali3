import java.util.Scanner;


public class FracCalc {

    /**
     * Prompts user for input, passes that input to produceAnswer, then outputs the result.
     * @param args - unused
     */
    public static void main(String[] args){
        // TODO: Read the input from the user and call produceAnswer with an equation
        // Checkpoint 1: Create a Scanner, read one line of input, pass that input to produceAnswer, print the result.
        // Checkpoint 2: Accept user input multiple times.



        Scanner input = new Scanner(System.in);
        System.out.print("Please enter in your equation it must be in the format as first equation space operation space second equation. For example 4 + 3:  ");
        String holdsEqu = input.nextLine();
        String Input1 = produceAnswer(holdsEqu);
        System.out.print(Input1);


    }//end main method

    /**
     * produceAnswer - This function takes a String 'input' and produces the result.
     * @param input - A fraction string that needs to be evaluated.  For your program, this will be the user input.
     *      Example: input ==> "1/2 + 3/4"
     * @return the result of the fraction after it has been calculated.
     *      Example: return ==> "1_1/4"
     */
    public static String produceAnswer(String input){
      int Space = input.indexOf(" ");//Here i am identifying the space in the equation. This will be used to find where my first num is located
      int totalcha = input.length();//Length of the String
      String firstEqu = input.substring(0, Space);//First Num
      String Oper = input.substring(Space + 1, Space + 2);//The operator
      String secondEqu = input.substring( Space + 2, totalcha);//Second Num
      System.out.println(Oper);//Once again just checking
      System.out.println(firstEqu);//For checking

      // TODO: Implement this function to produce the solution to the input
      // Checkpoint 1: Return the second operand.  Example "4/5 * 1_2/4" returns "1_2/4".
      // Checkpoint 2: Return the second operand as a string representing each part.
      //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4".
      // Checkpoint 3: Evaluate the formula and return the result as a fraction.
      //               Example "4/5 * 1_2/4" returns "6/5".
      //               Note: Answer does not need to be reduced, but it must be correct.
      // Final project: All answers must be reduced.
      //               Example "4/5 * 1_2/4" returns "1_1/5".

      return secondEqu;
    }//end produceAnswer method

    // TODO: Fill in the space below with helper methods

    /**
     * greatestCommonDivisor - Find the largest integer that evenly divides two integers.
     *      Use this helper method in the Final Checkpoint to reduce fractions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The GCD.
     */
    public static int greatestCommonDivisor(int a, int b){
      return 0;

    }//end greatestCommonDivisor method

    /**
     * leastCommonMultiple - Find the smallest integer that can be evenly divided by two integers.
     *      Use this helper method in Checkpoint 3 to evaluate expressions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The LCM.
     */
    public static int leastCommonMultiple(int a, int b){
      return 0;

    }//end leastCommonMultiple

}//end class
