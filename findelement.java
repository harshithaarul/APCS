import java.util.*;
public class findelement {
    public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      int number = console.nextInt();
      int[] myIntArray = new int[number];
      int sum = 0;
      for (int i = 0; i <number; i++){
        myIntArray[i] = console.nextInt();
         sum = sum + myIntArray[i];
      }
      System.out.print("Enter size of integer array: \nEnter n integers separated by spaces: \nThe sum of the elements in your list: ");
      System.out.print(sum);
      System.out.println();
    }
}
