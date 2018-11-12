import java.util.*;
public class Euclid{
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter positive integer a: ");
  int num1 = scan.nextInt();
  System.out.println("Enter positive integer b: ");
  int num2 = scan.nextInt();
  System.out.print("Greatest common divisor (GCD) = ");
  System.out.println(egcd(num1,num2));
  }
  public static int egcd(int a, int b) {
    if (a == 0)
        return b;

    while (b != 0) {
        if (a > b)
            a = a - b;
        else
            b = b - a;
    }

    return a;
}
}
