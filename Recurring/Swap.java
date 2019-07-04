package Recurring;
//wrong
import java.io.*;
class Swap
{
    int a,b;
    Swap(int x,int y)
    {
        a=x;
        b=y;
        int t=a;
        a=b;
        b=t;
    }

    void display()
    {
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("a= "+a);
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        String str=in.readLine();
    }
}

    
    