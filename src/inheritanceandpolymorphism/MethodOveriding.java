package inheritanceandpolymorphism;

public class MethodOveriding {
  protected double lengthInCentimeters;
  protected double widthInCentimeters;
  protected String shape;
  protected String ingredients;
  protected String texture = "brittle";

  MethodOveriding(double lenInCent, double wthInCent, String shp, String ingr) {

    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;

  }

  public void cook() {

    System.out.println("Boiling.");

    this.texture = "cooked";

  }
  public void Noodles() {
    System.out.println("Noodles ready" + this.texture);
  }

  public static void main(String[] args) {

    MethodOveridingChild kaesespaetzle = new MethodOveridingChild();
    kaesespaetzle.cook();

  }
}
