package javaclasslibrarygenerics;

import java.util.ArrayList;
import java.util.List;

//1.You can write generic code without losing type safely
//2.Provides way to declare types of object in container
//3.Allows compile-type checking and helps to avoid runtime type casting exceptions
//4.Widely used in collection framework
//5.generics doesn't work with primitive data types like int,float,boolean ,char
//6.generic class declaration has type parameter section as <T>
//7.generic class and method can have one or more type parameter separated by comma

public class Generics<T> {
  public void add(T data) { //with T as generic data type ,it can accept any type of array value
    System.out.println(data);
  }

  public static void para(List<?> myList) { //wildcard generic is used when type of array in list not defined
    System.out.println(myList);

  }


  public static void main(String[] args) {
    Generics hello = new Generics();
    //Generics define what type of data we are passing to a collection
    List<Integer> number = new ArrayList<Integer>(); //generics are defined using angle brackets
    List<String> str = new ArrayList<>();
    number.add(1);
    Generics.para(number);
    str.add("yes");
    System.out.println(str);


  }

}
