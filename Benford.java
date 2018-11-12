import java.io.*;
import java.util.*;
public class Benford {
  public static void main(String[] args)
    throws FileNotFoundException {
    Scanner input = new Scanner(System.in);
        System.out.print("Let’s count those leading digits...\ninput file name? ");
    String filename = input.nextLine();
    Scanner c = new Scanner( new File(filename));
    int[] total = noOfDigits(c);
     results(total);
  }

  public static int Digit1 (int x) { // divide a number by 10 to find the first
    int Dig1 = Math.abs(x);         // digit of a number
    while (Dig1 >= 10) {
      Dig1 /= 10;
    }
    return Dig1;
  }
    public static int[] noOfDigits(Scanner c) { // after reading input from console,
    int[] count = new int[10];                 // it creates an array for the Number
    while (c.hasNextInt()) {                   // of times each first digit occurs
      int x = c.nextInt();
      count[Digit1(x)]++;
    }
    return count;
    }

   public static int total( int[] array) { // now we need to find sum of the number
   int total = 0;                          // of numbers for the entire array
   for ( int x : array) {
    total += x;
   }
   return total;
   }

   public static void results( int[] count) { // need new method to printout results
   if (count[0] > 0) {               // finds the percentage of each first digit
   System.out.println("excluding " + count[0] + " zeros"); }
   int total = (total(count)) - count[0];
   System.out.println("Digit Count Percent");
   for ( int i = 1; i < count.length; i++) {
     double percent = count[i] * 100.0 / total;
     System.out.printf("%5d %5d %6.2f\n", i, count[i], percent);
   }
   System.out.printf("Total %5d %6.2f\n", total, 100.0);
   }

    }
