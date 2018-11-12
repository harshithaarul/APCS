import java.util.*;

public class PEEB2StefanBoltzmann {
  public static void main(String[] args) {
    giveIntro();
    Scanner console= new Scanner(System.in);
    double stefanBoltzmann = 5.67E-8; //Stefan-Boltzmann constant
    double rSubS = 700000; //radius Sun
    double astroUnit = 1.5E8; //astronomical unit
    double sunSubS = 64.2E6; //radiant power at surface of Sun
    String planetName = getPlanetName ("Planet: ", console);
    double dSubP = getInput("distance of Planet from Sun (AU): ", console);
    double rSubP = getInput("radius of Planet (km): ", console);
    double albedo = getInput("albedo of Planet: ", console);
    double sunSubP = sunSubS*(Math.pow(rSubS/(dSubP*astroUnit),2)); //radiant power at orbit of planet
    double sunSubAve = sunSubP/4; //sunSubP average over planet area
    double sunSubAveAlbedo = sunSubAve*(1 - albedo); //sunSubAve corrected for albedo
    double tSubPK = Math.pow(sunSubAveAlbedo/stefanBoltzmann, 0.25);
    double tSubPC = tSubPK - 273.15;
    System.out.println("photon flux SP = " +Math.round(sunSubP));
    System.out.println("average photon flux SAve = " +Math.round(sunSubAve));
    System.out.println("including albedo SAve x (1 - alpha) = "+ Math.round(sunSubAveAlbedo));
    System.out.println("temperature TP (K) = " + Math.round(tSubPK));
    System.out.println("temperature TP (C) = " + Math.round(tSubPC));
  }

public static String getPlanetName(String prompt, Scanner console){
  System.out.print(prompt);
  String input = console.next();
  return input;
  }

public static void giveIntro() {
  System.out.println("Calculate radiant power per unit area for Sun and Planet using");
  System.out.println("Stefan-Boltzman Law. From balance equation for Planet,");
  System.out.println("(Power in) = (Power out), predict temperature of Planet.");
  }

public static double getInput(String prompt, Scanner console) {
  System.out.print(prompt);
  double input = console.nextDouble();
  return input;
  }
}
