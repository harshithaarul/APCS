import java.util.Scanner;

public class ParanthesesChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int level = 1;
		boolean matchesFound = true;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your string below:");
		String prs = console.next();
		//System.out.println(prs);
		for(level=1;level<100;level++){
			String regExpToFind = "\\(\\)";
			prs = prs.replaceAll(regExpToFind,"");
			//System.out.println(prs);
			int firstOcc = prs.indexOf("()");
			if(firstOcc == -1 && prs.length()>0) {
				matchesFound = false;
				break;
			}

			if(prs.length()<=0) {
				matchesFound = true;
				break;
			}
		}
		System.out.println(((Boolean)matchesFound).toString());
		if(matchesFound) System.out.println(level);
		console.close();
	}

}
