import java.util.*;
public class ex3_4 {
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    System.out.print("Please enter the length of the first side ");
    int a = console.nextInt();
    System.out.print("Please enter the length of the second side");
    int b = console.nextInt();
    System.out.print("Please enter the length of the third side");
    int c = console.nextInt();
    triangle (a, b, c);
  }
  public static void triangle (int a,int b,int c){
    double c1 = -1*(c*c-(a*a+b*b))/(2.0*a*b);
    double c2 = -1*(b*b-(a*a+c*c))/(2.0*a*c);
    double c3 = -1*(a*a-(b*b+c*c))/(2.0*b*c);
    double theta1 = 180*Math.acos(c1)/Math.PI;
    double theta2 = 180*Math.acos(c2)/Math.PI;
    double theta3 = 180*Math.acos(c3)/Math.PI;
    System.out.println(theta1);
    System.out.println(theta2);
    System.out.println(theta3);
  }
}
