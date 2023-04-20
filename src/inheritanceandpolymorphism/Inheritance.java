package inheritanceandpolymorphism;

public class Inheritance {
  double lengthInCentimeters;
  double widthInCentimeters;
  String shape;
  String ingredients;
  String texture = "brittle";

  public Inheritance(double lenInCent, double wthInCent, String shp, String ingr) {

    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;

  }

  public void cook() {

    this.texture = "cooked";

  }

  public static void main(String[] args) {
    InheritanceChildClass phoChay = new InheritanceChildClass();

    System.out.println(phoChay.shape);


  }
}
