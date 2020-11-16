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

        //Lets the user play many times//
        boolean event = true;


        while (event) {
          System.out.print("Please enter in your equation it must be in the format as first equation space operation space second equation. For example 4 + 3: ");
          String holdsEqu = input.nextLine();
          String Input1 = detachExperssion(holdsEqu);
          System.out.println(Input1);

          System.out.println("Do you want to quit? if so please enter quit: ");
          String quit = input.nextLine();
          if (quit.equals("quit")){
            event = false;
          }

        }
    }//end main method

    /**
     * produceAnswer - This function takes a String 'input' and produces the result.
     * @param input - A fraction string that needs to be evaluated.  For your program, this will be the user input.
     *      Example: input ==> "1/2 + 3/4"
     * @return the result of the fraction after it has been calculated.
     *      Example: return ==> "1_1/4"
     */
    
    /*
    * Name: detachExpression
    * Purpose: Find the answer to the question being asked in main
    * Input: The user input from main
    * Return: As of right now we are outputing the second fraction
    */
    public static String detachExperssion(String input){
      int Space = input.indexOf(" ");//Here i am identifying the space in the equation. This will be used to find where my first num is located
      int totalcha = input.length();//Length of the String

      String firstEqu = input.substring(0, Space);//First Num
      String Oper = input.substring(Space + 1, Space + 2);//The operator
      String secondEqu = input.substring( Space + 3, totalcha);//Second Num

      int check1 = firstEqu.indexOf("_");//The _ in the fraction for example 4_5/6 for the first fraction
      int check2 = secondEqu.indexOf("_");// Does the samething as line 36 but for the second fraction
      int Slash1 = firstEqu.indexOf('/');//The slash in the fraction
      int Slash2 = secondEqu.indexOf("/");// The slash in the second fraction
      String allParts;
      String Ans;


      //get a/b, c/d so math can get done with those numbers
      //int num1A, den1A, num2A, den2A;
      int num, den, num2, den2;


      if (check1 != -1){//If check is -1 that means there is _ in the fraction
        num = convertToImproper(firstEqu, check1, Slash1);
        den = getDenominator(firstEqu, Slash1);
        System.out.println(num + "/" + den);
      }

      else if ((check1 == -1) && (Slash1 != -1)){// _ is not in the fraction but / is
        num = Integer.parseInt(firstEqu.substring(0, Slash1));
        den = Integer.parseInt(firstEqu.substring(Slash1 + 1));
        System.out.println(num + "/" + den);
      }

      else{//If there is no _ and / in the fraction it prints the first/second num as it is
        num = Integer.parseInt(firstEqu);
        den = 1;
        System.out.println(num + "/" + den);
      }

      if(check2 != -1){
        num2 = convertToImproper(secondEqu, check2, Slash2);
        den2 = getDenominator(secondEqu, Slash2);
        System.out.println(num + "/" + den);
      }//If check is -1 that means there is _ in the fraction

      else if ((check2 == -1) && (Slash2 != -1)){// _ is not in the fraction but / is
        num2 = Integer.parseInt(secondEqu.substring(0, Slash2));
        den2 = Integer.parseInt(secondEqu.substring(Slash2 + 1));
        //System.out.println("The numerator is: " + num2 + " " + "The denominator is: " + den2);
        allParts = num2 + "/" +den2;;
        System.out.println(allParts);
      }

      else{//If there is no _ and / in the fraction it prints the first/second num as it is
        num2 = Integer.parseInt(secondEqu);
        den2 = 1;
        String both = num2 + "/" +den2;
        allParts = both;
        System.out.println(both);
      }

      //produceAnswer(num,den,num2,den2);

      if (Oper.equals("+") ){
        Ans = add(num,den,num2,den2);
        System.out.println(Ans);
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
      return "";
    }//end detachExpression method







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

    /*
    * Name: convertToImproper
    * Purpose: convert from a_b/c to the numerator in the improper fraction form
    * Input: _,/,and the fraction
    * Return: returns a/c rather then a_b/c
    */
    //convert from a_b/c to the numerator in the improper fraction form
    public static int convertToImproper(String frac, int underscore, int fracSlash){
      int wholeNum = Integer.parseInt(frac.substring(0, underscore));//This takes the whole num from fraction one
      int num = Integer.parseInt(frac.substring(underscore + 1, fracSlash));//Takes the numerator from fraction one
      int den = Integer.parseInt(frac.substring(fracSlash + 1));//Takes the denominator from fraction one

      int numAftMath = wholeNum * den + num;
      return numAftMath;
    }//end getWholeNum

    /*
    * Name: getDenominator
    * Purpose: Find the denominator for fractions like 6_6/7
    * Input: The fraction and slash
    * Return: gives the denominator
    */
    public static int getDenominator(String frac, int fracSlash){
      return Integer.parseInt(frac.substring(fracSlash + 1));
    }//end getDenominator


    /*
    * Name: add
    * Purpose: adds the two fraction
    * Input: the two fractions
    * Return: the result after adding
    */
    public static String add(int numA, int denA, int numB, int denB){
      int sumNum = (numA * denB) + (numB * denA);
      int sumDen = (denA * denB);
      return (sumNum + "/" + sumDen);
    }//end add





}
