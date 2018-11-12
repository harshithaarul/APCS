import java.util.*;
public class ASCII{
  public static void main (String[] args){
    Scanner console = new Scanner(System.in);
    System.out.print("Enter string: ");
    String word = console.next();
    MaxChar(word);
    inorder(word);

  }
  public static char MaxChar (String word){
  int value = 0;
  for (int i = 0; i< word.length(); i++){
    int ascii = word.charAt(i);
    if ( value < ascii){
      value = ascii;
    }
  }
  char  letter = (char)value;
    System.out.print("max char:     " + letter + "\n");
    return letter;
  }
    public static void inorder(String word){
      String str = word;
      char[] array1 = str.toCharArray();
      Arrays.sort(array1);
      System.out.print("in order:     " );
      System.out.println(array1);
    //  System.out.print("\n");
    }
  }
