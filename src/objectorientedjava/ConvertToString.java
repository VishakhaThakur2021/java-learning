package objectorientedjava;

public class ConvertToString {
  // instance fields
  String productType;
  double price;

  // constructor method
  public ConvertToString(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }

  // increase price method
  public void increasePrice(double priceToAdd) {
    double newPrice = price + priceToAdd;
    price = newPrice;
  }

  // get price with tax method
  public double getPriceWithTax() {
    double tax = 0.08;
    double totalPrice = price + price * tax;
    return totalPrice;
  }

  public String toString() {
    return "This store sells " + productType + " at a price of " + price + ".";
  }

  // main method
  public static void main(String[] args) {
    ConvertToString lemonadeStand = new ConvertToString("Lemonade", 3.75);
    ConvertToString cookieShop = new ConvertToString("Cookies", 5);
    System.out.println(lemonadeStand);
    System.out.println(cookieShop);


  }
}
