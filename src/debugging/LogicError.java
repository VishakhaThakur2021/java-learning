package debugging;

public class LogicError {
  public static void main(String[] args) {

    int steps = 10;
    //program is supposed to output steps from #1 - #10. Find the logic error.
    for (int i = 0; i <= steps; i++) {

      System.out.println("Step #" + i);
    }
    }
}
