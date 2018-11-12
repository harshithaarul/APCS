import java.util.*;
public class LCM_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter positive integer a: ");
		int num1 = input.nextInt();
		System.out.print("Please enter positive integer b: ");
		int num2 = input.nextInt();
		int LCM = 0;
		int largest =0;
		if (num1 > num2){
			largest = num1;
		} else{
			largest = num2;
		}
		for (int i = largest+1; i<=(num1*num2);i++){
			if (i%num1==0 && i%num2==0){
				LCM = i;
				break;
			}
		}
		System.out.print("LCM = "+ LCM);
		System.out.println();
		int GCD =0;
		for(int i = 1; i <= num1 && i <= num2; i++){
            if(num1 % i==0 && num2 % i==0)
                GCD = i;
        }
		System.out.println("GCD = "+ GCD);
		boolean quotient = false;
		if ((LCM * GCD) == (num1 * num2))
			quotient = true;
		System.out.println("(LCM * GCD) == (a * b): " + quotient);
	}

}
