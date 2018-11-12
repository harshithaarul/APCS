import java.util.*;
public class Hogwarts{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int lenOfArray = input.nextInt();
    int list[] = new int [lenOfArray];
    int newList[] = new int [lenOfArray+1];
    for (int i =0; i< lenOfArray;i++){
      list[i] = input.nextInt();
    }
    int newIndex = 0;
    int newIndex1 = 1;
    for (int i =0; i<(lenOfArray);i+=8){
       int tempNo2 = list[i+1];
       int tempNo3 = list[i+2];
       list[i+1] = list[i+2];
       list[i+2] = tempNo2;
       if(i+4<lenOfArray){
    	   newList [newIndex] = list[i]+list[i+5]+list[i+6]+list[i+3];
    	   newList [newIndex1] = list[i+4]+list[i+1]+list[i+2]+list[i+7];
           System.out.print((char)(newList[newIndex]));
           System.out.print((char)(newList[newIndex1]));
           newIndex++;
           newIndex1 = newIndex+1;
      }
       else
       {
    	   newList [newIndex] = list[i]+list[i+1]+list[i+2]+list[i+3];
           System.out.print((char)(newList[newIndex]));
       }
    }

    System.out.println();
  }
}
