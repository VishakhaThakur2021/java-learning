package inheritanceandpolymorphism;

public class ParentClassAccessModifier {
  private double lengthInCentimeters;
  private double widthInCentimeters;
  private String shape;
  protected String ingredients; // this instance variable is set to protected so that child class can access
  private String texture = "brittle";

  ParentClassAccessModifier(double lenInCent, double wthInCent, String shp, String ingr) {

    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;

  }
// To avoid child class overriding this method will use Final keyword
  public final boolean isTasty() {
    return true;
  }

  public static void main(String[] args) {

    ChildClassAccessModifier yasaiRamen = new ChildClassAccessModifier();
    System.out.println(yasaiRamen.ingredients);
    System.out.println(yasaiRamen.isTasty());

  }
}
