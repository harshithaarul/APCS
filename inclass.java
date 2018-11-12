import java.util.*;
public class inclass{
  public static void main(String args[]){
    Scanner console = new Scanner(System.in);
    System.out.print("Please enter the number of days in the month: ");
    int days = console.nextInt();
    System.out.print("Please enter the number of the day of the first Sunday: ");
    int firstSunday = console.nextInt();
    printFirst(firstSunday, days);
    printSecond(firstSunday, days);
    System.out.println("+------+------+------+------+------+------+------+");
  }
  public static void printSecond(int firstSunday, int numberdays){
    int count = firstSunday;
    int fincount = count;
    for(int i = 0; i < (int)((numberdays-firstSunday+1)/7.0); i++){
      for(int j = count; j < firstSunday + (i+1)*7;j=j){
        System.out.print("|  ");
        if(j-10<0){
          System.out.print(" ");
        }
        int county = j;
        String countx = "  ";
        if(j>numberdays){
          System.out.print(countx);
        }else if(j <= numberdays){
          System.out.print(county);
        }
        System.out.print("  ");
        count = j + 1;
        j = j + 1;
      }
      System.out.print("|");
      System.out.println("");

    }
  } public static void printFirst(int firstSunday, int days){
    System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
    System.out.println("+------------------------------------------------+");
    if(days%7 != 0) {
      for(int j = firstSunday - 7; j < firstSunday; j++){
        if(j<=0){
          System.out.print("|      ");
        }else if(j>0){
          System.out.print("|   ");
          System.out.print(j);
          System.out.print("  ");
        }
      }
      System.out.print("|");
      System.out.println("");
    }
  }
}
