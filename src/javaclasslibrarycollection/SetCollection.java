package javaclasslibrarycollection;
/*
1.Set is a collection which allows no duplicates
2.When extracting set via loop there's no guarantee that you will receive them in same order as you have added them to set
3.The implementing classes of set is HashSet,linkedHashSet and TreeSet
4.You can use set when order of element is not important
5.It is preferable to use Sets because they are faster than collection.
6.Iterator interface provides simple methods for accepting the elements of a container from first to last
7.two important methods are next() and hasNext()
8.hasNext()->returns true or false based on whether there is another element in the container
9.next() retrieves next element in the container.
 */

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

  public static void main(String[] args){
    Set<Integer> values =new HashSet<>(); //elements are random when we print them not sorted
    Set<Integer> val =new TreeSet<>(); //elements are  sorted



  }
}
