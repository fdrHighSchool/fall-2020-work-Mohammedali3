import java.util.Random;
import java.util.Scanner;

//Importing random and scanner//
public class randomGuessing {

  public static void main(String[] args) {
    Random num = new Random();
    int Answer  = num.nextInt(11);
    int NumOfGuess = 0;
    //setting answer to the random number picked//
    Scanner in = new Scanner(System.in);
    //Use of scanner//
    int UserGuess;
    //settign the userGuess to a int//
    boolean correct = false;
    //So I can use the while loop//

    if (Answer%2 == 0){
     System.out.print("The number is even");
    }
    else{
      System.out.print("The number is odd");
    }
    //this is for odd or even//








    while(correct == false){
      System.out.println(" Pick number between 1-10");
      UserGuess = in.nextInt();
      NumOfGuess++;
      //The use of if and else statements//
      if (UserGuess == Answer){
       correct = true;
       System.out.print("You got it good job! ");
      }
      else if(UserGuess > Answer){
        System.out.print("Its to high, guess again! ");
      }
      else if(UserGuess < Answer){
       System.out.print("Its to low, guess again! ");
      }




    }

    System.out.println("It took you " + NumOfGuess + " tires");


  }

}
