package javaclasslibraryenum;

//Enum can implements interface
public class EnumVariableAndMethods {
  enum Colour {
    RED,
    YELLOW(2),
    GREEN(8);

    int count;

    Colour() {
      count = 10;
      System.out.println("constructor");
    }

    Colour(int a) {
      count = a;
      System.out.println("constructor second");
    }

    public int getCount() {
      return count;
    }
  }

  public static void main(String[] args) {
   // Colour n=Colour.RED;
  //  System.out.println(n.getCount());    //calling enum method
    //values method help to fetch all the enum's
    Colour m[] = Colour.values();
    for (Colour n : m) {
      System.out.println(n);
    }

  }
}
