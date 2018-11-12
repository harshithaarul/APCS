import java.util.*;
public class calc {
public static void main (String[] args) {
  Scanner console = new Scanner(System.in);
  System.out.println("Enter your first number:");
  int num1 = console.nextInt();
  System.out.println("Enter your second number:");
  int num2 = console.nextInt();
  double sum = add(num1, num2);
  double difference = subtract(num1, num2);
  double product = multiply(num1, num2);
  double quotient = divide(num1, num2);
  System.out.println("The Sum is: "+ sum);
  System.out.println("The Difference is: "+ difference);
  System.out.println("The Product is: "+ product);
  System.out.println("The Quotient is: "+ quotient);
  }
  public static double add (double num1, double num2) {
  return num1 + num2;
  }
  public static double subtract (double num1, double num2) {
  return num1 - num2;
  }
  public static double multiply (double num1, double num2) {
  return num1*num2;
  }
  public static double divide (double num1, double num2) {
  return num1/num2;
  }
}
