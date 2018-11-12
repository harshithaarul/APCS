import java.util.*;
public class standardDev{
  public static void main(String[] args){
    Scanner lenOfArray= new Scanner(System.in);
    System.out.println("Please enter the integer array dimension: ");
    int number = lenOfArray.nextInt();
    System.out.println("Please enter the array elements: ");
    int list[] = new int[number];
    int avg =0;
    int divide=0;
  Scanner console = new Scanner (System.in);
  for (int i = 0 ; i < list.length; i++ ) {
     list[i] = console.nextInt();
     //avg = Math.abs(avg+list[i]);
    // divide =i;
  }
//  avg = avg/list.length;
  //  System.out.println(avg);
  int sum = 0;
        double sd = 0;
        for(int i=0; i<list.length; i++)
        {
            sum = sum + list[i];
        }
        double average = sum / list.length;
        for (int i=0; i<list.length;i++)
        {
          sd += ((Math.abs(list[i])) - average)*(((Math.abs(list[i]) - average)) / (list.length - 1));
        }
        double standardDeviation = Math.sqrt(sd/(list.length-1));
        System.out.println("The standard deviation is : " + standardDeviation);
    }
}
