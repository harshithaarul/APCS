import java.io.*;
import java.util.*;
public class Benford1 {
public static void main(String[] args)
throws FileNotFoundException {
 Scanner console = new Scanner(System.in);
System.out.println("Let’s count those leading digits...");
 System.out.print("input file name? ");
 String name = console.nextLine();
 Scanner input = new Scanner( new File(name));
 int[] count = countDigits(input);
 reportResults(count);
 }

 // Reads integers from input, computing an array of counts
// for the occurrences of each leading digit (0–9).
public static int[] countDigits(Scanner input) {
int[] count = new int[10];
while (input.hasNextInt()) {
 int x = input.nextInt();
 count[firstDigit(x)]++;
 }
 return count;
 }

 // Reports percentages for each leading digit, excluding zeros
 public static void reportResults( int[] count) {
 if (count[0] > 0) {
 System.out.println("excluding " + count[0] + " zeros");
 }
 int total = (sum(count)) - count[0];
 System.out.println("Digit Count Percent");
 for ( int i = 1; i < count.length; i++) {
 double pct = count[i] * 100.0 / total;
 System.out.printf("%5d %5d %6.2f\n", i, count[i], pct);
 }
 System.out.printf("Total %5d %6.2f\n", total, 100.0);
 }

 // returns the sum of the integers in the given array
 public static int sum( int[] data) {
 int sum = 0;
 for ( int x : data) {
 sum += x;
 }
 return sum;
 }

 // returns the first digit of the given number
 public static int firstDigit( int x) {
 int result = Math.abs(n);
 while (result >= 10) {
 result = result / 10;
 }
return result;
}
}
