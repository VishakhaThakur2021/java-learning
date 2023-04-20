package objectorientedjava;

public class Returns {
  // instance fields
  String productType;
  double price;

  // constructor method
  public Returns(String product, double initialPrice) {
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

  // main method
  public static void main(String[] args) {
    Returns lemonadeStand = new Returns("Lemonade", 3.75);
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println(lemonadePrice);

  }
}
