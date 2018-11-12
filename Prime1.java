import java.util.*;
public class Prime1{
  public static void main (String[] args){
    Scanner console = new Scanner(System.in);
    int x = console.nextInt();
       isPrime(x);

}

      public static boolean isPrime(int x){
        for (int i = x; i <1;i--){
          if (x%2==0) {
            return false;
          }
          System.out.println(x);
          return true;
        }
        return true;
      }
      public static int biggest (int x){
      int biggest=0;
      for(int i=2; i<=x; i++){
          for(int l=1; l<=Math.sqrt(i); l++){
              if(l%i==0){
                  break;
              } else{
                  while(x%i==0){
                      x=x/i;
                      biggest =i;
                  }
              }
          }
      }
      System.out.println(biggest);
  }
    }
  
