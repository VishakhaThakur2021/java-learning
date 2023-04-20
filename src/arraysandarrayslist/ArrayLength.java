package arraysandarrayslist;

import java.util.Arrays;

public class ArrayLength {
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};

  public ArrayLength(){

  }

   public String[] getTopics(){
     return topics;
   }

  public int getNumTopics(){
    return topics.length;

  }

  public static void main(String[] args){
    ArrayLength sampleFeed = new ArrayLength();
    System.out.println("The number of topics is "+ sampleFeed.getNumTopics());
    System.out.println(Arrays.toString(sampleFeed.getTopics()));
  }
}
