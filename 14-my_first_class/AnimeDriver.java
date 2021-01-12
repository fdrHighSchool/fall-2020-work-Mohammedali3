public class AnimeDriver {
  public static void main(String[] args) {
    Anime weeb1 = new Anime("One piece");

    weeb1.setAnime("One piece"); //setter method (mutator)
    System.out.println(weeb1);

    System.out.println(weeb1.getAnime());
  }
}
