import java.util.*;
public class checkingNumber{
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Id number with spaces between each number=   ");
    int digit1 = scan.nextInt();
    int digit2 = scan.nextInt();
    int digit3 = scan.nextInt();
    int digit4 = scan.nextInt();
    int digit5 = scan.nextInt();
    int digit6 = scan.nextInt();
    int digit7 = scan.nextInt();
    int digit_7 = (1 * (digit1) + 2 * (digit2) +3 * (digit3) +4 * (digit4) +5 * (digit5)  + 6 * (digit6)) % 10;
    System.out.println("Digit 7 =" + digit_7);
    if (digit7 == digit_7){
      System.out.print("You typed in your id number correctly");
    } else{
        System.out.print("You typed in your id number incorrectly. =(");
    }
  }
}
