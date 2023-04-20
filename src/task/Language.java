package task;

public class Language {
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
    this.name = name;
    this.numSpeakers = numSpeakers;
    this.regionsSpoken = regionsSpoken;
    this.wordOrder = wordOrder;
  }


  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);

  }

  public static void main(String[] args) {
    Language call = new Language("Spanish", 555000000, "spain", "subject word order");
    Mayan calling=new Mayan("Ki'che'", 2330000);
    SinoTibetan called=new SinoTibetan("Chinese",655576467);
    call.getInfo();
    calling.getInfo();
    called.getname();
    called.getInfo();


  }


}
