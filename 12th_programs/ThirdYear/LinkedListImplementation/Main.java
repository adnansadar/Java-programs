package ThirdYear.LinkedListImplementation;

class Node
{
    int data;
    Node next;
}

public class Main
{
    public static void main(String args[])
    {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(12);
        list.insert(43);
        list.insert(2);
        list.show();
    }
}

class LinkedList
{
    Node head;
    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;     
        if(head==null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    
    public void show()
    {
        System.out.println("The Linked List: ");
        Node temp = head;
        while(temp.next!= null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp.data+"->NULL");
    }
}
