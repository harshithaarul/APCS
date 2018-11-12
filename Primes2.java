import java.util.*;
public class Primes2{
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int input = scan.nextInt();
      System.out.println(leastPrime(input));
      System.out.println(greatPrime(input));
      System.out.println(largestPrimeFactor(input));

  }
  public static boolean isPrime(int n) {
      //check if n is a multiple of 2
      if (n==2) return true;
      if (n%2==0) return false;
      //if not, then just check the odds
      for(int i=3;i*i<=n;i+=2) {
          if(n%i==0)
              return false;
      }
      return true;
  }
  public static int largestPrimeFactor(int number) {
        int i;

        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }

        return i;
    }
  public static int leastPrime(int number){
    int prime1;
    for(int i=number;;i--){
      if(isPrime(i)){
        prime1=i;
        break;
      }
    }
    return prime1;
  }
  public static int greatPrime(int number){
    int prime2;
    for(int i=number;;i++){
      if(isPrime(i)){
        prime2=i;
        break;
      }
    }
    return prime2;
  }
}
