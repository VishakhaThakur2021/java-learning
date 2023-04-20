package variables;

public class DataType {
  public static void main(String[] args) {
    int age = 28;
    double percentage = 81.7;
    boolean value = true;
    char character = 'A';
    //The \" escape sequence allows us to add quotation marks " to a String value.
    //if we place a \n escape sequence in a String, the compiler will output a new line of text:
    String openingLyrics = "\"Yesterday,\n all my troubles seemed so far away\"";
    System.out.println(openingLyrics);
    System.out.println(age);
    System.out.println(percentage);
    System.out.println(value);
    System.out.println(character);
  }
}
