
  import java.util.*;
public class WriteNums{
  public static void main (String[] args) {
  Scanner console = new Scanner (System.in);
  int n = console.nextInt();
  System.out.print("Enter an integer: ");
    if (n < 1) {
        throw new IllegalArgumentException();
    } else if (n == 1) {
        System.out.print("1");
    } else {
        System.out.print("1");
        for (int i = 2; i <n+1; i++){
          System.out.print(", " + i);
        }
    }
    System.out.println();
}
}
