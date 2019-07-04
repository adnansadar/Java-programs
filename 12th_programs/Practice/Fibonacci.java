package Practice;

import java.io.*;
class Fibonacci
{
    public static void main (String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num1=0,num2=1,num3=0;
        int i=2;
        System.out.println("Enter count:");
        int count=Integer.parseInt(in.readLine());
        System.out.println("Fibonacci Series:\n"+num1);
        while(i<=count)
        {
            num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
            i++;
        }
    }
}

        
        