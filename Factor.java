import java.util.*;

public class Factor {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int num = c.nextInt();
		printFactors(num);
		calcNumFactors(num);
	}
	public static void calcNumFactors(int num) {
		int count = 0;
		for (int i=1;i<=num;i++) {
			int tempcount=0;
			if(num%i==0) {
				count++;
			}

		}
		System.out.println("Number of factors: " + count);
	}

	public static void printFactors(int num) {
        for (int factor = 2; factor <= num; factor++) {
            int exp = 0;
            while (num % factor == 0) {
                num /= factor;
                exp++;
            }
            if (exp > 0) {
                System.out.println(factor+ " to the power of " + exp);
            }
        }
    }
}
