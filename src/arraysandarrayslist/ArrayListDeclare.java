package arraysandarrayslist;

import java.util.ArrayList;

public class ArrayListDeclare {
  public static void main(String[] args) {
    ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "Water plants";
    String toDo2 ="colour";
    String toDo3 ="pot";

    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);
    // Insert object bird at index 1
    toDoList.add(1, "bird");

    System.out.println(toDoList);
    System.out.println(toDoList.size());

  }
}
