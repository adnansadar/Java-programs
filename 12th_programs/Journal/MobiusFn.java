package Journal;

import java.io.*;
public class MobiusFn
{
    int n;
    public MobiusFn()
    {
        // initialise instance variables
        n = 0;
    }

    void input()throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number .");
        n= Integer.parseInt(br.readLine());
    }

    int primeFac()
    {
        int a=n,i=2,m=0,c=0,f=0;
        while (a>1)
        {
            c=0;
            while(a%i ==0)
            {
                c++;
                f++;
                a=a/i;
            }
            i++;
            if(c>1)
                return (0);
        }
        return(f);
    }

    void display()
    {
        int mob,x;
        if(n==1)
            mob=1;
        else
        {
            x= primeFac();
            if(x==0)
                mob=0;
            else
                mob = (int)(Math.pow(-1,x));
        }
        System.out.println("Value of mobis function is "+ mob);
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        MobiusFn ob = new MobiusFn();
        ob.input();
        ob.display();
    }// end of main
} //end of class
