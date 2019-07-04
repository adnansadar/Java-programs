package Journal;

import java.io.*;
import java.util.*;
public class Node
{
    int data;
    Node link;
    public Node()
    {
        data=0;
        link= null;
    }
    Node ptr,start;
    Node temp;
    void create()throws IOException
    {
        int n;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first data");
        this.data= Integer.parseInt(br.readLine());
        ptr=this;
        start= ptr;
        char ins='y';
        do
        {
            System.out.println("Do you want to insert another node?");
            ins= (char)br.read();
            br.read();
            if(ins=='y')
            {
                temp= new Node();
                System.out.println("Enter next data");
                temp.data = Integer.parseInt(br.readLine());
                temp.link= null;
                ptr.link= temp;
                temp= null;
                ptr=ptr.link;
            }
        }while(ins=='y');
    }
    void display()
    {
        Node ptr= start;
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr= ptr.link;
  }
    }
    public static void main(String args[])throws IOException
    {
        int ch;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Node first =new Node();
        do
        {
            System.out.println("Main Menu");
            System.out.println("1. To create a linked list structure");
            System.out.println("   Or to insert in a linked list structure");
            System.out.println("2. Display linked list");
            System.out.println("3. Exit");
            System.out.println("Enter Your Choice");
            ch= Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                first.create();
                break;
                
                case 2:
                System.out.println("Data in the linked list are:");
                first.display();
                break;
                
                case 3:
                System.out.println("You chose to exit.");
                break;
                
                default:
                System.out.println("Enter an option from the given menu");
            }
        }while(ch!=3);
    }
}
