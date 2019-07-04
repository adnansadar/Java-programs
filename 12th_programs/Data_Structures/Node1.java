package Data_Structures;

import java.io.*;
class Node1
{
    int data;
    Node1 link;
    public Node1()/**default constructor*/
    {
        data=0;
        link=null;
    }
    Node1 ptr,start;/**work as reference pointers*/
    Node1 temp;
    void create()throws IOException
    {
        int n;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first data:");
        this.data=Integer.parseInt(in.readLine());/**accept value in data part*/
        ptr=this;/**ptr points to the new node*/
        start=ptr;
        char ins='y';/**let start point to wherever ptr is pointing*/
        do
        {
            System.out.println("Want to insert another Node:");
            ins=(char)in.read();
            in.read();
            if(ins=='y')
            {
                temp=new Node1();
                System.out.println("Enter next data:");
                temp.data=Integer.parseInt(in.readLine());
                temp.link=null;
                ptr.link=temp;/**wherever ptr is pointing*/
                temp=null;/**free the Node temp*/
                ptr=ptr.link;/**wherever ptr is pointing right now*/
            }
        }while(ins=='y');
    }

    void insertbeg(int x)/**Inserting a list in the beggining*/
    {
        Node1 temp=new Node1();
        temp.data=x;
        temp.link=start;
        start=temp;
        temp=null;
    }

    void insertend(int x)
    {
        Node1 temp=new Node1();
        temp.data=x;
        temp.link=null;
        Node1 ptr=start;
        while(ptr.link !=null)
            ptr=ptr.link;
        ptr.link=temp;
        temp=null;
        ptr=null;
    }

    void insertmid(int x,int p)
    {
        Node1 temp=new Node1();
        temp.data=x;
        temp.link=null;
        ptr=start;
        int c=1;
        while(c<p)
        {
            ptr=ptr.link;
            c++;
        }
        temp.link=ptr.link;
        ptr.link=temp;;
        temp=null;
    }

    void deletenode(int n)
    {
        Node1 ptr=start;
        Node1 ptr1=ptr;
        int c=1;
        while(c<n)
        {
            ptr1=ptr;
            ptr=ptr.link;
            c++;
        }
        ptr1.link=ptr.link;
        ptr.link=null;
        ptr=null;
        ptr1=null;
    }

    void display()
    {
        Node1 ptr=start;
        while(ptr !=null)
        {
            {
                System.out.println(ptr.data);
                ptr=ptr.link;
            }
        }
    }

    public static void main(String args[])throws IOException
    {
        int k,p,ch;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Node1 first = new Node1();
        Node1 abc=new Node1();
        do
        {
            System.out.println("\t\t MAIN MENU:");
            System.out.println("1.Create a linked list structure");
            System.out.println("2.Insert a list in the beggining");
            System.out.println("3.Insert a list in the end");
            System.out.println("4.Insert a list in the middle");
            System.out.println("5.Delete a list from the Linked List");
            System.out.println("6.Display");
            System.out.println("7.Exit");
            System.out.println("Enter your choice");
            ch=Integer.parseInt(in.readLine());
            switch(ch)
            {
                case 1:
                first.create();
                break;
                case 2:
                System.out.println("Enter data for the new Node");
                k=Integer.parseInt(in.readLine());
                first.insertbeg(first,k);
                break;
                case 3:
                System.out.println("Enter data for the new Node");
                k=Integer.parseInt(in.readLine());
                first.insertend(first,k);
                break;
                case 4:
                System.out.println("Enter data for the new Node");
                k=Integer.parseInt(in.readLine());
                System.out.println("Enter node number after which node is to be inserted");
                p=Integer.parseInt(in.readLine());
                first.insertmid(first,k,p);
                break;
                case 5:
                System.out.println("Enter node number to be deleted");
                k=Integer.parseInt(in.readLine());
                first.delete(first,k);
                break;
                case 6:
                System.out.println("Data in the linked list are:");
                first.display();
                break;
                case 7:
                System.out.println("You chose to exit");
                break;
                default:
                System.out.println("Wrong choice.Select from the given menu.");
            }
        }while(ch!=7);
    }
}
