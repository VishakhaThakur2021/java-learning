package inheritanceandpolymorphism;

public class ChildClassesInArrayAndArrayList {
  protected double lengthInCentimeters;
  protected double widthInCentimeters;
  protected String shape;
  protected String ingredients;
  protected String texture = "brittle";

  ChildClassesInArrayAndArrayList(double lenInCent, double wthInCent, String shp, String ingr) {

    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;

  }

  public String getCookPrep() {

    return "Boil noodle for 7 minutes and add sauce.";

  }

  public static void main(String[] args) {
    ChildClassesInArrayAndArrayList noodle, ramen;

    noodle = new ArrayListNoodles();
    ramen = new ArrayListRamen();


    ChildClassesInArrayAndArrayList[] dish = {noodle, ramen};
    for (ChildClassesInArrayAndArrayList makedish : dish) {
      System.out.println(makedish.getCookPrep());
    }
  }
}

