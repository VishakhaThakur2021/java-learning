package variables;

public class ManipulatingVariables {
  public static void main(String[] args) {

    //Addition and Subtraction
    int zebrasInZoo = 8;
    int giraffesInZoo = 4;
    int numZebrasAfterTrade;
    //numZebrasAfterTrade++ , increased by 1
    int animalsInZoo = zebrasInZoo + giraffesInZoo;
    System.out.println(animalsInZoo);
    numZebrasAfterTrade = zebrasInZoo - 2;
    System.out.println(numZebrasAfterTrade);

    //Multiplication and Division
    double subtotal = 30;
    double tax = 0.0875;
    double total;
    double perPerson;
    total = subtotal + subtotal * tax;
    System.out.println(total);
    //evenlyDivided holds 2, because 10 divided by 5 is 2 here remainder is lost
    perPerson = total / 4;
    System.out.println(perPerson);

    //Modulo
    int students = 26;
    int leftOut;
    //The modulo operator %, gives us the remainder after two numbers are divided.
    leftOut = students % 3;
    System.out.println(leftOut);

    //Compound Assignment Operators
    int Cookies = 17;
    //Cookies = Cookies-3 represented by
    Cookies -= 3;
    Cookies /= 2;
    System.out.println(Cookies);

    //Greater Than and Less Than
    double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    double creditsAfterSeminar;
    System.out.println(creditsEarned > creditsToGraduate);
    creditsAfterSeminar = creditsEarned + creditsOfSeminar;
    System.out.println(creditsToGraduate < creditsAfterSeminar);

    //Equals and Not Equals
    int songsA = 9;
    int songsB = 9;
    int albumLengthA = 41;
    int albumLengthB = 53;
    boolean sameNumberOfSongs = songsA == songsB;
    boolean differentLength = albumLengthA != albumLengthB;
    System.out.println(sameNumberOfSongs);
    System.out.println(differentLength);

    //Greater/Less Than or Equal To
    double recommendedWaterIntake = 8;
    double daysInChallenge = 30;
    double yourWaterIntake = 235.5;
    double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
    boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
    System.out.println(isChallengeComplete);

    //.equals()
    String line1 = "Nah nah nah nah ";
    String line2 = "Nah nah nah nah nah ";
    String line3 = "Nah nah nah nah nah ";
    System.out.println(line1.equals(line2));
    System.out.println(line2.equals(line3));

    //String Concatenation
    int animals = 12;
    String species = "zebra";
    String zooDescription = "Our zoo has " + animals + " " + species + "s!";
    System.out.println(zooDescription);

    //final Keyword
    final double pi = 3.10;
    // Can't reassign pi=34.44;
    System.out.println(pi);

  }
}
