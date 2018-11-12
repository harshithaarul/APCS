import java.util.*;
import java.text.DecimalFormat;
public class peeb_class {
public static void main (String[] args) {
  Scanner console = new Scanner(System.in);
  int num1= console.nextInt();
  int num2 = console.nextInt();
//  int num1; int num2 = console.nextInt();
  double h = (Math.pow(6.62606834,-34));
  double c = (Math.pow(299792500,2));
  double k = (Math.pow(1.38066,-23));
  double denom_pow = h*k*num1;
  double denom = Math.pow(Math.E, denom_pow);
  double flux = ((2*h*c*(Math.pow(num2, -5)))/denom-1);
  DecimalFormat df1 = new DecimalFormat("0.00E00");
    System.out.println("Calculate radiant photon flux at a given wavelength\nand temperature using Planck's Law\nwavelength in microns: temperature in degrees Kelvin: radiant flux B = " + df1.format(flux).toLowerCase() + " Wm-3steradian-1");
  }
}
