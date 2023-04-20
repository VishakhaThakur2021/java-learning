package javaclasslibrarycollection;

/*
1.if we want to sort a collection ,use comparable
2.every class need to have comparable to sort the value
3.Two case for using Comparator
if we want to sort parameter with our own logics , we use comparator
when we have a class which doesn't implementing comparable then we use comparator
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableInJava {


  public static void main(String[] args) {

    List<LaptopImplementsComparable> laps = new ArrayList<>();
    laps.add(new LaptopImplementsComparable("Dell", 16, 800));
    laps.add(new LaptopImplementsComparable("Apple", 8, 1200));
    laps.add(new LaptopImplementsComparable("Acer", 12, 300));

    //comparator interface ,so we cannot get object of that,so we create this anonymous in a class
    Comparator<LaptopImplementsComparable> com = new Comparator<LaptopImplementsComparable>() {
      @Override
      //anonymous in a class
      public int compare(LaptopImplementsComparable o1, LaptopImplementsComparable o2) {
        if (o1.getPrice() > o2.getPrice())
          return 1;
        else
          return -1;
      }
    };

    Collections.sort(laps, com); //used to sort values via comparable or comparator
    for (LaptopImplementsComparable l : laps) {
      System.out.println(l);
    }


  }
}
