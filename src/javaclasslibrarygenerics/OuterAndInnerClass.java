package javaclasslibrarygenerics;

class OuterClass {
  int a;

  public void show() {

  }


  class InnerClass {
    int a;
    static int b;

    public void show() {

    }


  }
}


public class OuterAndInnerClass {


  public static void main(String[] args) {
    OuterClass outerObject = new OuterClass();
    //Innerclass present inside outer class can be called with OuterClass.InnerClass
    // To access any variable and method inside inner class we need to call with object of outer class as outerObject.new InnerClass()
    OuterClass.InnerClass innerObject = outerObject.new InnerClass();
    outerObject.show();
    innerObject.show();


  }
}
