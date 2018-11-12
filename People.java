import java.io.*;
import java.util.*;

public class People{
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<Person> People = new ArrayList<Person>();
        String last = "stop";
        String a ="";
        String b ="" ;
        String c ="";
        while(console.hasNext()){
            String temp = console.nextLine();
            // System.out.println(temp);
            if (temp.equals(last)){
                break;
            }
            int first = 0;
            int second = 0;
            for(int i = 0; i< temp.length(); i++){
                if(temp.charAt(i) == ' '){
                    if(first != 0){
                        second = i;
                    }else{
                        first = i;
                    }
                }
            }
            a = temp.substring(0,first);
            b = temp.substring(first+1,second);
            c = temp.substring(second+1,temp.length());
            Integer d = Integer.parseInt(b);
            double e = Double.parseDouble(c);
            // System.out.print(a);
            // System.out.println(b);
            // System.out.println(c);
            // System.out.print(d);
            // System.out.println(e);
            // Person p1 = new Person(a,b,c);
            People.add(new Person(a,d,e));
        }

        for(int i =0; i< People.size(); i++){
            String name = People.get(i).getName();
            int age = People.get(i).getAge();
            double weight = People.get(i).getWeight();
            System.out.println(name+" "+age+" "+weight);
        }
    }
}
