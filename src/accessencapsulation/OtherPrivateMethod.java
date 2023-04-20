package accessencapsulation;

public class OtherPrivateMethod {
  private OtherPrivateMethodAccess accountOne;
  private OtherPrivateMethodAccess accountTwo;

  public OtherPrivateMethod() {
    this.accountOne = new OtherPrivateMethodAccess("Zeus", 100, "1");
    this.accountTwo = new OtherPrivateMethodAccess("Hades", 200, "2");
  }

  public static void main(String[] args) {
    OtherPrivateMethod bankOfGods = new OtherPrivateMethod();
    bankOfGods.accountOne.getAccountInformation();
     //You should see an error
    //since you’re trying to use a Bank to call a private method from a CheckingAccount.
    //bankOfGods.accountOne.calculateNextMonthInterest();
  }
}
