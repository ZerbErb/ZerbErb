import java.util.Scanner;

public class Main {
  public static int askInteger(String prompt) {
    Scanner kbReader = new Scanner(System.in);
    System.out.print(prompt + " ");
    int n = kbReader.nextInt();
    return n;
  }
  
  public static void main(String[] args) {
    int n;
    do {
      n = askInteger("Problem (1-7):");
      switch(n) {
        case 1: problem1(); break;
        case 2: problem2(); break;
        case 3: problem3(); break;
        case 4: problem4(); break;
        case 5: problem5(); break;
        case 6: problem6(); break;
        case 7: problem7(); break;          
      }
    } while (n != 0);
  } // end of main

  public static void problem1() {
    String nStr = getString("Enter a number:");
    int n = Integer.valueOf(nStr);
    // String -> int      Integer.valueOf(aStr);
    // String -> double   Double.valueOf(aStr);

    int sum = 0;
    int currentOdd = 1;

    for (int k = 0; k < n; k++) {
      // will repeat n times
      sum = sum + currentOdd;
      System.out.println("Cumulative Sum: " + sum + 
        " Current Odd: " + currentOdd);

      currentOdd = currentOdd + 2; // 1 -> 3


    // summation
    
  }

  public static void problem2() {
    // factorial
    
  }

  public static void problem3() {
    // count occurrence of a
    
  }

  public static void problem4() {
    // box
    
  }

  public static void problem5() {
    // censor text
    
  }

  public static void problem6() {
    // initials
    
  }

  public static void problem7() {
    // pin
    final int CORRECT_PIN = 12345;
    
  }
  
} // end of Main









