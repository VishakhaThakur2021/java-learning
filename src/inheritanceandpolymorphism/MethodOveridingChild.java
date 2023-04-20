package inheritanceandpolymorphism;

public class MethodOveridingChild extends MethodOveriding {
  MethodOveridingChild() {

    super(3.0, 1.5, "irregular", "eggs, flour, salt");
    this.texture = "lumpy and liquid";

  }

  @Override
  public void cook() {

    System.out.println("Grinding or scraping dough." + "Boiling.");

    this.texture = "cooked";

  }

  public void Dinner() {
    cook();//calling method present inside class
    super.Noodles(); //calling parent class method with super keyword
  }


}
