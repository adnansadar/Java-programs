package Recurring;

import java.io.*;
class Power
{
    int pow(int x,int n)
    {
        if(n==0)
            return(1);
        else
            return(x*pow(x,n-1));
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        Power ob=new Power();
        int y,m;
        System.out.println("Enter the value of y:");
        y=Integer.parseInt(in.readLine());
        System.out.println("Enter the value of m:");
        m=Integer.parseInt(in.readLine());
        System.out.println("The value of y^m is: "+ ob.pow(y,m));
    }
}