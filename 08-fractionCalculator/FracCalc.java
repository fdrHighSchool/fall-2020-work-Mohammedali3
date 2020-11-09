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
      int check1 = firstEqu.indexOf("_");//The _ in the fraction for example 4_5/6 for the first fraction
      int check2 = secondEqu.indexOf("_");// Does the samething as line 36 but for the second fraction
      int Slash1 = firstEqu.indexOf('/');//The slash in the fraction
      int Slash2 = secondEqu.indexOf("/");// The slash in the second fraction
      String allParts;



      if (check1 != -1){//If check is -1 that means there is _ in the fraction
        String wholeNum = firstEqu.substring(0, check1);//This takes the whole num from fraction one
        String num = firstEqu.substring(check1 + 1, Slash1);//Takes the numerator from fraction one
        String den = firstEqu.substring(Slash1 + 1);//Takes the denominator from fraction one
        System.out.println("The whole number is: " + wholeNum);
        System.out.println("The numerator is; " + num );
        System.out.println("The denominator is: " + den);
      }
      else if ((check1 = -1) && (Slash1 = -1)){
        String num = firstEqu.substring(0, Slash1);
        String den = firstEqu.substring(Slash1 + 1);
        System.out.println("The numerator is: " + num);
        System.out.println("The denominator is: " + den);
      }
      else{//If there is no _ in the fraction it prints the first/second num as it is
        String wholeNum = firstEqu;
        System.out.print("Number one is: " + wholeNum);
      }

      if(check2 != -1){//If check is -1 that means there is _ in the fraction
        String wholeNum2 = secondEqu.substring(0, check2);//The whole num for fraction two
        String num2 = secondEqu.substring(check2 + 1, Slash2);// Num for fraction 2
        String den2 = secondEqu.substring(Slash2 + 1);//Den for second fractions
        System.out.println("Whole num: " + wholeNum2);
        System.out.println("Num for num 2: " + num2);
        System.out.println("Den for num 2: " + den2);
        allParts = wholeNum2  + " " +  num2  + " " +  den2;// Stores all the parts of fraction two and is returned
      }
      else if ((check2 = -1) && (Slash2 = -1)){
        String num2 = firstEqu.substring(0, Slash2);
        String den2 = firstEqu.substring(Slash2 + 1);
        System.out.println("The numerator is: " + num2);
        System.out.println("The denominator is: " + den2);
        allParts = num2 + " " + den2;
      }
      
      else{//If there is no _ in the fraction it prints the first/second num as it is
        String wholeNum2 = secondEqu;
        System.out.println(wholeNum2);
        allParts = secondEqu;
      }

      // TODO: Implement this function to produce the solution to the input
      // Checkpoint 1: Return the second operand.  Example "4/5 * 1_2/4" returns "1_2/4".
      // Checkpoint 2: Return the second operand as a string representing each part.
      //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4".
      // Checkpoint 3: Evaluate the formula and return the result as a fraction.
      //               Example "4/5 * 1_2/4" returns "6/5".
      //               Note: Answer does not need to be reduced, but it must be correct.
      // Final project: All answers must be reduced.
      //               Example "4/5 * 1_2/4" returns "1_1/5".
      return allParts;
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
