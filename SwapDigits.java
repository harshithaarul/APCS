import java.util.Scanner;
public class SwapDigits {


	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int digits = Integer.parseInt(scan.nextLine());

		//Create a string array to store the names of your friends
		int arrayOfDigits[] = new int[digits];
		if(arrayOfDigits.length%2==0){
			for(int i = 0; i<(arrayOfDigits.length/2);i++){
				int one = arrayOfDigits[0];
				int two = arrayOfDigits[1];
				System.out.print(two + one);
				break;
			}

		}
		// for (int i = 0; i < arrayOfDigits.length; i++) {
		// 	System.out.print("Enter the name of friend " + (i+1) + " : ");
		//         arrayOfNames[i] = scan.nextLine();
		// }
		//
		// //Now show your friend's name one by one
		// for (int i = 0; i < arrayOfNames.length; i++) {
		// 	System.out.print("My friend " + (i+1) + " : ");
		//         System.out.print(arrayOfNames[i] + "\n");
		// }




	}

}
