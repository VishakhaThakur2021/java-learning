package addingitemtocart;

import java.util.UUID;

public class Cart {
  public static void main(String[] args) throws Exception {
    Ordered shoppingCart = new Ordered();
    Product iphone14 = new Product(UUID.randomUUID(), "Iphone14", 1020);
    Product samsungS22 = new Product(UUID.randomUUID(), "Samsung S22", 999);
    Product iphone8 = new Product(UUID.randomUUID(), "Iphone8", 455);
    Product iphone12 = new Product(UUID.randomUUID(), "Iphone12", 899);
    Product macbook = new Product();


    shoppingCart.addOrder(iphone14, 1);
    shoppingCart.addOrder(samsungS22, 2);
    shoppingCart.addOrder(iphone8, 3);
    shoppingCart.addOrder(iphone12, 4);

    double beforeAddingQuantity = shoppingCart.getTotalPrice();
    System.out.println("Total Price before adding items quantity" + "  " + beforeAddingQuantity);

    if (beforeAddingQuantity != 7979.0)
      throw new AssertionError("total price is not correct before adding new quantity expected" + beforeAddingQuantity);
    shoppingCart.addQuantity(iphone14, 5);
    shoppingCart.addQuantity(samsungS22, 6);
    shoppingCart.addQuantity(iphone8, 7);
    shoppingCart.addQuantity(iphone12, 8);

    double afterAddingQuantity = shoppingCart.getTotalPrice();
    System.out.println("Total Price after adding items quantity" + afterAddingQuantity);
    if (afterAddingQuantity != 29450.0)
      throw new AssertionError("total price is not correct after adding new quantity expected" + "  " + afterAddingQuantity);

    shoppingCart.removeOrder(samsungS22);


    double afterRemoveOrder = shoppingCart.getTotalPrice();
    System.out.println("Total after removing order" + afterRemoveOrder);
    if (afterRemoveOrder != 21458.0)
      throw new AssertionError("total price is not correct  after removing order expected" + "  " + afterRemoveOrder);


    shoppingCart.removeQuantity(iphone8, 2);
    double afterRemoveQuantity = shoppingCart.getTotalPrice();
    System.out.println("Total after removing quantity" + afterRemoveQuantity);
    if (afterRemoveQuantity != 20548.0)
      throw new AssertionError("total price is not correct  after removing Quantity expected" + "  " + afterRemoveQuantity);


    shoppingCart.resetCart();
    double reset = shoppingCart.getTotalPrice();
    System.out.println("Total after reset orders" + reset);
    if (reset != 0)
      throw new AssertionError("total price is not correct  after resettling the cart" + "  " + reset);


    try {
      shoppingCart.addOrder(macbook, 2);
    } catch (Exception exception) {
      System.out.println(exception);
    }

    macbook.setId(UUID.randomUUID());
    macbook.setName("MacBook Pro M2");
    macbook.setPrice(1500);

    shoppingCart.addOrder(macbook, 3);
    double afterAddingNewOrderAndQuantity = shoppingCart.getTotalPrice();
    System.out.println("Total after adding new order and quantity" + afterAddingNewOrderAndQuantity);
    if (afterAddingNewOrderAndQuantity != 4500.0)
      throw new AssertionError("total price is not correct  after adding new order" + "  " + afterAddingNewOrderAndQuantity);


    try {
      shoppingCart.removeOrder(iphone8);
    } catch (Exception exception) {
      System.out.println(exception);
    }


  }


}
