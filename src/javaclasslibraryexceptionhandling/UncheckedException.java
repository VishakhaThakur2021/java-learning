package javaclasslibraryexceptionhandling;
/*1.Throwable is class which have two subclasses as Exception and Error
2.Exceptions can be handled , we have two types of exception
a) Checked (EX-IO exception,SQL exception)
b) Unchecked exceptions(EX-Run time exception(subclass-ArithmeticException),ArrayIndexOutOfBoundsException,FileNotFoundException)
3.throws exceptions is like sending the request above the stack to handle.
a(){
b()
}
b(){
c()
}
c(){
}
4.Error can't be handled . Example -memory is leaking from jvm
 */

public class UncheckedException {

  public static void main(String[] args) {
    int i, j, k;
    i = 8;
    j = 2;
    k = 0;
    int a[] = new int[4];
    try {
      k = i / j;
      for (int c = 0; c <= 4; c++) {
        a[c] = c + 1;
      }
      for (int value : a) {
        System.out.println(value);
      }
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Max size of array is 4" );
    }
    catch (Exception e) { //always use main exception at the end of catch block
      // System.out.println(e);
      System.out.println("can't divide by zero" + e);
      System.out.println("can't divide by zero"); // we can modify exception msg to show
    }
    System.out.println(k);
  }

}
