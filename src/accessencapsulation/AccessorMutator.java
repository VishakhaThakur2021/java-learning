package accessencapsulation;

//To give other classes access to a private instance variable,
// we would write an accessor method (sometimes also known as a “getter” method).

public class AccessorMutator {
  private GetterSetter accountOne;
  private GetterSetter accountTwo;

  public AccessorMutator() {
    accountOne = new GetterSetter("Zeus", 100, "1");
    accountTwo = new GetterSetter("Hades", 200, "2");
  }

  public static void main(String[] args) {
    AccessorMutator bankOfGods = new AccessorMutator();
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
  }
}
