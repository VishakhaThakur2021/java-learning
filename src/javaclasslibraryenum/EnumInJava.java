package javaclasslibraryenum;

/*
1.An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
2.Enum can be defined inside class or outside class.
3.Enum can have variable and methods.
4.Enum can be used in switch case.
5.Enum is an interface which extends java class called enum.

 */
public class EnumInJava {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  //when enum is defined , java creates enum class with final and constant variable as shown below.
  //so ,Enum Level{} =class Level{}
 /* class Level{
    static final Level LOW =new Level();
    static final Level MEDIUM =new Level();
    static final Level HIGH =new Level();
  }*/
  public static void main(String[] args) {
    Level myVar = Level.MEDIUM;
    switch (myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
        System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;

    }
    System.out.println(myVar);
  }

}
