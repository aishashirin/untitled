package ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryMapSet {
    public static void main(String[] args) {
        HashMap <Integer,String> students = new HashMap<>();

        students.put(1,"Student1");
        students.put(2,"Student2");
        students.put(3,"Student3");

        Set<Map.Entry<Integer,String>> entrySet = students.entrySet();
        for(Map.Entry<Integer,String> entries : entrySet){
            System.out.println(entries.getKey() + " " + entries.getValue());

            if(entries.getKey().equals(1)){
                System.out.println("I am updating set entry with the key " + entries.getKey());
                entries.setValue("Studentn1");
            }
        }
        System.out.println("------------------");
        for(Map.Entry<Integer,String> entries : entrySet){
            System.out.println(entries.getKey() + " " + entries.getValue());}
        System.out.println(students.values().toString());
    }
    
}
