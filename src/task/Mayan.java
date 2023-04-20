package task;

public class Mayan extends Language {

  public Mayan(String name, int numSpeakers) {
    // this.regionsSpoken="Central America";
    // this.wordOrder="verb-object-subject";
    super(name, numSpeakers, "Central America", "verb-object-subject");
  }

  @Override
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);

  }

}
