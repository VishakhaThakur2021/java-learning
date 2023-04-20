package stringmethod;

public class Introduction {
  public static void main(String[] args) {

    String str = "Hello, World!";
    String firstName = "vishu";
    String lastName = "thakur";
    //length()
    System.out.println(str.length());
    //substring
    System.out.println(str.substring(4));
    //toUpperCase & toLowerCase
    System.out.println(str.toUpperCase());
    //concat()
    System.out.println(firstName.concat(lastName));
    //equals()
    System.out.println(str.equals("Hello, World!"));
    //indexOf()
    System.out.println(str.indexOf("e"));
    //charAt()
    System.out.println(firstName.charAt(0));
  }
}
