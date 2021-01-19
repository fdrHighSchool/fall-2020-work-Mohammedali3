import java.util.Arrays;
import java.util.Random;

public class Anime {
  // instance variables
  private String Name;
  private String Genre;
  private String Episodes;

  public Anime(String n, String g, String e) {
    this.Name = n;
    this.Genre = g;
    this.Episodes = e;
  }//end constructor

  public String getName() {
    return this.Name;
  }//end getName method

  public String getGenre() {
    return this.Genre;
  }//end getGenre method

  public String getEpisodes() {
    return this.Episodes;
  }//end getEpisodes method

  public String toString() {
    return "Recommendation: " + this.Name +" "+ "Genre: " + this.Genre +" "+ " Episodes: " + this.Episodes;
  }//end toString method



}// end class
