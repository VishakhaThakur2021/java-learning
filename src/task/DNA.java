package task;

public class DNA {
  /*ATGCGATACTGA is a protein because it has the start codon ATG, the stop codon TGA, and the length is divisible by 3.
   ATGCGATAGA is not a protein because the sequence length is not divisible by 3, so the third condition is not satisfied.*/
  String dna1 = "ATGCGATACGCTTGA";
  String dna2 = "ATGCGATACGTGA";
  String dna3 = "ATTAATATGTACTGA";
  String dna = dna1;

  public void testing() {
    int length = dna.length();
    System.out.println(length);
    //Remember that the indexOf() string method will return -1 if the substring doesn’t exist within a String.
    int start = dna.indexOf("ATG");
    System.out.println(start);
    int stop = dna.indexOf("TGA");
    System.out.println(stop);
    if (start != -1 && stop != -1) {
      System.out.println("Condition 1 and 2 are satisfied.");
    }
    if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
      String len = dna.substring(start, stop + 3);
      System.out.println(len);

      System.out.println("Condition 1 and 2 and 3 are satisfied,its protein");

    } else {
      System.out.println("No protein");
    }

  }


  public static void main(String[] args) {
    DNA test = new DNA();
    test.testing();


  }
}
