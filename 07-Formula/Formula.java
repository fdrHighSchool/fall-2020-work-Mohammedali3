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


    /*
    double cartesianDistance1 = cartesianDistance(X2,X1,Y2,Y1);
    System.out.print("The cartesian distance is " + cartesianDistance1);

    int taxicabDistance1 = abs(F2-F1);
    int taxicabDistance2 = abs(H2-H1);
    int taxicabDistance3 = taxicabDistance1 + taxicabDistance2;
    System.out.print("The taxicab distance is " + taxicabDistance3);
    */

  }
  public static double cartesianDistance(double A2, double A1, double B2, double B1){
    double Ans = Math.sqrt((A2-A1)*(A2-A1) + (B2-B1)*(B2-B1));
    return Ans;
  }
  public static int getX(String point){
    int comma = point.indexOf(",");
    String x = point.substring(1, comma);
    System.out.println(x);
    return Integer.parseInt(x);
  }
  public static int getY(String point){
    int comma = point.indexOf(",");
    int lbracket = point.indexOf(")");
    int Fy = comma + 1;
    String y = point.substring(Fy, lbracket);
    System.out.println(y);
    //Integer.parseInt(Fy);
    return Integer.parseInt(y);
  }
}//End of class
