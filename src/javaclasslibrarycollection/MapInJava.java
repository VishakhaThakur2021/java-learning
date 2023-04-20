package javaclasslibrarycollection;
/*
1.Maps store key value pairs. Both are objects.
2. keys in a map are effectively a set of keys, no duplicates.
3.The value can be any object and there is no restriction about duplication.
4.Iterating over map , call KeySet() method and iterate over set of keys.
5.call Values() method and iterate over collection.
6.call entrySet() and iterate over set of entries.
7.Map<Integer, String> value = new Hashtable<>();, Hashtable is use when we want to iterate map in synchronised way
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInJava {

  public static void main(String[] args) {
    //HashMap is a class which implements Map interface
    Map<Integer, String> value = new HashMap<>();
    value.put(201, "kim");
    value.put(202, "dim");
    value.put(203, "nim");
    value.put(204, "tim");
    Set<Integer> keys = value.keySet();//here KeySet() method helps to iterate keys from map and key type is Integer in generic
    for (Integer key : keys) { //here also we have to define key type as Integer
     //.get() helps to get values from key
      System.out.println(key + "  " + value.get(key));
    }

  }
}
