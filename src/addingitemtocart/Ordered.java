package addingitemtocart;

import java.util.HashMap;

import java.util.Map;

public class Ordered {
  private final Map<Product, Integer> order;

  public Ordered() {
    order = new HashMap<>();
  }

  public void addOrder(Product product, int quantity) throws Exception {
    if (product.getId() != null && !product.getName().isBlank() && product.getPrice() > 0) {
      this.order.put(product, quantity);
    } else
      throw new Exception(" Product details are missing");
  }

  // get the current quantity from the cart, add the new quantity and update the cart
  public void addQuantity(Product product, int quantity) {
    if (this.order.containsKey(product)) {
      quantity += this.order.get(product);
      this.order.put(product, quantity);
    }

  }


  public void removeQuantity(Product product, int quantity) {
    if (this.order.containsKey(product)) {
      quantity = this.order.get(product) - quantity;

      if (quantity > 0) {
        this.order.put(product, quantity);
      } else if (quantity == 0) {
        this.order.remove(product);
      } else
        throw new AssertionError(" unable to update the cart ");
    } else {
      throw new AssertionError(" product not found ");
    }


  }


  public void removeOrder(Product product) throws Exception {
    if (this.order.containsKey(product)) {
      this.order.remove(product);
    } else
      throw new Exception("Product not found in the cart");

  }


  public double getTotalPrice() {
    double totalPrice = 0;
    for (Map.Entry<Product, Integer> set :
        this.order.entrySet()) {
      System.out.println(set.getKey() + " = " + +set.getValue());
      totalPrice += (set.getKey().getPrice() * set.getValue());

    }
    return totalPrice;
  }


  public void resetCart() {
    this.order.clear();
  }

}
