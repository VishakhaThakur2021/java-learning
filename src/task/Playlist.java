package task;
import java.util.ArrayList;

public class Playlist {
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist =new ArrayList<String>();
    desertIslandPlaylist.add("song");
    desertIslandPlaylist.add("song2");
    desertIslandPlaylist.add("song3");
    desertIslandPlaylist.add("song4");
    System.out.println(desertIslandPlaylist.size());
    String song=desertIslandPlaylist.remove(0);
    System.out.println(song);
    System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.set(0,"song4");
    desertIslandPlaylist.set(2,"song1");
    System.out.println(desertIslandPlaylist);

  }

}
