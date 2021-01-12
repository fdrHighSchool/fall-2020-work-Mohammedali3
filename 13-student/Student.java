import java.util.*;
public class Student {
  // instance variables
  private String name;
  private String osis;
  private int[] grades;
  Scanner input = new Scanner(System.in);

  //------------------------------------------------//

  // constructor
  public Student(String n, String o) {
    this.name = n;
    this.osis = o;
    grades = new int[10];
  }//end constructor method

  //------------------------------------------------//

  // other methods
  public String getName() {
    System.out.print("Please enter your name: ");
    String holdsName = input.nextLine();
    return holdsName;
  }//end getName method


  public String getOSIS() {

    return "";
  }//end getOSIS method


  public void setName(String name) {
    this.name = name;

  }//end setName method

  /*
   * N: addGrade
   * P: take-in a single grade and add it to the student's gradebook.
        should find the first non-zero index in the array and insert the grade
        there. if there is no room for that value, replace the lowest grade in
        array with it.
   * I: grade (int)
   * R: n/a
   */
  public void addGrade(int grade) {
    

  }//end addGrade method


  public double calculateAverage() {
    int sum = 0;
    for (int grades : arr) {
      sum += grades;
    }
    return (double)sum / arr.length;
  }//end calculateAverage() method

  /*
   * Returns the String representation of a Student.
   * Right now, we are choosing to display the student's name and OSIS.
   * NOTE: This method overrides the default toString method that
   *       displays the memory address.
   */
  public String toString() {
    return "Student: " + this.name + " OSIS: " + this.osis;

  }//end toString method


}//end class
