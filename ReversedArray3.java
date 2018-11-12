import java.util.*;
public class ReversedArray3 {
  public static void main (String[] args){
    Scanner console = new Scanner (System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> originalList = new ArrayList<Integer>();
    ArrayList<Integer> clumpedList = new ArrayList<Integer>();
    ArrayList<Integer> clumpedList1 = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
    System.out.println();
		System.out.println ("Please enter a sequence of integers separated\nby spaces. End the sequence with the sentinel\nvalue 0, followed by a return.\n");
    while (console.hasNextInt()) {
			int name = console.nextInt();
			originalList.add(name);
			int temp = name;
			if (!clumpedList.contains(temp)) {
			    clumpedList.add(temp);
				list.add(name);
				if (list.get(i) == 0) {
					list.remove(i);
					originalList.remove(j);
					break;
				}
				i++;
			}
			j++;
		}
    System.out.println ("Your original list: " + originalList);
    System.out.println();
      for (int x = 0; x <originalList.size()-2; x = x+3){
        int first = originalList.get(x);
        int third = originalList.get(x+2);
        originalList.set(x,third);
        originalList.set(x+2,first);
      }
    System.out.println ("Your reversed3 list: " + originalList);
    }
  }
