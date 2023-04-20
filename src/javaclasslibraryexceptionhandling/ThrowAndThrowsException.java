package javaclasslibraryexceptionhandling;

//when we are sure that we will not get any error also if we don't to use try catch every time to handle error
//use throws keyword after method signature
//Throws keyword helps in suppress(hide) the exception not handle it
//Throw
public class ThrowAndThrowsException {
  public static void main(String[] args) {
    int i, j, k;
    i = 8;
    j = 0;
    k = 0;
    try {
      k = i + j;
      if (k < 10) {
        throw new ArithmeticException(); //forcefully adding our own exception
      }

    } catch (ArithmeticException e) { //always use main exception at the end of catch block
      System.out.println("Max value is 10"); // we can modify exception msg to show
    }
    System.out.println(k);
  }

}
