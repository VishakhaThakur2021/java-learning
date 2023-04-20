package javaclasslibrarygenerics;

//stack works on LIFO (last in first out)
public class Stack {

  int stack[] = new int[5];//declaring array length
  int top = 0; //top is variable used to get index. here top will start from 0 index in stack

  //push method is used to add element to an array
  public void push(int data) {
    stack[top] = data;
    top++; //to increment index number in array
  }

  //show method is used to show all the arrays
  public void show() {
    for (int n : stack) {
      System.out.println(n + " ");
    }
  }

  // pop method is used to delete last element from an array
  public int pop() {
    int data;
    top--;
    data = stack[top];
    stack[top] = 9; //reassign the old value to new value -->it's not working

    return data;

  }

  //peek method is used for fetching or finding element
  public int peek() {
    int data;
    data = stack[top - 2];
    return data;
  }

  //size method checks size of an array
  public int size() {
    return top;
  }

  //isEmpty will check if array is empty
  public boolean isEmpty() {
    return top <= 0;
  }

}
