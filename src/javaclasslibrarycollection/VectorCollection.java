package javaclasslibrarycollection;
//vector increase the capacity of container dynamically like it almost double the container
import java.util.ArrayList;
import java.util.Vector;

public class VectorCollection {

  public static void main(String[] args){
    ArrayList<Integer> val =new ArrayList<>();//increase capacity by 50%,saving memory
    Vector<Integer> value=new Vector();//increase capacity by 100%,waste of memory ,vectors doesn't use in projects
    value.add(1);
    value.add(2);
    value.add(3);
    value.add(4);
    value.add(5);
    for(int i:value){
      System.out.println(i);
    }
    System.out.println(value.capacity()); //increased capacity by 10
  }
}
