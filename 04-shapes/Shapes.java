
 public class Shapes{
   public static void main(String[] args){
//----------------------------------------------------------//
     //Square//
     double Side  = 5.8;

     //Triangle and prism//
     double TriB = 10.6;
     double TriH = 4.5;
     double TriL = 8;

     //Circle//
     double rai = 4;
     double Pi = Math.PI;

     //Cube//
     double cubeedge = 10;

     //Sphere//
     double fra = 4/3;
     double raiSphere = 6;

     //rectangualr prism//
     double W = 9;
     double H = 10;
     double L = 14;
//----------------------------------------------------------//
     //variables holding the values//
     double Squ = square(Side);
     double Tri = triangle(TriB,TriH*0.5);
     double TriPrism = triangle(TriB,TriH*0.5*TriL);
     double Cir = Circle(Pi,rai);
     double cub = Cube(cubeedge);
     double Sp = Sphere(fra,Pi,raiSphere);
     double rectangualrP = rectangualr(W,H,L);

//----------------------------------------------------------//
    //Print//
     System.out.println("The area of the square is " + Squ);
     System.out.println("The area of the triangle is " + Tri);
     System.out.println("The area of the Circle is " + Cir);
     System.out.println("The volume of a triangular Prism is " + TriPrism);
     System.out.println("The Volume of a Cube is " + cub);
     System.out.println("The Volume of a Sphere is " + Sp);
     System.out.println("The Volume of a rectangualr prism is " + rectangualrP);
   }

//----------------------------------------------------------//
//This is where i am calculating the area of a square//
     public static double square(double s){
       double Ans = s * s;
       return Ans;
     }

//----------------------------------------------------------//
//This is where i am calculating the area of a triangle//
       public static double triangle(double B, double H){
         double Ans2 = B * H;
         return Ans2;
       }

//----------------------------------------------------------//
//This is where i am calculating the area of a circle//
      public static double Circle(double pi, double R){
        double Ans3 = pi * R * R;
        return Ans3;
      }

//----------------------------------------------------------//
//This is where i am calculating the Volume of a cube//
      public static double Cube(double E){
        double Ans4 = E * E * E;
        return Ans4;
      }
//----------------------------------------------------------//
//This is where i am calculating the voume of a sphere//
      public static double Sphere(double fraction, double Pie, double Ra){
        double Ans5 = fraction*Pie*Ra*Ra*Ra;
        return Ans5;
      }
//----------------------------------------------------------//
//This is where i am calculating the volume pf a rectangular prism//
      public static double rectangualr(double W, double H, double L){
        double Ans6 = W*H*L;
        return Ans6;
      }
 }
