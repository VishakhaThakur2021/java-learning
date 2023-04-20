package arraysandarrayslist;

import java.util.ArrayList;

public class GetAndSetArrays {

  public static void main(String[] args){
    ArrayList<String> shoppingCart = new ArrayList<String>();

    shoppingCart.add("Trench Coat");
    shoppingCart.add("Tweed Houndstooth Hat");
    shoppingCart.add("Magnifying Glass");

    System.out.println(shoppingCart.get(2));
    shoppingCart.set(0, "Tweed Cape");
    shoppingCart.remove(1);
    System.out.println(shoppingCart.indexOf("Magnifying Glass"));
    System.out.println(shoppingCart);
  }
}
