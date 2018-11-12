import java.util.*;
public class PascalTriangle {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    int num1 = console.nextInt();
    int rows = num1;
    for(int i =0;i<rows;i++) {
      int number = 1;
     System.out.format("%"+(rows-i)*2+"s","");
      for(int j=0;j<=i;j++) {
        System.out.format("%4d",number);
        number = number * (i - j) / (j + 1);
      }
      System.out.println();
        }
    }
}
