package javaclasslibraryannotation;

import java.util.ArrayList;

/*
@Override annotation assures that the subclass method is overriding the parent class method.
@SuppressWarnings annotation: is used to suppress warnings issued by the compiler.
@Deprecated annotation marks that this method is deprecated so compiler prints warning.
It informs user that it may be removed in the future versions. So, it is better not to use such methods.

 */
class Animal {
  void eatSomething() {
    System.out.println("eating something");
  }
  @Deprecated
  void method() {
    System.out.println("deprecated method");
  }
}


class Dog extends Animal {
  @Override
  void eatSomething() {
    System.out.println("eating foods");
  }



}

public class BuiltInAnnotation {
  public static void main(String args[]) {
    Animal a = new Dog();
    a.eatSomething();
    a.method();

    @SuppressWarnings("unchecked")
    ArrayList list = new ArrayList();
    list.add("red");
    list.add("green");
    list.add("yellow");

    for (Object obj : list)
      System.out.println(obj);

  }
}
