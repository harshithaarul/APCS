import java.util.*;

public class Primes1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int n = x;
		System.out.print("Enter positive integer: ");
		while (prim(x) == false) {
            x--;
        }
        System.out.println(x);
        int i;
        for (i = 2; i <= n; i++) {
            if (n % i == 0) {
                n /= i;
                i--;

            }

        }

        System.out.println(i);

	}
	public static boolean prim(int m) {
        int n=m;
        for (int i = 2; i < n; i++) {
            if ( n % i == 0) {
                return false;
            }

        }
				
        return true;
    }
}
