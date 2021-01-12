import java.util.Arrays;

public class Anime {
  // instance variables
  private String favAnime;

  public Anime(String FA) {
    this.favAnime = FA;
  }//end constructor


  public String getAnime(){
    return this.favAnime;
  }

  public void setAnime(String favAnime) {
    this.favAnime = favAnime;
  }


  public String toString() {
    return "Favorite anime: " + this.favAnime;
  }//end toString method

}// end class
