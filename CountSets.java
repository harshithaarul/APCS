import java.util.*;

public class CountSets{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int list[] = new int[number];
        for (int i = 0 ; i < list.length; i++ ) {
           list[i] = console.nextInt();
        }
        int sets = counting(list);
        System.out.println(sets);
    }

    public static int counting(int[] list){
        int n = list.length;
        int sets = 0;
        for (int i = 0; i < n-1; i++) {
            if(list[i] == list[i+1]){
                sets++;
                if (i <n-2) {
                    while(list[i] == list[i+1]) {
                        i++;
                    }
                }
            }
        }
        return sets;
    }
}
