package arraysandarrayslist;

import java.util.Arrays;

public class EmptyArray {
  //String[] menuItems = new String[5]; declaring empty array

  String[] favoriteArticles;

  public EmptyArray() {
    favoriteArticles = new String[10];
  }

  public void setFavoriteArticle(int favoriteIndex, String newArticle) {
    favoriteArticles[favoriteIndex] = newArticle;  //menuItems[0] = "Veggie hot dog"; assigning array value
  }

  public static void main(String[] args) {
    EmptyArray sampleFeed = new EmptyArray();

    sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
    sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
    sampleFeed.setFavoriteArticle(0, "Oil News");

    System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
  }
}
