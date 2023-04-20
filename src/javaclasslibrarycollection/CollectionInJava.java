package javaclasslibrarycollection;
/*1.one of the main limitation of array is its length is fixed
2.collection will grow to hold more elements automatically
3.collection rely on interfaces to provide common behaviour
3.three types of arrays are set,list and maps
a.sets-excludes duplicates
b.list-allows duplicates
c.maps- key value pair
4.A collection can hold any java object with use of generics we can specify what type of objects are being put inside collection
5.Interface Collection -->interface set --->interface sorted map and interface list
(this interfaces are not collection but often used while working with collection Interface comparator and Interface iterator)
6.Interface Map -->interface Map
*/


import java.util.ArrayList;
import java.util.Collection;

public class CollectionInJava {

  public static void main(String[] args) {
    //here collection is an interface which is implemented by List Interface is implemented by ArrayList class
    //using collection interface we can't put elements at particular index number that's why we use List inteface
    Collection values = new ArrayList();
    values.add(8);
    values.add("string");
    System.out.println(values);

  }
}
