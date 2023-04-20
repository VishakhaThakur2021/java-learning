package loops;

import java.util.ArrayList;

public class ForLoop {

  public static void main(String[] args) {
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(34.55);
    expenses.add(23.82);
    expenses.add(19.24);
    double total = 0;

    for (int i = 0; i < expenses.size(); i++) {
      total = total + expenses.get(i);
    }
    System.out.println(total);

  }
}
