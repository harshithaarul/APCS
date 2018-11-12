import java.util.*;
public class collatz{
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    System.out.print("Enter number of terms followed by terms: ");
  //  int num = console.nextInt();


    int[] a = new int[num1];
    int greatest = 0;
    for(int j =0; j <= time-1; j++){
        int num = console.nextInt();
        System.out.println(babe(a));
        num1[j]=babe(a);
        if(num1[j]>greatest){
          greatest = num1[j];
        }
      }
      System.out.print("Longest: ");
      System.out.println(greatest);
    function(num);

  }
  public static int function (int num){
    while (num > 1) {
      if((num%2)==0) {
        num = num/2;


      }else {
      num = ((3*num)+1);


      }
  System.out.println(num);
    }
    return num;
}

}
