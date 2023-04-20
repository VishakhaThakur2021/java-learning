package javaclasslibraryexceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptions {

  public static void main(String[] args) {
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
    }
    System.out.println("Output value:"   + k);
  }
}
