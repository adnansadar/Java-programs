import java.io.*;
public class Prime_Number
{
    public static void main(String args[])throws IOException
    {
        int num,i,s=0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        num=Integer.parseInt(in.readLine());
        for(i=1;i<=num;i++)
            if(num%i==0)
                s=s+1;
        {
            if (s==2)
                System.out.println(num+" is a prime number. ");
            else
                System.out.println(num+" is not a prime number. ");
        }
    }
}

      