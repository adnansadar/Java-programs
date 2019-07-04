package Practice;

import java.io.*;
class Prime_Factors
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int f=0,j;
        int c=0;
        int i;
        System.out.println("Enter a number:");
        num=Integer.parseInt(in.readLine());
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                for(j=1;j<=i;j++)
                {
                    i=f;
                    if(f%j==0)
                        c=c+1;
                }
            }
            else
                i++;
        }
        if(c==2)
        {
            System.out.println("The prime factors:"+f);
        }
    }
}
