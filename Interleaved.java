import java.util.*;

public class Interleaved { 

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	System.out.println();
	System.out.println("Please enter a sequence of integers separated");
	System.out.println("by spaces. End the sequence with the sentinel");
	System.out.println("value 0, followed by a return.");
	System.out.println();

	while (true) {
		int s = scan.nextInt();
		if (s == 0) {
			break;
		}
		list1.add(s);
	}
	System.out.println("Your first list: " + list1);
	System.out.println();

	System.out.println("Please enter a sequence of integers separated");
	System.out.println("by spaces. End the sequence with the sentinel");
	System.out.println("value 0, followed by a return.");
	System.out.println();

	while (true) {
		int s = scan.nextInt();
		if (s == 0) {
			break;
		}
		list2.add(s);
	}
	System.out.println("Your second list: " + list2);
	System.out.println();

	System.out.println("Your interleaved list: " + inter(list1, list2));
}

public static List inter(ArrayList<Integer> list1, ArrayList<Integer> list2) {
    int times = Math.min(list1.size(), list2.size());
    int i;

    for (i = 0; i < times; i++) {
        int num = list2.get(i);
        list1.add(2 * i + 1, num);
    }

    if (i < list2.size()) {
        for (int j = i; j < list2.size(); j++) {
            list1.add(list2.get(j));
        }
    }
    return list1;
}
}
