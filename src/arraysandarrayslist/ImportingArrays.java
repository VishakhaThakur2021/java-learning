package arraysandarrayslist;

import java.util.Arrays;

public class ImportingArrays {


  public ImportingArrays() {
  }

  public String[] getTopics() {
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    return topics;
  }

  public static void main(String[] args) {
    ImportingArrays sample = new ImportingArrays();
    String[] topics = sample.getTopics();
    //converting array to string
    System.out.println(Arrays.toString(topics));
    //calling array with index
    System.out.println(topics[1]);
  }
}
