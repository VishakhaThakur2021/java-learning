package javaclasslibrarygenerics;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
//double ended queue , it's a queue which supports insertion and deletion of elements from both the ends
//stack(LIFO),Queue(FIFO) {Last in first out , First in first out}
//ArrayDeque and linked list class implements the java deque interface

public class FirstInFirstOut {

  public static void main(String[] args) {
    Deque<Integer> arrDeque = new ArrayDeque<>();
    Deque<Integer> linked = new LinkedList<>();

    arrDeque.addLast(10);
    arrDeque.offerLast(11);
    System.out.println(arrDeque);
    //print the first element of deque
    arrDeque.peek();
    arrDeque.peekFirst();
    arrDeque.peekLast();
// remove elements
    arrDeque.poll();
    arrDeque.pollFirst();
    arrDeque.pollLast();


  }
}
