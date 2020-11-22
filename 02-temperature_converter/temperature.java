import java.util.Scanner;

//Importing scanner//
public class temperature {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double Var = 1.8;
    double Var2 = 32;

    //The variable on top is 9/5 and 32 I made a variable for that is it's easier for me to do the math when the time comes
    System.out.print("Please input the celsius you would like converted? ");
    double Convert = input.nextint();

    //double Ans = Math.round(Var*Convert+Var2);
    double Ans = Var*Convert+Var2;
    System.out.println(Ans);




  }

}
