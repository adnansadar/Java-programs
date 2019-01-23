import java.io.*;
public class Sum_of_digits
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num,a,s=0;
        System.out.println("Enter a number:");
        num=Integer.parseInt(in.readLine());
        while (num>0)
        {
            a=num%10;
            s=s+a;
            num=num/10;
        }
        System.out.println("The sum of the digits = " +s);
    }
}

      