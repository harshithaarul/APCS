import java.lang.*;
  import java.util.*;

  public class harmonicSeries{
    public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      float tester = console.nextFloat();
      result(tester);
       System.out.println(System.nanoTime());
    }
    public static void result(double number){
      long startTime = System.nanoTime();
      double value = 1.0;
      int i = 1;
      do{
          i++;
          value = (double)value + ((double)1/i);

      }while (value <= number);
      System.out.print("Actual sum =");
      System.out.printf("% .5f", value);
      System.out.println();
      System.out.print("Number of terms required: ");
      System.out.println(i);
      long estimatedTime = System.nanoTime() - startTime;
      System.out.println("the time is" + estimatedTime +" nanoseconds ");
    }

  }
