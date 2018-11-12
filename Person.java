import java.io.*;
import java.util.*;

public class Person{
    String name;
    int age;
    double weight;
    
    public Person() {
        
    }
    
    public Person(String newname, int newage, double newweight){
        name = newname;
        age = newage;
        weight = newweight;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public String toString(){
        String newString = name + " " + age + " " + weight;
        return newString;
    }
    
    
}