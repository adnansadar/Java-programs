/**Ex:18=1+8=9
 * 18%9=0 Thus 18 is a harshad number.
 */
import java.io.*;
class Harshad_number
{
    public static void main (String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter a number");
        n=Integer.parseInt(in.readLine());
        int c=n,sum=0;int d;
        while(c>0)
        {
            d=c%10;
            sum=sum+d;
            c=c/10;
        }
        if(n%sum==0)

            System.out.println("It is a harshad number.");
        else
            System.out.println("It is not a harshad number.");
    }
}

