package twodimensionalarrays;

public class AccessingArrayElements {
  public static void main(String[] args) {
    int[][] intMatrix = {
        {1, 1, 1, 1, 1},
        {2, 4, 6, 8, 0},
        {9, 8, 7, 6, 5}
    };

    // Access the integer at the first row and fourth column of intMatrix and store it in a variable called retrievedInt
    int retrievedInt = intMatrix[0][3];
    //Access and print integer at center
    retrievedInt = intMatrix[1][2] * 3;
    System.out.println(retrievedInt);

  }
}


