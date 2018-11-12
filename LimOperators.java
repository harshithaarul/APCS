import java.util.*; //for scanner

public class LimOperators {
	public static void main(String[] args) {
		
		int a1, a2;

		System.out.println("Enter two positive integers: ");
		Scanner console = new Scanner(System.in);
		a1 = console.nextInt();
		a2 = console.nextInt();

		System.out.println("sum: " + add(a1, a2));
		System.out.println("difference: " + subtract(a1, a2));
		System.out.println("quotient: " + divide(a1, a2));
		System.out.println("remainder: " + modulus(a1, a2));
	}

	//output equivalents of x + y
	public static int add (int x, int y){
		for ( int i = 0; i<y ; i++){
			x++;
		}
		return x;
	}

	//output equivalents of x - y
	public static int subtract (int x, int y){
		for ( int i = 0; i<y ; i++){
			x--;
		}
		return x;
	}

	// //output equivalents of x / y
	public static int divide (int x, int y){
		for ( int i =0; x>0; i++){
			int diff = subtract (x, y);
			if (diff==0){
				return ++i;
			} if (diff<0){
				return i;
			}
			x=diff;
		}
		return 0;
	}
	
	//output equivalents of x % y
	public static int modulus (int x, int y){
		for ( int i = 0; x>y; i++){
			int diff = subtract (x, y);
			x=diff;
		}
		return x;
	}
}