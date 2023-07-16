import java.util.ArrayList;

public class SongsIsEmpty {
  public static void main(String[] args) {
    ArrayList<String> songs = new ArrayList<String>();
    songs.add("Unholy");
    songs.add("Deathbed");
    songs.add("Kadhal_sadugudu");
    songs.add("Until i found you");
    System.out.println(songs);
    if(songs.isEmpty())
    System.out.println("array is empty");
    else
    System.out.println("array is not empty");
  }
}
