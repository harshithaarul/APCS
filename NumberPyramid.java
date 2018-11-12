import java.util.*;
import java.lang.*;

public class NumberPyramid {
private int rowIndex = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long input = 0;
		String strInput = "";
		int preceZeroCount = 0;
		int[] digitCount = new int[10];
		for (int i = 0; i < 10; i++)
			digitCount[i] = 0;
		while (true) {
			try {
				Scanner userInput = new Scanner(System.in);
				strInput = userInput.next();
				input = Long.parseLong(strInput);
				if(input>=0) {
					System.out.println("Enter an integer <= 10 digits long: 0. " + strInput);
					break;
				}
				else {
					System.out.print("Enter an integer <= 10 digits long: Invalid input. Please enter valid input.");
					System.out.println();
				}
			} catch (NumberFormatException a) {
				System.out.print("Enter an integer <= 10 digits long: Invalid input. Please enter valid input.");
				System.out.println();

			}
		}
		int diffInIndexes = 0;
		int diffCount = 0;
		int index = 0;
		int rptStartIndex = 0;
		boolean rptEnd = false;
		boolean rptStart = false;
		String[] rows = new String[100];
		NumberPyramid np = new NumberPyramid();
		while (index <100 && !rptEnd){
			rows[index] = np.printRow(strInput);
			strInput = rows[index];
			for (int i =1 ; i< index;i++){
				if(rows[i].equals(strInput)){
					if(!rptStart)
					{
						rptStartIndex = i+1;
						diffInIndexes = index-i;
					}
					rptStart = true;
					diffCount++;
					if(diffCount==diffInIndexes) {
						System.out.println("Repeating pattern detected starting at index " + rptStartIndex + ".");
						System.out.println("The repeating pattern is "+diffCount+" step(s) long.");
						rptEnd = true;
						break;
					}
				}
			}
			index++;

		}



	}
	public String printRow(String strInput){
		int[] digitCount = new int[10];
		for (int i = 0; i < 10; i++)
			digitCount[i] = 0;

		for (int j = 0; j < strInput.length(); j++) {
			char ch = strInput.charAt(j);
			if ((ch >= 48) && (ch <= 57)) {
				digitCount[ch - 48]++;
			} else {
				// incorrect input
			}

		}
		int nsLength = 0;
		int[] newSeries = new int[10];
		int[] newSeries1 = new int [10];
		for (int i = 0; i < 10; i++) {
			if (digitCount[i] > 0)
				newSeries[i] = (digitCount[i] * 10) + i;
			else
				newSeries[i] = 0;
			//System.out.println(newSeries[i]);
		}
		for (int i = 1; i<10;i++){
			if (newSeries[i] != 0){
				newSeries1[nsLength] = newSeries[i];
				nsLength++;
			}
		}
		if (newSeries[0] != 0){
			newSeries1[nsLength] = newSeries[0];
			nsLength++;
		}
		String newRow ="";
		System.out.print(rowIndex +". ");
		for (int i = 0; i< nsLength; i++){
			if(i<nsLength-1) System.out.print(newSeries1[i]+ ", ");
			else System.out.println(newSeries1[i]);
			newRow = newRow + newSeries1[i];
		}
		rowIndex++;
		return newRow;

	}

}
