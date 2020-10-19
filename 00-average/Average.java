import java.util.*;


public class Average{
  public static void main(String[] args) {
    //ask for 3 test grades
    Scanner input = new Scanner(System.in);
    double sum = 0;
    int HMN = 0;
    int count = 0;
    System.out.print("How many numbers do you want to input? ");
    HMN = input.nextInt();


    while(HMN > count){
      System.out.print("Enter the number: ");
      sum += input.nextInt();
      count++;
    }

    //print statement to test that things are working!
    System.out.println(sum/count);
    //calculate the Average
    //output the data on the screen
  }//end main method
}//end class
