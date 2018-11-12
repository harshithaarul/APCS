import java.io.*;
import java.util.*;
public class CountWords {
public static void main(String[] args)
throws FileNotFoundException {
Scanner input = new Scanner(System.in);
String filename = input.nextLine();
Scanner c = new Scanner( new File(filename));

int count = 0;
while (c.hasNext()) {
String word = c.next();
count++;
 }
System.out.println("Total words = " + count);
 }
 }
