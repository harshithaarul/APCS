import java.util.*;
 public class Interleave{
   public static void main (String[] args){
     Scanner console = new Scanner (System.in);
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    ArrayList<Integer> interleavedList = new ArrayList<Integer>();
    int i = 0;
    int j = 0;
     System.out.println();
    System.out.println ("Please enter a sequence of integers separated\nby spaces. End the sequence with the sentinel\nvalue 0, followed by a return.\n");
     while (console.hasNext()) {
      int name = console.nextInt();
      list1.add(name);
      int temp = name;
      int a = 0;
      if (!list1.contains(temp)) {
          list1.add(temp);
        list1.add(name);
        if (list1.get(i).equals("0")) {
          list1.remove(i);
          list1.remove(j);
          break;
        }
        i++;
      }
      j++;
    }
    System.out.println ("Your first list: " + list1);
    System.out.println();
   System.out.println ("Please enter a sequence of integers separated\nby spaces. End the sequence with the sentinel\nvalue 0, followed by a return.\n");
   Scanner console1 = new Scanner (System.in);
    while (console1.hasNext()) {
     int name1 = console1.nextInt();
     list2.add(name1);
     int temp = name1;
     if (!list2.contains(temp)) {
         list2.add(temp);
       list2.add(name1);
       if (list2.get(i).equals("0")) {
         list2.remove(i);
         list2.remove(j);
         break;
       }
       i++;
     }
     j++;
   }
   int size;
       if(list1.size()>=list2.size()){size = list1.size();}
       else{size=list2.size();}
       for(int b = 0; b < size; b++){
           if(b<list1.size()){
               interleavedList.add(list1.get(b));
           }
           if(b<list2.size()){
               interleavedList.add(list2.get(b));
           }
       }

    System.out.println ("Your second list: " + list2);
    System.out.println();
    System.out.println ("Your interleaved list: " + interleavedList);
   }
 }
