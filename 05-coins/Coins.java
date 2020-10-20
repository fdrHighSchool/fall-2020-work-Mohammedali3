//Nicholas, Mohammed, Alan

import java.util.*;
//imports everything
public class Coins{
  class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = in.next();

    int coins = 500;
    String playAgain = "y";        //all the variables for the code are made here.
    String option = "";
    String option2 = "";


    System.out.println("welcome to our coin game, " + name + "\nyour starting coin amount is: " + coins);
    System.out.println("");

    //We are using the while loop here and making the user choose
    while (playAgain.equals("y")) {

      System.out.println(" do you want to: \n play \n shop \n quit");
      option = in.next();
      //Stores answer in option

      if (option.equals("play")) {     //if you play, you get 50 coins
        coins += 50;
        System.out.print("you won and gained 50 coins!!! ");
        System.out.println("your coin total is: " + coins);
        System.out.println("");
      }
      else if (option.equals("shop")) {    //if you go to the chat, you can either pick to buy the sword or the armor.
        System.out.println("do you want to buy the armor for 100 coins or the sword for 50?");
        option2 = in.next();

        if (option2.equals("armor")) {     //armor costs 100 coins
          coins -= 100;
          if (coins < 0) {
            System.out.println("you do not have enough coins to buy armor.");
            System.out.println("");
          }
          else {
            System.out.println("you picked armor \n your coin total now is: " + coins);
            System.out.println("");
          }
        }
        else if (option2.equals("sword")) {    //sword costs 50 coins
          coins -= 50;
          if (coins < 0) {
            System.out.println("you do not have enough coins to buy the sword");
            System.out.println("");
          }
          else {
            System.out.println("you picked the sword. \n your coin total now is: " + coins);
            System.out.println("");
          }
        }
      }
      else {
        playAgain = "quit";   //option to quit and break the code.

        }
      }
    }
  }
}
