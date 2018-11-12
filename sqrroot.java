import java.util.*;
public class sqrroot{
  public static void main (String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.print("Raw Grade :   ");
      int rawgrade = scan.nextInt();
      System.out.print("Square Root Grade :   ");
      System.out.println(sqrt(rawgrade)*10);
      double rooted = sqrt(rawgrade)*10;
      System.out.print("Your Letter Grade :   ");
      if (rooted >= 90.0){
        if(rooted <= 93.0){
          System.out.println("A-");
          System.out.println("Good Job!");
        } else if(rooted < 97.0){
          System.out.println("A");
          System.out.println("Good Job!");
        } else if(rooted >= 97.0){
          System.out.println("A+");
          System.out.println("Good Job!");
        }
      } else if (rooted >= 80.0){
        if(rooted <= 83.0){
          System.out.println("B-");
        } else if(rooted < 87.0){
          System.out.println("B");
        } else if(rooted >=87.0){
          System.out.println("B+");
        }
      } else if (rooted >= 70.0){
        if(rooted <= 73.0){
          System.out.println("C-");
        } else if(rooted < 77.0){
          System.out.println("C");
        } else if(rooted >=77.0){
          System.out.println("C+");
        }
      } else if (rooted >= 60.0){
        if(rooted <= 63.0){
          System.out.println("D-");
        } else if(rooted < 67.0){
          System.out.println("D");
        } else if(rooted >=67.0){
          System.out.println("D+");
        }
      } else if (rooted < 60){
          System.out.println("F");
      }
  }
}
