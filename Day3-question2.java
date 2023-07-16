import java.util.ArrayList;

public class SongsRemove {
  public static void main(String[] args) {
    ArrayList<String> songs = new ArrayList<String>();
    songs.add("Unholy");
    songs.add("Deathbed");
    songs.add("Kadhal_sadugudu");
    songs.add("Until i found you");
    System.out.println("Before removing->"+songs);
    songs.remove("Kadhal_sadugudu");
    System.out.println("after removing->"+songs);
  }
}
