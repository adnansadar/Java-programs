/**It is a number which is a product of two consecutive integers
 * i.e. n(n+1).Ex:0,2,6,12,20,30,42,56,72....
 */
import java .io.*;
class Pronic_number
{
    public static void main (String args[])throws IOException
    {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number:");
        int n=Integer.parseInt(in.readLine());
        int flag=0;
        for(int i=0;i<=n;i++)
        {
            if((i*(i+1)==n))
                flag=1;
        }
        if(flag==1)
            System.out.println("It is a pronic number.");
        else
            System.out.println("It is not a pronic number.");
    }
}