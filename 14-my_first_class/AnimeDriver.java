public class AnimeDriver {
  public static void main(String[] args) {
    Anime weeb1 = new Anime("Hello their my favorite anime is One piece");

    weeb1.setAnime("One piece"); //setter method (mutator)
    System.out.println(weeb1);

    System.out.println(weeb1.getAnime());
    System.out.print("Do you want a anime recommendation? (Y/N)")
    String yn = input.nextLine();
    if(yn.equals("Y")){
      Anime = pickRandom(randomAnime);
    }
    else{
      Sytem.out.print("Alright");
    }


  }
}
