package edu.cnm.deepdive.euclid.algorithm;

/**
 * Reads two command line arguments a and b and computes the greatest
 * common divisor using Euclid's algorithm
 *
 * @author paulaschultz
 *
 */
public class EuclidAlgorithm {
/** Format string used for display and input values and GCD. */
  public static final String DISPLAY_FORMAT = "GCD(%d,%d) = %d%n";

  /**
   * Reads 2 integer values from the command line and prints
   * @param args input string
   */
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int gcd = gcd(a, b);
    System.out.printf(DISPLAY_FORMAT, a, b, gcd);
  }

  /**
   * Method to find the gcd of two integers a and b
   * @param a first input integer
   * @param b second input integer
   * @return computes largest inte
   */
  public static int gcd(int a, int b){
   //Return the absolute value of a and b in the event they are negative
    a = Math.abs(a);
    b = Math.abs(b);
    if (a == 0 || b == 0){
      return Math.max(a, b);
    }
    while (a != b){
      if (a > b){
        a -= b;
      } else {
        b -= a;
      }
    }
    return a;
  }
}
  /**recursive implementation
  public static int findGCD(int a, int b){
    if (b == 0){
     return a;
    }
    return findGCD(b, a % b);
  }
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c  = findGCD(a,b);
    System.out.println("gcd(" + a + "," + b + ") = " + c);

  */


