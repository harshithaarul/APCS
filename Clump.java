import java.util.*;
public class Clump {
  public static void main (String[] args){
    Scanner console = new Scanner (System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> originalList = new ArrayList<String>();
    ArrayList<String> clumpedList = new ArrayList<String>();
    ArrayList<String> clumpedList1 = new ArrayList<String>();
		int i = 0;
		int j = 0;
    System.out.println();
		System.out.println ("Please enter a sequence of strings separated\nby spaces. End the sequence with the sentinel\nvalue \"stop\", followed by a return.\n");
    while (console.hasNext()) {
			String name = console.next();
			originalList.add(name);
			String temp = name;
			if (!clumpedList.contains(temp)) {
			    clumpedList.add(temp);
				list.add(name);
				if (list.get(i).equals("stop")) {
					list.remove(i);
					originalList.remove(j);
					break;
				}
				i++;
			}
			j++;
		}
    int mod = originalList.size()%2;
    if (mod ==0){
      for (int x = 0; x <originalList.size()-1; x = x+2){
        String first = originalList.get(x);
        String second = originalList.get(x+1);
        String total = "(" + first + " " + second + ")";
        clumpedList1.add(total);
      }
    } else if (originalList.size()%2 ==1) {
          for (int x = 0; x <originalList.size()-1; x = x+2){
          String first = originalList.get(x);
          String second = originalList.get(x+1);
          String total = "(" + first + " " + second + ")";
          clumpedList1.add(total);
      }
      String last = originalList.get(originalList.size() - 1);
      clumpedList1.add(last);
    }
		System.out.println ("Your original list: " + originalList);
		System.out.println();
		System.out.println ("Your clumped list: " + clumpedList1);
  }
}
