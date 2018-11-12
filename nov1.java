import java.util.*;
public class nov1{
  public static void main(String[] args){
    Scanner lenOfArray= new Scanner(System.in);
    int number = lenOfArray.nextInt();
    int list[] = new int[number];
    double avg =0;
    double sum =0;
    double max = 0;
  for (int i = 0 ; i < number; i++ ) {
     list[i] = lenOfArray.nextInt();
     sum+= list[i];

  }
  avg = (double)sum/number;
  double diff = 0;
  double index =0;
  for (int i=0; i<number;i++){
    diff = (double)Math.abs(avg - (double) list[i]);
    System.out.println(diff);
    if (diff > max){
      diff = max;

    }

  }
  index = avg+max;
System.out.println(index);
  }
}
