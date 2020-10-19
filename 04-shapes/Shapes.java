import java.until.*;

 public class Shapes{
   public static void main(String[] args){
     //Square//
     double Side  = 5.8;

     //Triangle//
     double TriB = 10.6;
     double TriH = 4.5;
     //double Half = 0.5;

     //variables holding the values//
     double Squ = square(Side);
     double Tri = triangle(TriB*TriH*0.5);

    //Print//
     System.out.println(Squ);
     System.out.println(Tri);
   }
     public static double square(double s){
       double Ans = s * s;
       return Ans;
     }

       public static double triangle(double B, double H){
         double Ans2 = B * H;
         return Ans2;
       }

 }
