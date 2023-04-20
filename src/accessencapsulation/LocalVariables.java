package accessencapsulation;

public class LocalVariables {
  public static void main(String[] args) {

    int[] myArray = {1, 2, 3, 4};
    int sum = 0;
    for (int i = 0; i < myArray.length; i++) {
      //code won't run if int sum = 0; declared here
      //if we have a variable declared inside a method,that variable can only be used inside that method.
      sum += myArray[i];
    }
    System.out.println(sum);
  }
}
