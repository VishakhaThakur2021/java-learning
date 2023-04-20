package task;


public class SinoTibetan extends Language {

  public SinoTibetan(String name, int numSpeakers) {


    super(name, numSpeakers, "Asia", "subject-object-verb");
  }

  @Override
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);

  }

  //name is protected , created get method to access it in child class
  public String getname() {
    if (name.contains("Chinese")) {
      this.wordOrder = "subject-verb-object-chinese";

    }
    return name;
  }

}




