package objectorientedjava;

public class Methods {
  String productType;
  double price;

  // constructor method
  public Methods(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }

  // increase price method
  public void increasePrice(double priceToAdd) {
    double newPrice = price + priceToAdd;
    price = newPrice;
  }

  // main method
  public static void main(String[] args) {
    Methods lemonadeStand = new Methods("Lemonade", 3.75);
    //Reassigning Instance Fields
    lemonadeStand.increasePrice(1.5);
    System.out.println(lemonadeStand.price);


  }
}
