import java.util.*;
public class fencepost{
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    String s = console.next();
    System.out.print(s.charAt(0));
    for (int i =1; i<s.length(); i++){
      System.out.print(".." + s.charAt(i));

      if (i== (s.length()-1)){
        break;

      }
      }
      System.out.println();
    }
  }
