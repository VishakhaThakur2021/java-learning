package task;

public class CurrencyConverter {
  static double convertedAmount;

  public static double convert(String currencyFrom, String currencyTo, double amount) {
    final String PLZ = "PLZ";
    final String EUR = "EUR";
    final String USD = "USD";

    if (PLZ.equalsIgnoreCase(currencyFrom) && EUR.equalsIgnoreCase(currencyTo)) {
      convertedAmount = amount * 0.21;
      System.out.println(convertedAmount);
    } else if (PLZ.equalsIgnoreCase(currencyFrom) && USD.equalsIgnoreCase(currencyTo)) {
      convertedAmount = amount * 0.23;
      System.out.println(convertedAmount);
    } else if (USD.equalsIgnoreCase(currencyFrom) && PLZ.equalsIgnoreCase(currencyTo)) {
      convertedAmount = amount * 4.37;
      System.out.println(convertedAmount);
    } else if (USD.equalsIgnoreCase(currencyFrom) && EUR.equalsIgnoreCase(currencyTo)) {
      convertedAmount = amount * 0.93;
      System.out.println(convertedAmount);
    } else if (EUR.equalsIgnoreCase(currencyFrom) && PLZ.equalsIgnoreCase(currencyTo)) {
      convertedAmount = amount * 4.70;
      System.out.println(convertedAmount);
    } else if (EUR.equalsIgnoreCase(currencyFrom) && USD.equalsIgnoreCase(currencyTo)) {
      convertedAmount = amount * 1.07;
      System.out.println(convertedAmount);
    } else if (currencyFrom.equalsIgnoreCase(currencyTo)) {
      convertedAmount = amount;
      System.out.println(convertedAmount);
    } else {
      System.out.println("currency not present");
    }
    return convertedAmount;
  }

  public static void main(String[] args) {
    CurrencyConverter.convert("PLZ", "EUR", 100);
    CurrencyConverter.convert("PLZ", "USD", 675);
    CurrencyConverter.convert("USD", "PLZ", 467);
    CurrencyConverter.convert("USD", "EUR", 467);
    CurrencyConverter.convert("EUR", "PLZ", 467);
    CurrencyConverter.convert("EUR", "USD", 467);
    double resultOne = CurrencyConverter.convert("PLZ", "PLZ", 100);
    if (resultOne != 100) {
      throw new AssertionError("If convert 100 PLZ to PLZ, result should be 100, but current - " + resultOne);
    }
    double resultTwo = CurrencyConverter.convert("EUR", "EUR", 100);
    if (resultTwo != 100) {
      throw new AssertionError("If convert 100 EUR to EUR, result should be 100, but current - " + resultTwo);
    }
    double resultThree = CurrencyConverter.convert("USD", "USD", 100);
    if (resultThree != 100) {
      throw new AssertionError("If convert 100 USD to USD, result should be 100, but current - " + resultThree);
    }
    double resultFour = CurrencyConverter.convert("PLZ", "EUR", 100);
    if (resultFour != 21.0) {
      throw new AssertionError("If convert 100 PLZ to EUR, result should be 21.0 , but current - " + resultFour);
    }
    double resultFive = CurrencyConverter.convert("PLZ", "USD", 675);
    if (resultFive != 155.25) {
      throw new AssertionError("If convert 675 PLZ to USD, result should be 155.25 , but current - " + resultFive);
    }
    double resultSix = CurrencyConverter.convert("USD", "PLZ", 467);
    if (resultSix != 2040.79) {
      throw new AssertionError("If convert 467 USD to PLZ, result should be 2040.79, but current - " + resultSix);
    }
    double resultSeven = CurrencyConverter.convert("USD", "EUR", 467);
    if (resultSeven != 434.31) {
      throw new AssertionError("If convert 467 USD to EUR, result should be 434.31, but current - " + resultSeven);
    }
    double resultEight = CurrencyConverter.convert("EUR", "PLZ", 467);
    if (resultEight != 2194.9) {
      throw new AssertionError("If convert 467 EUR to PLZ, result should be 2194.9, but current - " + resultEight);
    }
    double resultNine = CurrencyConverter.convert("EUR", "USD", 467);
    if (resultNine != 499.69000000000005) {
      throw new AssertionError("If convert 467 EUR to USD, result should be 499.69000000000005, but current - " + resultNine);
    }

  }

}





