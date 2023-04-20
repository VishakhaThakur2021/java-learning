package javaclasslibraryexceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//when we need to print some block always no matters which catch exception block will be picked , we use finally block
//both the catch will print finally block statement always
public class FinallyException {
  public static void main(String[] args) throws Exception {
    int i, j = 1, k = 0;
    i = 8;
    // to insert value from user
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    try {
      //to convert string inserted by user to int
      System.out.println("Enter a number");
      j = Integer.parseInt(br.readLine());
      k = i / j;
    } catch (IOException e) {
      System.out.println("Catch IO error,Incorrect input" + e);
    } catch (Exception e) { //always use main exception at the end of catch block
      // System.out.println(e);
      System.out.println("can't divide by zero" + e);
      System.out.println("can't divide by zero"); // we can modify exception msg to show
    } finally {
      System.out.println("Final bye");
      br.close(); //close() method helps to close all the resources at the end in finally block
    }
    System.out.println("Output value:" + k);
  }

}
