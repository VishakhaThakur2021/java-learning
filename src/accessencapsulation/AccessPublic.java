package accessencapsulation;

public class AccessPublic {
  private CheckingAccount accountOne;  //don't understand
  private CheckingAccount accountTwo;

  public AccessPublic(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    AccessPublic bankOfGods = new AccessPublic();
    System.out.println(bankOfGods.accountOne.name);
    bankOfGods.accountOne.addFunds(5);
    bankOfGods.accountOne.getInfo();

  }


}
