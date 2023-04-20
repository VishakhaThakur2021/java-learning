package staticvariableandmethod;

public class StaticVariable {
  // Static variables,we can access static variables by using the name of the class or object name and the . operator.
  public static int totalMoney = 0;
  // Instance variables
  public int money;

  //Constructor
  public StaticVariable(int inputMoney) {
    this.money = inputMoney;
  }

  //Method
  public void withdrawMoney(int amountToWithdraw) {
    if (amountToWithdraw <= this.money) {
      this.money -= amountToWithdraw;
    }
  }

  //Main method
  public static void main(String[] args) {
    // Step 1: Create your two ATMs here
    StaticVariable firstATM = new StaticVariable(1000);
    StaticVariable secondATM = new StaticVariable(500);
    // Step 3: Print your static variable in three different ways here
    System.out.println(StaticVariable.totalMoney);
    System.out.println(firstATM.totalMoney);
    System.out.println(secondATM.totalMoney);
  }
}
