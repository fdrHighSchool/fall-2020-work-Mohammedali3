import java.util.Arrays;

public class Anime {
  // instance variables
  private String favAnime;
  private String[] randomAnime;//Holds different animes


  public Anime(String FA) {
    this.favAnime = FA;
    this.randomAnime = new String[]{"One piece","Naruto","Bleach","Log Horizon","Dororo","Demon Slayer","Fire force","Overlord","Black Clover","Attack on Titan","Jujutsu kaisen"};
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

  public pickRandom(){
    Random Anime = new Random();
    int index = Anime.nextInt(this.randomAnime.length);
    System.out.println(this.randomAnime[index]);
    return index;
  }

}// end class
