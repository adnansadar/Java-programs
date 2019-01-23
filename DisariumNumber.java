/** Disarium Nos: Ex- 135 is a disarium no. as 1^1+3^2+5^3 = 135 
which is the original number thus it is a disarium no */ 
import java.io.*;
public class DisariumNumber
{
    public static void main (String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter a number");
        n=Integer.parseInt(in.readLine());
        int copy=n,d=0,sum=0;
        String s=Integer.toString(n);
        int len=s.length();
        while(copy>0)
        {
            d=copy%10;
            sum=sum+(int)Math.pow(d,len);
            len--;
            copy=copy/10;
        }
        if(sum==n)
            System.out.println("It is a disarium number");
        else
            System.out.println("It is not a disarium number");
    }
}