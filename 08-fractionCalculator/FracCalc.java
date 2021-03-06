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
     * detachExperssion - This function takes a String 'input' and produces the result.
     * @param input - A fraction string that needs to be evaluated.  For your program, this will be the user input.
     *      Example: input ==> "1/2 + 3/4"
     * @return the result of the fraction after it has been calculated.
     *      Example: return ==> "1_1/4"
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

      String allParts = "";
      String Ans = "";
      int num, den, num2, den2;

      if(secondEqu.equals("0") && Oper.equals("/")){//Makes it so you can't put a zero for the second number when dividing
        String error = "This is invalid input please try again";
        return error;
      }

      if (check1 != -1){//If check is -1 that means there is _ in the fraction
        num = convertToImproper(firstEqu, check1, Slash1);
        den = getDenominator(firstEqu, Slash1);
      }

      else if ((check1 == -1) && (Slash1 != -1)){// _ is not in the fraction but / is
        num = Integer.parseInt(firstEqu.substring(0, Slash1));
        den = Integer.parseInt(firstEqu.substring(Slash1 + 1));
      }

      else{//If there is no _ and / in the fraction it prints the first/second num as it is
        num = Integer.parseInt(firstEqu);
        den = 1;
      }

      if(check2 != -1){//If check is -1 that means there is _ in the fraction
        num2 = convertToImproper(secondEqu, check2, Slash2);
        den2 = getDenominator(secondEqu, Slash2);
      }

      else if ((check2 == -1) && (Slash2 != -1)){// _ is not in the fraction but / is
        num2 = Integer.parseInt(secondEqu.substring(0, Slash2));
        den2 = Integer.parseInt(secondEqu.substring(Slash2 + 1));
      }

      else{//If there is no _ and / in the fraction it prints the first/second num as it is
        num2 = Integer.parseInt(secondEqu);
        den2 = 1;
        String both = num2 + "/" +den2;
      }

      if(den == 0 || den2 == 0){//Makes it so you can't put 0 for the denominator
        String error = "This is invalid input please try again";
        return error;
      }


      if (Oper.equals("+") ){
        Ans = add(num,den,num2,den2);
      }

      else if (Oper.equals("-") ){
        Ans = subtract(num,den,num2,den2);
      }

      else if (Oper.equals("*") ){
        Ans = multiply(num,den,num2,den2);
      }

      else if (Oper.equals("/") ){
        Ans = divide(num,den,num2,den2);
      }

      else{
        System.out.println("Please enter a valid input");
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
      return Ans;
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
      int minimum = 1;
      int gcd = 1;
      if(a < 0){//This is in case the number is negative makes it so the number is being passed into my CTM
        a *= -1;
      }
      if(b < 0){//This is in case the number is negative makes it so the number is being passed into my CTM
        b *= -1;
      }
      //Finds min of a and b
      if (a > b){
        minimum = b;
      }
      else if (a < b){
        minimum = a;
      }
      else{
        return a;
      }
      //finds the gcd
      for (int i = 1; i <= minimum; i++){
        if (a % i == 0 && b % i == 0){
          gcd = i;
        }
      }
      return gcd;
    }//end greatestCommonDivisor method

    /*
    * Name: simp
    * Purpose: return simplifed version of the fraction
    * Input: Num, den, and GCD
    * Return: The simplifed version of the fraction
    */
    public static String simp(int gcf, int num, int den){
      String simpAns = "";
      int simpNum = num/gcf;
      int simpDen = den/gcf;
      simpAns = simpNum + "/" + simpDen;
      if(num > den){
        String conAns = CTM(simpNum,simpDen);
        return conAns;
      }
      if(simpDen == 1){
        return String.valueOf(simpNum);
      }
      if(simpNum == 0){
        return String.valueOf(0);
      }
      return simpAns;
    }

    /*
    * Name: CTM
    * Purpose: Makes mixed
    * Input: Num, Den
    * Return: The mixed fraction
    */
    public static String CTM(int num, int den){
      int whole = num / den; //find whole number
      int newNum = num % den; //find numerator
      String result = whole + "_" + newNum + "/" + den; //organizes makes it look like A_C/D

      if(newNum == 0 && den == 1){
        String newResult = "" + whole;
        return newResult;
      }

      return result; //return the result
    }


    /**
     * leastCommonMultiple - Find the smallest integer that can be evenly divided by two integers.
     *      Use this helper method in Checkpoint 3 to evaluate expressions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The LCM.
     */
    //Didn't use this method because I did not really need it
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
      int simplify = greatestCommonDivisor(sumNum,sumDen);
      String simpAns3 = simp(simplify,sumNum,sumDen);
      return simpAns3;
    }//end add

    /*
    * Name: subtract
    * Purpose: subtracts the two fraction
    * Input: the two fractions
    * Return: the result after subtracts
    */
    public static String subtract(int numA, int denA, int numB, int denB){
      int sumNum = (numA * denB) - (numB * denA);
      int sumDen = (denA * denB);
      int simplify = greatestCommonDivisor(sumNum,sumDen);
      String simpAns3 = simp(simplify,sumNum,sumDen);
      return simpAns3;
    }//end subtract

    /*
    * Name: multiply
    * Purpose: multiply the two fraction
    * Input: the two fractions
    * Return: the result after multiplying
    */
    public static String multiply(int numA, int denA, int numB, int denB){
      int sumNum = (numA*numB);
      int sumDen = (denA*denB);
      int simplify = greatestCommonDivisor(sumNum,sumDen);
      String simpAns3 = simp(simplify,sumNum,sumDen);
      return simpAns3;
    }//end multiply

    /*
    * Name: divide
    * Purpose: divide the two fraction
    * Input: the two fractions
    * Return: the result after dividing
    */
    public static String divide(int numA, int denA, int numB, int denB){
      int sumNum = (numA*denB);
      int sumDen = (denA*numB);
      int simplify = greatestCommonDivisor(sumNum,sumDen);
      String simpAns3 = simp(simplify,sumNum,sumDen);
      return simpAns3;
    }//end divide




}
