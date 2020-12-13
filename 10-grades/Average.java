import java.util.*;


public class Average{
  public static void main(String[] args) {
    //ask for 3 test grades
    Scanner input = new Scanner(System.in);
    int numsEntered = 0;
    int howMany = 0;
    int count = 0;
    int j = 0;
    double total = 0;
    double average = 0;
    boolean yes = true;
    System.out.print("How many numbers do you want to input? ");
    howMany = input.nextInt();
    int arr[] = new int[howMany];

    while(howMany > count){
      System.out.print("Enter the number: ");
      numsEntered = input.nextInt();
      arr[j] = numsEntered;
      j++;
      count++;
    }
    //System.out.println(Arrays.toString(arr));

    for (int i = 0; i < arr.length; i++) {
      total += arr[i];
      average = total/arr.length;
    }
    System.out.println(average);


    int maxNum = 0;
    int maxShowen = 0;

    for(int i = 0; i < arr.length; i++){
      int count2 = 0;
      for( int h = 0; h < arr.length; h++){
        if(arr[i] == arr[h]){
          count2++;
        }
      }
      if(count2 > maxShowen){
        maxNum = arr[i];
        maxShowen = count2;
      }
    }
    System.out.println(maxNum);



  }//end main method
}//end class


//To get mode
// I would use use a lose to try to get my numbers in increasing order
// I would then Make another loop checking which number is repeated the most
