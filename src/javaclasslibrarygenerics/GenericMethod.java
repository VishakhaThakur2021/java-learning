package javaclasslibrarygenerics;
//Generic method is used to store any type of array represented with E[] and <E> before return type of  method.
public class GenericMethod {
  public <E> void printArray(E[] s){
    for(E x:s){
      System.out.println(x);
    }
  }


  public static void main(String[] args){
    GenericMethod hello=new GenericMethod();
    String [] colour =new String[]{"red","green","yellow"};
    Integer[] number =new Integer[]{1,2,3,4,5,6,7};
    hello.printArray(colour);
    hello.printArray(number);







  }
}
