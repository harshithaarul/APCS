import java.util.*;

public class LastIndexOf{
  public static void main (String[] args){
    int list[] = new int[8];
    Scanner console = new Scanner(System.in);
    System.out.println("Please enter seven elements of an integer array and a value: ");
    for (int i = 0 ; i < list.length; i++ ) {
       list[i] = console.nextInt();
    }
    int lastValue = list[7];
    for (int i = 1 ; i < list.length; i++ ) {
      if (list[0]==list[i]){
        System.out.println(i);
      }
    }
    // if (lastValue > 0) {
    // System.out.println("Last index of value = " + lastValue % 10);
    // } else{
    // System.out.println("-1");

  }
}
