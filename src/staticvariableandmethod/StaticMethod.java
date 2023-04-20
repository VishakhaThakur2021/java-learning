package staticvariableandmethod;

public class StaticMethod {
  // Static variables
  //Both static methods and non-static methods can interact with static variables.
  public static int totalMoney = 0;
  public static int numATMs = 0;

  // Instance variables
  //Static methods cannot interact with non-static instance variables.
  // This is due to static methods not having a reference.
  public int money;

  public StaticMethod(int inputMoney) {
    this.money = inputMoney;
    numATMs += 1;
    totalMoney += inputMoney;
  }

  public void withdrawMoney(int amountToWithdraw) {
    if (amountToWithdraw <= this.money) {
      this.money -= amountToWithdraw;
      totalMoney -= amountToWithdraw;
    }
  }

  // Static method averageMoney()
  public static void averageMoney() {
    System.out.println(totalMoney / numATMs);
    //A static method can’t interact with a non-static instance variable.
    // System.out.println(this.money); this line will throw error

  }

  public static void main(String[] args) {

    System.out.println("Total number of ATMs: " + StaticMethod.numATMs);
    StaticMethod firstATM = new StaticMethod(1000);
    StaticMethod secondATM = new StaticMethod(500);
    System.out.println("Total number of ATMs: " + StaticMethod.numATMs);

    System.out.println("Total amount of money in all ATMs: " + StaticMethod.totalMoney);
    firstATM.withdrawMoney(500);
    secondATM.withdrawMoney(200);
    System.out.println("Total amount of money in all ATMs: " + StaticMethod.totalMoney);

    // Call averageMoney() here
    StaticMethod.averageMoney();
  }
}
