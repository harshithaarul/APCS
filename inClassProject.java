import static java.lang.Math.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class inClassProject{
public static void main(String[] args){
        System.out.println("This program computes the spherical distance ");
        System.out.println("between two points, 1 and 2.");
        System.out.println();
        System.out.println("Please enter the latitude and longitude for  ");
        System.out.println("each point as a pair of intergers, degrees");
        System.out.println("followed by minutes:");
        System.out.println();

        input();
  }

  public static void input(){
      Scanner console = new Scanner(System.in);
      System.out.print("latitude 1? ");
      int lat1deg = console.nextInt();
      int lat1min = console.nextInt();
      System.out.print("longitude 1? ");
      int long1deg = console.nextInt();
      int long1min = console.nextInt();
      System.out.print("latitude 2? ");
      int lat2deg = console.nextInt();
      int lat2min = console.nextInt();
      System.out.print("longitude 2? ");
      int long2deg = console.nextInt();
      int long2min = console.nextInt();

      double lat1radian = toRadians(lat1deg+((lat1min)*1.0/60));
      double lat2radian = toRadians(lat2deg+((lat2min)*1.0/60));
      double long1radian = toRadians(long1deg+((long1min)*1.0/60));
      double long2radian = toRadians(long2deg+((long2min)*1.0/60));
      double angulardistance = acos((sin(lat1radian))*(sin(lat2radian))+(cos(lat1radian))*(cos(lat2radian))*(cos(long2radian-long1radian)));
      System.out.println(" ");
      System.out.println("Angular Distance= " + angulardistance + " radians");
      int kilometerslength = (int)(angulardistance * 6372.795);
      System.out.println("Distance        = " + kilometerslength + " kilometers");
      int mileslength = (int)(kilometerslength * 0.621371);
      System.out.println("Distance        = " + mileslength + " miles");
  }
}
