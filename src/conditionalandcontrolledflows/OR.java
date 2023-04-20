package conditionalandcontrolledflows;
//True True  True
//True False True
//False True True
//False False False
public class OR {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;

  public OR(int count, int capacity, boolean open) {
    if(guestCount<1 || guestCount>8){
      System.out.println("Invalid reservation!");
    }

    guestCount = count;
    restaurantCapacity = capacity;
    isRestaurantOpen = open;
  }

  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
      isConfirmed = false;
    }
  }

  public void informUser() {
    System.out.println("Please enjoy your meal!");
  }

  public static void main(String[] args) {
    OR partyOfThree = new OR(3, 12, true);
    OR partyOfFour = new OR(4, 3, true);
    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    partyOfFour.confirmReservation();
    partyOfFour.informUser();
  }

}
