package accessencapsulation;

public class GetterSetter {
  private String name;
  private int balance;
  private String id;

  public GetterSetter(String inputName, int inputBalance, String inputId) {
    name = inputName;
    balance = inputBalance;
    id = inputId;
  }

  //get private instance variable
  public int getBalance() {
    return balance;

  }

  //set private instance variable
  public void setBalance(int newBalance) {
    balance = newBalance;

  }
}
