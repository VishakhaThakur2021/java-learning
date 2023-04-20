package task;


import java.util.ArrayList;
import java.util.List;

public class Demo {
  public static void main(String[] args) {

    User one = new User("Mindy", "test", 27);
    User two = new User("Henna", "Montana", 31);
    User three = new User("kitty", "Merry", 24);
    User four = new User("lidia", "test", 32);
    User five = new User("kim", "jim", 30);

    List<User> userList = new ArrayList<>();
    userList.add(one);
    userList.add(two);
    userList.add(three);
    userList.add(four);
    userList.add(five);

    for (User user : userList) {
      if (user.getAge() > 30) {
        System.out.println("age is greater" + " " + user.getFirstName() + " " + user.getLastName() + " " + user.getAge());
      }
    }
  }

}

