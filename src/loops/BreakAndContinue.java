package loops;

public class BreakAndContinue {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {

      // Add your code below
      if (i % 5 != 0) {
        continue;
      }
      System.out.println(i);
    }
  }
}
//The break keyword is used to exit, or break, a loop.
//continue keyword can be placed inside of a loop if we want to skip an iteration.
