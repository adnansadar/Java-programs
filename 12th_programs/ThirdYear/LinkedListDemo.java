package ThirdYear;
import java.util.*;

public class LinkedListDemo
{
    public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList<Integer>(); 
        list.add(9);
        list.add(2);
        list.add(56);
        list.add(34);
        for(int i:list)
        {
            System.out.println(i);
        }
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(12));
        System.out.println(list.indexOf(2));
        list.set(0,23);
        System.out.println(list);
        list.forEach(i->System.out.println(i));
        list.push(5);
        list.push(7);
        list.pop();
        LinkedList list2 = new LinkedList();
        list2 = (LinkedList)list.clone();
        System.out.println("List1 after pushing 5,7 and pop: "+list);
        System.out.println("List2: "+list2);
        System.out.println("Peek: "+list2.peek());
        System.out.println("PeekLast: "+list2.peekLast());
        System.out.println("Get: "+list2.get(1));
        Collections.reverse(list);
        System.out.println("Reversed List: "+list);
        Collections.sort(list);
        System.out.println("Sorted List: "+list);
    }
}
