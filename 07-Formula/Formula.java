import java.util.Scanner;
public class Formula{
  public static void main(String[] args){
    Scanner a = new Scanner(System.in);

    System.out.print("Please enter the 1 point: ");
    String point1 = a.nextLine();


    System.out.print("Please enter the 2 point: ");
    String point2 = a.nextLine();

    int x1 = getX(point1);
    int x2 = getX(point2);
    int y1 = getY(point1);
    int y2 = getY(point2);


    cartesianDistance(x1, x2, y1, y2);
    taxicabDistance(x1, x2, y1, y2);

  }//End of class main

  public static void cartesianDistance(int x1, int x2, int y1, int y2){
    double Ans = Math.sqrt(Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2));
    System.out.println("The cartesianDistance is:  " + Ans);
  }//End of cartesianDistance

  public static void taxicabDistance(int x1, int x2, int y1, int y2){
    double Ans2 = Math.abs(x2 - x1) + Math.abs(y2 - y1);
    System.out.print("The taxicabDistance is: " + Ans2);
  }//End of taxicabDistance

  public static int getX(String point){
    int comma = point.indexOf(",");
    String x = point.substring(1, comma);
    //System.out.println(x);
    return Integer.parseInt(x);
  }//End of getX

  public static int getY(String point){
    int comma = point.indexOf(",");
    int lbracket = point.indexOf(")");
    String y = point.substring((comma + 2), lbracket);
    //System.out.println(y);
    return Integer.parseInt(y);
  }//End of getY
}//End of class
