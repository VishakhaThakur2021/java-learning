package conditionalandcontrolledflows;

//An alternative to chaining if-then-else conditions together is to use the switch statement
public class SwitchCase {
  boolean isFilled;
  double billAmount;
  String shipping;

  public SwitchCase(boolean filled, double cost, String shippingMethod) {
    if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }

  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }

  public double calculateShipping() {
    double shippingCost;
    // declared switch statement here
    switch (shipping) {
      case "Regular":
        shippingCost = 0;
        break;
      case "Express":
        shippingCost = 1.75;
        break;
      default:
        shippingCost = .50;
    }
    return shippingCost;
  }

  public static void main(String[] args) {
    SwitchCase book = new SwitchCase(true, 9.99, "Express");
    SwitchCase chemistrySet = new SwitchCase(false, 72.50, "Regular");

    book.ship();
    chemistrySet.ship();
  }

}
