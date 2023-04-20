package javaclasslibrarygenerics;

public class StackArray {

  public static void main(String[] args) {



    Stack array = new Stack();
    array.push(1);
    array.push(2);
    array.push(3);
    array.push(4);
    array.push(5);


    array.show();
    System.out.println(array.pop());
    System.out.println(array.peek());
    System.out.println("size is " + array.size());
    System.out.println("Empty =" + array.isEmpty());
  }
}
