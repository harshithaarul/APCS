import java.util.Scanner;
//http://www.chegg.com/homework-help/write-program-computes-spherical-distance-two-points-surface-chapter-3-problem-5pp-solution-9780133437300-exc
public class ex3_5{

    public static void main (String[] args){
        Scanner console = new Scanner(System.in);

        System.out.println("Enter latitude in degrees for first city: ");
        double point_1_latitude = console.nextDouble();
        double point_1_latminute = console.nextDouble();
        //System.out.println("Enter longitude in degrees and minutes for first city: ");
        double point_1_longitude = console.nextDouble();
        double point_1_longminute = console.nextDouble();
        System.out.println("Enter latitude in degrees for second city: ");
        double point_2_latitude = console.nextDouble();
        double point_2_latminute = console.nextDouble();
      //  System.out.println("Enter longitude in degrees and minutes for second city: ");
        double point_2_longitude = console.nextDouble();
        double point_2_longminute = console.nextDouble();

        double point_1_lat = toRadians(lat1deg+((point_1_latminute)*1.0/60));
        double point_2_lat = toRadians(lat2deg+((point_2_latminute)*1.0/60));
        double point_1_long = toRadians(long1deg+((point_1_longminute)*1.0/60));
        double point_2_long = toRadians(long2deg+((point_2_longminute)*1.0/60));
        double angulardistance = acos((sin(point_1_latitude))*(sin(point_2_latitude))+(cos(point_1_latitude))*(cos(point_2_latitude))*(cos(point_2_longitude-point_1_longitude)));
        System.out.println(" ");
        System.out.println("Angular Distance= " + angulardistance + " radians");
        int kilometerslength = (int)(angulardistance * 6372.795);
        System.out.println("Distance        = " + kilometerslength + " kilometers");
        int mileslength = (int)(kilometerslength * 0.621371);
        System.out.println("Distance        = " + mileslength + " miles");
        // double d = 6371.01 * Math.acos((
        //     Math.sin(Math.toRadians(point_1_latitude)) * Math.sin(Math.toRadians(point_1_longitude))) +
        //     (Math.cos(Math.toRadians(point_1_latitude)) *
        //     Math.cos(Math.toRadians(point_1_longitude)) *
        //     (Math.cos(Math.toRadians(point_2_longitude) - Math.toRadians(point_2_latitude)))));

        //System.out.printf("The angular distance between the two points is "+  + "radians");
      }
    }
