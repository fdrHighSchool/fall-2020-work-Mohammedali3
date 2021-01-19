import java.util.*;

public class AnimeDriver {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Random rand = new Random();
    Anime Anime1 = new Anime("One piece","Adventure","958/ongoing");
    Anime Anime2 = new Anime("Jujutsu Kaisen","Action","14/ongoing");
    Anime Anime3 = new Anime("Horimiya","Romance","3/ongoing");


    System.out.println("Do you want a anime recommendation? (Y/N)");
    String Ans = s.nextLine();
    if(Ans.equals("Y")){
      int randomInt = rand.nextInt(4);
      System.out.println("Do you want a Romance(Press 1),Adventure(Press 2) or Action(Press 3) anime?");
      int Ans1 = s.nextInt();
      if(Ans1 == 1){
        System.out.print(Anime1);
      }
      else if(Ans1 == 2){
       System.out.print(Anime2);
      }
      else{
        System.out.print(Anime3);
      }
    }
    else{
      System.out.print("Alright");
    }



  }
}
