package javaclasslibrarycollection;
/*
1.A List is a collection where we can preserve the order of elements.
2.Like with arrays, we can assign elements at a specific position, we can retrieve elements from that position.
3.one of the implementations of List is the ArrayList,
4.LinkedLists are better structures when we want to do inserting into the middle or removing from the middle.
5.Vector in fact is a type of list, and Stack is a subclass of Vector adding the push and pop type methods
6.A ListIterator will let us go in both directions.
7.when we want to insert element at particular index , we use list which implements collection interface
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCollection {
  public static void main(String[] args) {
    List<Integer> values = new ArrayList<>();

    values.add(1);
    values.add(3);
    values.add(6);
    values.add(9);

    values.add(1, 8);
    Collections.sort(values);//list interface allows sorting of elements as well
    Collections.reverse(values);
    for (int i : values) {
      System.out.println(i);
    }

  }

}
