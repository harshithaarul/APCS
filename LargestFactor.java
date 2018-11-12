import java.util.*;
public class LargestFactor{
  public static void main (String[] args){
    Scanner console = new Scanner(System.in);
    int n = console.nextInt();
    //answer (n);

//  public static int answer(int n){
    int factor = n - 1;
   while (factor > 0){
     if (n % factor == 0){
       System.out.println(factor);
       break;
       //factor--;
     } else {
       factor--;
      }
     }
   }
  }
  // public static void main(String[] args){
  //   Scanner scan = new Scanner(System.in);
  //   int input = scan.nextInt();
  //   int number = 0;
  //   for (int i = 2; i<input; i++){
  //     int quotient = input/i;
  //     number++;
  //     do {
  //       if (quotient%i==0){
  //         quotient= quotient/i;
  //         number++;
  //         System.out.println(i+" to the power of" + number);
  //       }
  //    } while (quotient%i==0);
  //
  //   }
  // }
