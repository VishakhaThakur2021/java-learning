package debugging;

public class RuntimeError {
  public static void main(String[] args) {

    int width = 0;//runtime error
    int length = 40;
    int ratio = length / width;
    System.out.println(ratio);

  }
  /*
  ArithmeticException:
  Something went wrong during an arithmetic operation; for example, division by zero.
  NullPointerException:
  You tried to access an instance variable or invoke a method on an object that is currently null.
  ArrayIndexOutOfBoundsException:
  The index you are using is either negative or greater than the last index of the array (i.e., array.length-1).
  FileNotFoundException:
  Java didn’t find the file it was looking for.
   */
}
