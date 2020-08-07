package ThirdYear;
import java.util.*;

public class Lists
{
    public static void main(String args[])
    {
        List <Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(2);
        list1.add(1);
        list1.add(15);
        list1.set(2,30);
        System.out.println(list1);
        Collections.sort(list1);   
        System.out.println("After sorting: "+list1);
        list1.set(2,30);
        list1.remove(3);
        System.out.println("After removing 3rd index: "+list1);
        System.out.println("Element at 3rd position: "+list1.get(2));
        System.out.println("Size: "+list1.size());
        System.out.println("Contains 30?: " +list1.contains(30));
        System.out.println("Index of 30: "+list1.indexOf(30));
        System.out.println("Is list1 empty? " +list1.isEmpty());
    }
}
