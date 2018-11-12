
    import java.util.*;
public class RemoveDuplicates {
	public static void main (String[] args) {
		Scanner console = new Scanner (System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> originalList = new ArrayList<String>();
		ArrayList<String> compareList = new ArrayList<String>();
		int i = 0;
		int j = 0;
		System.out.println();
		System.out.println ("Please enter an alphabetical sequence of strings separated");
		System.out.println ("by spaces. The end of the sequence must be signified using");
		System.out.println ("the sentinel value lastString, followed by a return.");
		System.out.println();
		System.out.println();
		while (console.hasNext()) {
			String name = console.next();
			originalList.add(name);
			String temp = name.toLowerCase();
			if (!compareList.contains(temp)) {
			    compareList.add(temp);
				list.add(name);
				if (list.get(i).equals("lastString")) {
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
		System.out.println ("Your list with duplicates removed: " + list);
		System.out.println();
	}
}
