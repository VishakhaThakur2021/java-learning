package accessencapsulation;
//If we wanted to access the instance variable and not the local variable, we could use the this keyword.

public class ThisKeyword {
  public String owner;
  public int balanceDollar;
  public double balanceEuro;

  public ThisKeyword(String owner, int balanceDollar) {
    this.owner = owner;
    this.balanceDollar = balanceDollar;
    this.balanceEuro = balanceDollar * 0.85;

  }

  public void addMoney(int balanceDollar) {
    System.out.println("Adding " + balanceDollar + " dollars to the account.");
    this.balanceDollar += balanceDollar;
    System.out.println("The new balance is " + this.balanceDollar + " dollars.");
  }

  public static void main(String[] args) {
    ThisKeyword zeusSavingsAccount = new ThisKeyword("Zeus", 1000);

    zeusSavingsAccount.addMoney(2000);

  }

}
