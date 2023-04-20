package accessencapsulation;

public class OtherPrivateMethodAccess {
  private String name;
  private int balance;
  private String id;
  private double interestRate;

  public OtherPrivateMethodAccess(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
  }


  public void getAccountInformation(){
    System.out.println("Money in account: " + this.getBalance());
    System.out.println("Next Month's Interest: " + this.calculateNextMonthInterest());

  }

  private int getBalance(){
    return this.balance;
  }
//we are able to access getAccountInformation() method from OtherPrivateMethod class, but not its private methods
  private double calculateNextMonthInterest(){
    this.balance*=interestRate;
    return this.interestRate * this.balance;
  }
}
