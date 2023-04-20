package twodimensionalarrays;

public class DeclarationInitializationAssignment {
  public static void main(String[] args) {
    // Declare a 2d array of float values called floatTwoD
    float[][] floatTwoD;
    float[][] floatTwoM;

    // Initialize the 2d array from the last step to an empty 2d array consisting of 5 arrays with 10 elements each
    floatTwoD = new float[5][10];
    floatTwoM=new float[4][11];

    // Declare and initialize an empty 2d array of integers consisting of 15 rows and 4 columns called dataChart
    int[][] dataChart = new int[15][4];

    //  Create a 2D char array called ticTacToe, initializer lists for 2D arrays:
    char[][] ticTacToe = {{'X', 'O', 'O'}, {'O', 'X', ' '}, {'X', ' ', 'X'}};

    /*
    In the case where the variable has not yet been declared,
    double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};

    If the variable has already been declared,
    String[][] stringValues;
    stringValues = new String[][] {{"working", "with"}, {"2D", "arrays"}, {"is", "fun"}};
    */
  }
}
